package composants.concrets;

import composants.abstrait.Boisson;

public class Deca extends Boisson {
    private double cout = 3.5;

    public void setCout(double cout) {
        this.cout = cout;
    }

    @Override
    public double cout() {
        return cout;
    }
}
