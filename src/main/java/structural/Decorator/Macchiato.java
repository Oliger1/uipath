package structural.Decorator;

public class Macchiato extends Beverage {
    public Macchiato() {
        descrition = "Macchiato";
    }

    @Override
    public float cost() {
        return 1.17f;
    }
}
