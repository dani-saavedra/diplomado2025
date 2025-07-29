package co.edu.unisabana.diplomado2025.DIP.bajo;

import co.edu.unisabana.diplomado2025.DIP.alto.Notificacion;

public class AdapterMassivian implements Notificacion {

    public void notificar(String telefono, String mensaje) {
        System.out.println("Notificando con Massivian");
    }
}
