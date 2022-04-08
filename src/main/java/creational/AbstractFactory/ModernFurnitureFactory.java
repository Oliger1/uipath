package creational.AbstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair(20f, 0);
    }

    @Override
    public Table createTable() {
        return new ModernTable(70f, 0);
    }
}
