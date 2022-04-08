package structural.Decorator;

public class WhipMilkDecorator extends CondimentDecorator {
    Beverage beverage;

    public WhipMilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.2f;
    }

    @Override
    public String getDescription() {
        return beverage.descrition + ", whip milk";
    }
}
