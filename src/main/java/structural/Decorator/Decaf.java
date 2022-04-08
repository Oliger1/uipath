package structural.Decorator;

public class Decaf extends Espresso {
    public Decaf() {
        descrition = "Decafainato";
    }

    @Override
    public float cost() {
        return 1.15f;
    }
}
