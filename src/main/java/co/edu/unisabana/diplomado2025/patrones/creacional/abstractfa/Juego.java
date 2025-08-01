package co.edu.unisabana.diplomado2025.patrones.creacional.abstractfa;

public class Juego {

    /*
    Code smell -> Dead Code
         public void decorar(String tipoDecoracion) {
            if (tipoDecoracion.equals("Moderno")) {
                SillaModerno sillaModerno = new SillaModerno();
                SofaModerno sofaModerno = new SofaModerno();
            } else if (tipoDecoracion.equals("Victoriano")) {
                SillaVictoriana sillaVictoriana = new SillaVictoriana();
                SofaVictoriano sofaVictoriano = new SofaVictoriano();
            }
        }
     */
    public void crearJuego(AbstractFactory estiloJuego) {
        Goomba goomba = estiloJuego.crearGoomba();
        Koopa koopa = estiloJuego.crearKoopa();
        System.out.println(goomba);
        System.out.println(koopa);
    }

}
