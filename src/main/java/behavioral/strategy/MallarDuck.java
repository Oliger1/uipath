package behavioral.strategy;

public class MallarDuck extends Duck{
    MallarDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
}
