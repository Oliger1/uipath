package behavioral.strategy;

public class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.print("Nuk fluturoj...");
    }
}
