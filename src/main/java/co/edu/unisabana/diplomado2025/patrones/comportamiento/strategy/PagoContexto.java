package co.edu.unisabana.diplomado2025.patrones.comportamiento.strategy;


public class PagoContexto {

    //datos de pago
    private Pago modoPago;


    public PagoContexto(Pago modoPago) {
        this.modoPago = modoPago;
    }

    public void ejecutarPago(int monto) {
        //Otra lógica necesaria para ejecutar el pago
        modoPago.pagar(monto);
    }
}
