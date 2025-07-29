package co.edu.unisabana.diplomado2025.solid;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int variable = 20;
        Carro mercedez = new Mercedez();
        Carro bmw = new Bmw();
        List<Carro> carros = List.of(mercedez, bmw);
        verPrecios(carros);
        System.out.println(variable);

    }

    static void verPrecios(List<Carro> carroList) {
        for (Carro carro : carroList) {
            System.out.println(carro.precio());
        }
    }

    static void puertas(List<Carro> carroList) {
        for (Carro carro : carroList) {
            if (carro instanceof Mercedez) {
                System.out.println(((Mercedez) carro).cantidadPuertas());
            } else if (carro instanceof Bmw) {
                System.out.println(((Bmw) carro).puertas());
            }
        }
    }

    public void cualquierCosa(ClasePapa clase) {
        clase.metodo1();
    }
}
