package co.edu.unisabana.diplomado2025.patrones.comportamiento.state;

public class Pedido {

    private Estado estado;

    public Pedido() {
        this.estado = new EstadoRadicado();
    }

    public void avanzarEstado() {
        estado.avanzar(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /*
    private String estado;


    public void avanzarEstado() {
        if (estado.equals("Creado")) {
            //Notificacion Rest a  la cocina
            //Guardamos en base de datos
            estado = "Cocinando";
        } else if (estado.equals("Cocinando")) {
            //Calcular el tiempo de entrega
            //Notificar al cliente pedido en camino
            // Facturar
            //Pagar al proveedor (Cocina)
            estado = "Delivery";
        } else if (estado.equals("Delivery")) {
            //Cobro al usuario
            //Notificar pedido entregado
            //
            estado = "Finalizado";
        }
    }

     */
}
