package co.edu.unisabana.diplomado2025.ejemplo;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Gato();
        emitirSonido(animal);
    }

    static void emitirSonido(Animal animal) {
        System.out.println(animal.emitirSonido());
    }
}
