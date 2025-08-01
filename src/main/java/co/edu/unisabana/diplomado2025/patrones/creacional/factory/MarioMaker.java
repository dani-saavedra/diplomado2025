package co.edu.unisabana.diplomado2025.patrones.creacional.factory;

public class MarioMaker {
    public static void main(String[] args) {

        Creator creator = new CreatorLava();
        Enemigo enemigoDificil = creator.crearEnemigo("facil");
        enemigoDificil.atacar();
        String descripcion = enemigoDificil.getDescripcion();
        System.out.println(descripcion);
    }
}
