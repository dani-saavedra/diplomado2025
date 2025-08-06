package co.edu.unisabana.diplomado2025.pruebas;

import co.edu.unisabana.diplomado2025.DIP.alto.Notificacion;


public class ProcesamientoPago {

    private Notificacion notification;
    private ImpuestosRepository repository;

    public ProcesamientoPago(Notificacion notification, ImpuestosRepository repository) {
        this.notification = notification;
        this.repository = repository;
    }

    public int calcularTarifa(String nombre, int monto) {
        ImpuestoORM impuestoORM = repository.consultarImpuesto(nombre);
        int tarifa;
        if (monto <= 0) {
            throw new IllegalArgumentException("el monto no puede ser 0");
        }
        if (monto < 10) {
            tarifa = 0;
        } else if (monto < 100) {
            tarifa = 10 + impuestoORM.getMonto();
        } else {
            tarifa = 20 + impuestoORM.getMonto();
        }
        notification.notificar("302", "mensaje " + monto);
        return tarifa;
    }

}
