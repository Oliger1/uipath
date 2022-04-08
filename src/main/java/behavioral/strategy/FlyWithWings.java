package behavioral.strategy;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fluturoj me krahe...");
    }
}
