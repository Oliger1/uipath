package creational.FactoryMethod;

public class BoardGame implements Game {
    private String name;
    private String type;

    public BoardGame(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isOnline() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("Ju do te luani lojen e tavolines: " + name);
    }
}
