package co.edu.unisabana.diplomado2025.patrones.comportamiento.template;

public class OrderFood extends Order {
    @Override
    void preparPedido() {
        System.out.println("Pasta carbonara");
    }

    @Override
    void calcularPrecio() {
        System.out.println("5000");
    }
}
