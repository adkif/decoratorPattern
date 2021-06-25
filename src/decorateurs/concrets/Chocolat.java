package decorateurs.concrets;

import composants.abstrait.Boisson;
import decorateurs.abstrait.Ingredient;

public class Chocolat extends Ingredient {

    private double cout = 1.5;

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return this.cout + boisson.cout();
    }
}
