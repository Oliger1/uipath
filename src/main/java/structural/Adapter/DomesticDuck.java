package structural.Adapter;

public class DomesticDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack quack quack ...");
    }

    @Override
    public void fly() {
        System.out.println("Une mund te fluturoj shume pak!");
    }
}
