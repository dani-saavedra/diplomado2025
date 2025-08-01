package co.edu.unisabana.diplomado2025.patrones.creacional.factory;

public class MarioMaker {
    public static void main(String[] args) {

        FabricaMundo fabricaMundo = new MundoLavaFabrica();
        Enemigo enemigoDificil = fabricaMundo.crearEnemigo("facil");
        enemigoDificil.atacar();
        String descripcion = enemigoDificil.getDescripcion();
        System.out.println(descripcion);
    }
}
