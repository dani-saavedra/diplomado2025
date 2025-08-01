package co.edu.unisabana.diplomado2025.patrones.creacional.factory;

public class Koopa implements Enemigo {

    private int vida;
    private int velocidad;
    private boolean tieneCaparazon;
    private String color;

    public Koopa(int vida, int velocidad, boolean tieneCaparazon, String color) {
        this.vida = vida;
        this.velocidad = velocidad;
        this.tieneCaparazon = tieneCaparazon;
        this.color = color;
    }

    @Override
    public void atacar() {

    }

    @Override
    public String getDescripcion() {
        return "Koopa{" +
                "vida=" + vida +
                ", velocidad=" + velocidad +
                ", tieneCaparazon=" + tieneCaparazon +
                ", color='" + color + '\'' +
                '}';
    }

}
