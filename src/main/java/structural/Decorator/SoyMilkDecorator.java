package structural.Decorator;

public class SoyMilkDecorator extends CondimentDecorator {
    Beverage beverage;

    public SoyMilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.15f;
    }

    @Override
    public String getDescription() {
        return beverage.descrition + ", soy milk";
    }
}
