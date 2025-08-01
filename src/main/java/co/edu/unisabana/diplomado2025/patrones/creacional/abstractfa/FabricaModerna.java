package co.edu.unisabana.diplomado2025.patrones.creacional.abstractfa;

public class FabricaModerna implements AbstractFactory {
    @Override
    public Goomba crearGoomba() {
        //Consultar algo en la bd.
        //if y else para determinar el valor en un parametro
        //Condicionales apartir del día para ver que se coloca en una variable
        //Grandisimos
        return new GoombaModerno();
    }

    @Override
    public Koopa crearKoopa() {
        return new KoopaModerno();
    }
}
