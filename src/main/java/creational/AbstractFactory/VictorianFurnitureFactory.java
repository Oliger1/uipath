package creational.AbstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair(30f, 4);
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable(120f, 4);
    }
}
