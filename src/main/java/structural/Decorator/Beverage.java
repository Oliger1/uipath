package structural.Decorator;

public abstract class Beverage {
    String descrition = "Pije";

    public String getDescrition() {
        return descrition;
    }

    public abstract float cost();
}
