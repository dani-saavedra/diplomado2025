package co.edu.unisabana.diplomado2025.patrones.creacional.abstractfa;

public class FabricaVictoriana implements AbstractFactory {
    @Override
    public Goomba crearGoomba() {
        return new GoombaVictoriana();
    }

    @Override
    public Koopa crearKoopa() {
        return new KoopaVictoriano();
    }
}
