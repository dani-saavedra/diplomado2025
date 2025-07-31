package co.edu.unisabana.diplomado2025.patrones.comportamiento.template;

public class OrderDessert extends Order {
    @Override
    void preparPedido() {
        System.out.println("Preparando quesillo");
    }

    @Override
    void calcularPrecio() {
        System.out.println("2000");
    }
}
