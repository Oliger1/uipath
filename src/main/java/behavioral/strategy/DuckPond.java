package behavioral.strategy;

public class DuckPond {
    public static void main(String[] args){
        Duck duck = new MallarDuck();
        Duck rubberDuck = new RuberDuck();
        duck.performFly();
        duck.performQuack();

        System.out.println("--------------");
        rubberDuck.performFly();
        rubberDuck.performQuack();

        //ndryshojme sjelljen e ruber duck
        System.out.println("---------------");
        rubberDuck.flyBehavior = new FlyWithWings();
        rubberDuck.performFly();
    }
}
