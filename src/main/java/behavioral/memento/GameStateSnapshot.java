package behavioral.memento;

import java.util.List;

public class GameStateSnapshot {
    private int health;
    private int round;
    private List<String> items;

    public GameStateSnapshot(GameState gameState) {
        this.health = gameState.getHealth();
        this.round = gameState.getRound();
        this.items = List.copyOf(gameState.getItems());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
