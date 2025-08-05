package co.edu.unisabana.diplomado2025.patrones.comportamiento.state;

public class EstadoRadicado implements Estado {

    @Override
    public void avanzar(Pedido pedido) {
        //Lógica correspoindiente al radicado.

        pedido.setEstado(new EstadoCocinando());
    }
}
