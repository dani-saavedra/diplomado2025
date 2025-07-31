package co.edu.unisabana.diplomado2025.patrones.comportamiento.template;

public class OrderBeverage extends Order {
    @Override
    void preparPedido() {
        System.out.println("Preparando juguito de banano");
    }

    @Override
    void calcularPrecio() {
        System.out.println("Jugito de banano vale 1000");
    }
}
