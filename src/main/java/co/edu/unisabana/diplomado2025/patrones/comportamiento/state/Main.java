package co.edu.unisabana.diplomado2025.patrones.comportamiento.state;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        System.out.println(pedido.getEstado());

        pedido.avanzarEstado();
        System.out.println(pedido.getEstado());

    }
}
