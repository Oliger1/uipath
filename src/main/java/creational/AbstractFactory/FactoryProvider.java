package creational.AbstractFactory;

public class FactoryProvider {
    public FurnitureFactory createFactory(String type) {

        switch (type) {
            case "artdeco":
                return new ArtDecoFurnitureFactory();

            case "modern":
                return new ModernFurnitureFactory();

            case "victorian":
                return new VictorianFurnitureFactory();

            default:
                return null;
        }

    }
}
