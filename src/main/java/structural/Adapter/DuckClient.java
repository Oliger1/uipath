package structural.Adapter;

public class DuckClient {
    public static void main(String[] args) {
        var duck = new DomesticDuck();
        System.out.println("Duck ne veprim ...");
        showActions(duck);

        System.out.println();

        System.out.println("Ruber Duck ne veprim ...");
        var toy = new RuberDuck();
        var duckToyAdapter = new DuckToyToDuckAdapter(toy);
        showActions(duckToyAdapter);
    }

    public static void showActions(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
