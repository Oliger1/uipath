package creational.AbstractFactory;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair(18.9f, 4);
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable(90f, 4);
    }
}
