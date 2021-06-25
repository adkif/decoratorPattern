package composants.concrets;

import composants.abstrait.Boisson;

public class Expresso extends Boisson {
    private double cout = 5;

    public void setCout(double cout) {
        this.cout = cout;
    }

    @Override
    public double cout() {
        return this.cout;
    }
}
