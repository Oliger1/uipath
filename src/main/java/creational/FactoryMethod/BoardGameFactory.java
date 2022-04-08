package creational.FactoryMethod;

public class BoardGameFactory implements GameFactory {
    @Override
    public Game create() {
        return new BoardGame("murlan", "me letra");
    }
}
