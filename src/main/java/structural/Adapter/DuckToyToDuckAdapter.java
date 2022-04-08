package structural.Adapter;

public class DuckToyToDuckAdapter implements Duck {
    DuckToy duckToy;

    DuckToyToDuckAdapter(DuckToy duckToy) {
        this.duckToy = duckToy;
    }

    @Override
    public void quack() {
        duckToy.squack();
    }

    @Override
    public void fly() {
        System.out.println("Une nuk mund te fluturoj!");
    }
}
