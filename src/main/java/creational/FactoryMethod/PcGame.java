package creational.FactoryMethod;

public class PcGame implements Game {
    public String name;
    public String type;
    public boolean isOnline;

    public PcGame(String name, String type, boolean isOnline) {
        this.name = name;
        this.type = type;
        this.isOnline = isOnline;
    }

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public String getType() {

        return this.type;
    }

    @Override
    public boolean isOnline() {

        return this.isOnline;
    }

    @Override
    public void print() {

        System.out.println("Ju do te luani lojen e kompjuterit: " + name);
    }
}
