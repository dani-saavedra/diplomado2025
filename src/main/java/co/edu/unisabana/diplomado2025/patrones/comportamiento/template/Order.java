package co.edu.unisabana.diplomado2025.patrones.comportamiento.template;

public abstract class Order {

    public void atenderCliente() {
        tomarPedido();
        verificarDisponibilidad();
        preparPedido();
        calcularPrecio();
    }

    public void tomarPedido() {
        System.out.println("Tomando Pedido ");
    }

    abstract void preparPedido();

    public void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad en la base de datos ");

    }

    abstract void calcularPrecio();

}
