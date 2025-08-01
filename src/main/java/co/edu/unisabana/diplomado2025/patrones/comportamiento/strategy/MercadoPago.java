package co.edu.unisabana.diplomado2025.patrones.comportamiento.strategy;

public class MercadoPago implements Pago {
    @Override
    public void pagar(int monto) {
        System.out.println("Conectando con MercadoPago");
    }
}
