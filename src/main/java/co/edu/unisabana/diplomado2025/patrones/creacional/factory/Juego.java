package co.edu.unisabana.diplomado2025.patrones.creacional.factory;

public class Juego {
    public static void main(String[] args) {

        FabricaEnemigo fabricaEnemigo = new MundoLavaFabrica();
        Enemigo enemigoDificil = fabricaEnemigo.crearEnemigo("facil");
        enemigoDificil.atacar();
        String descripcion = enemigoDificil.getDescripcion();
        System.out.println(descripcion);
    }
}
