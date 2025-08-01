package co.edu.unisabana.diplomado2025.patrones.comportamiento.strategy;

public class Main {

    public static void main(String[] args) {
        PagoContexto contexto = new PagoContexto(new TC());
        contexto.ejecutarPago(100);
    }
}
