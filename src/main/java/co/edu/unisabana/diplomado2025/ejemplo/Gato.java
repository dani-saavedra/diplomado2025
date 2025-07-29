package co.edu.unisabana.diplomado2025.ejemplo;

public class Gato implements Animal {

    @Override
    public String emitirSonido() {
        return "Miau  miau";
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
