package co.edu.unisabana.diplomado2025.patrones.estructural.proxy;

public class Cliente {
    public static void main(String[] args) {

        Navegacion navegacion = new Proxy();
        String contenido = navegacion.navegar("xxx.com");
        System.out.println(contenido);
    }
}
