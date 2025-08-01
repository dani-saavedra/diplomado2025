package co.edu.unisabana.diplomado2025.patrones.creacional.abstractfa;

public class Main {


    public static void main(String[] args) {
        Juego juego = new Juego();
        //decorador.decorar("Moderno");
        juego.crearJuego(new FabricaModerna());
    }
}
