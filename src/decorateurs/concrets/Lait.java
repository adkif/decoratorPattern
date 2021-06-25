package decorateurs.concrets;

import composants.abstrait.Boisson;
import decorateurs.abstrait.Ingredient;

public class Lait extends Ingredient {
    private double cout = 0.8;

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return this.cout + boisson.cout();
    }
}
