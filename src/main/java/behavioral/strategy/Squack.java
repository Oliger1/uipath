package behavioral.strategy;

public class Squack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squack squack squack ...");
    }
}
