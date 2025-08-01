package co.edu.unisabana.diplomado2025.patrones.creacional.factory;

public class MundoLavaFabrica implements FabricaEnemigo {
    @Override
    public Enemigo crearEnemigo(String dificultad) {
        switch (dificultad) {
            case "facil":
                return new Goomba(10, 2, true);
            case "mediano":
                return new Koopa(20, 10, true, "Azul");
            case "dificil":
                return new Koopa(100, 100, true, "Azul");
            default:
                throw new IllegalArgumentException("Dificultad incorrecta");
        }
    }
}
