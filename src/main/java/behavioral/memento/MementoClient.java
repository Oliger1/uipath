package behavioral.memento;

import java.util.ArrayList;

public class MementoClient {
    public static void main(String[] args) {
        GameState gameState = new GameState(100, 50, new ArrayList<String>());
        GameStateCache gameStateMemento = new GameStateCache();
        gameStateMemento.saveGameState(gameState);

        gameState.addItem("pistolete");
        gameState.addItem("mine");
        gameState.kill(10);
        System.out.println(gameState);
        System.out.println("----------------");

        gameStateMemento.saveGameState(gameState);

        gameState.kill(20);
        gameState.addItem("tank");
        System.out.println(gameState);
        System.out.println("----------------");

        var gameStateSnapshot = gameStateMemento.restoreFromPrevieousSnapshot();
        gameState.restoreFromSnapshot(gameStateSnapshot);

        System.out.println(gameState);
    }
}
