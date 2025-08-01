package co.edu.unisabana.diplomado2025.patrones.estructural.proxy;

public class Proxy implements Navegacion {

    Internet internet;

    public Proxy() {
        this.internet = new Internet();
    }

    @Override
    public String navegar(String url) {
        if (url.contains("juegos") || url.contains("xxx")) {
            throw new IllegalArgumentException("Sitios prohibidos, reportando al rector");
        }
        return internet.navegar(url);
    }
}
