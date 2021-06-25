package starbuzz;

import composants.abstrait.Boisson;
import composants.concrets.Deca;
import decorateurs.concrets.Chocolat;
import decorateurs.concrets.Lait;

public class Main {
    public static void main(String[] args) {
        Boisson deca = new Deca();
        System.out.println("Price USD: "+deca.cout());
        deca = new Lait(deca);
        System.out.println("Price USD: "+deca.cout());
        deca = new Chocolat(deca);
        System.out.println("Price USD: "+deca.cout());
    }
}

