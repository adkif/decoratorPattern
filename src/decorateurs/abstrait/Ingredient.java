package decorateurs.abstrait;

import composants.abstrait.Boisson;

public abstract class Ingredient extends Boisson {
    protected Boisson boisson;

    public Ingredient(Boisson boisson) {
        this.boisson = boisson;
    }

}
