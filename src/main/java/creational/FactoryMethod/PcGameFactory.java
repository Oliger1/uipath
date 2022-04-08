package creational.FactoryMethod;

public class PcGameFactory implements GameFactory {
    @Override
    public Game create() {
        return new PcGame("tanki online", "tank game", true);
    }
}
