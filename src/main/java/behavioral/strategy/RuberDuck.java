package behavioral.strategy;

public class RuberDuck extends Duck{
    public RuberDuck(){
        this.flyBehavior = new NoFly();
        this.quackBehavior = new Squack();
    }
}
