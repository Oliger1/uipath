package structural.Decorator;

public class Espresso extends Beverage {
    public Espresso() {
        descrition = "Espresso";
    }

    @Override
    public float cost() {
        return 2.00f;
    }
}
