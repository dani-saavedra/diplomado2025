package co.edu.unisabana.diplomado2025.pruebas;

public class ProcesamientoPago {

    public int calcularTarifa(int monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("el monto no puede ser 0");
        }
        if (monto < 10) {
            return 0;
        } else if (monto >= 10 && monto < 100) {
            return 10;
        } else {
            return 20;
        }
    }
}
