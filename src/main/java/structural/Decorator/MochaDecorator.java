package structural.Decorator;

public class MochaDecorator extends CondimentDecorator {
    Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.11f;
    }

    @Override
    public String getDescription() {
        return beverage.descrition + ", mocha";
    }
}
