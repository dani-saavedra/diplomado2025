package co.edu.unisabana.diplomado2025.patrones.creacional.factory;

public class Goomba implements Enemigo {
    private int vida;
    private int velocidad;

    public Goomba(int vida, int velocidad, boolean puedeVolar) {
        this.vida = vida;
        this.velocidad = velocidad;
        this.puedeVolar = puedeVolar;
    }

    private boolean puedeVolar;

    @Override
    public void atacar() {
        System.out.println("Atacando con poder " + vida * velocidad);
    }

    @Override
    public String getDescripcion() {
        return "Goomba{" +
                "vida=" + vida +
                ", velocidad=" + velocidad +
                ", puedeVolar=" + puedeVolar +
                '}';
    }

}
