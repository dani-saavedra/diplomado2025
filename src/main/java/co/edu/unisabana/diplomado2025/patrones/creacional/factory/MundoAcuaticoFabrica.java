package co.edu.unisabana.diplomado2025.patrones.creacional.factory;

public class MundoAcuaticoFabrica implements FabricaMundo {
    @Override
    public Enemigo crearEnemigo(String dificultad) {
        switch (dificultad) {
            case "facil":
                return new Goomba(10, 2, false);
            case "mediano":
                return new Koopa(20, 10, true, "rojo");
            case "dificil":
                return new Koopa(100, 100, true, "rojo");
            default:
                throw new IllegalArgumentException("Dificultad incorrecta");
        }
    }
}
