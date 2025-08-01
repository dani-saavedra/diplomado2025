package co.edu.unisabana.diplomado2025.patrones.estructural.proxy;

public class Internet implements Navegacion {
    @Override
    public String navegar(String url) {
        //Descargo el contenido y lo paso
        return "Obteniendo contenido de " + url;
    }
}
