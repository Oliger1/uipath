package behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

public class GameState {
    private int health;
    private int round;
    private List<String> items;

    public GameState(int health, int round, List<String> items) {
        this.health = health;
        this.round = round;
        this.items = items;
    }

    public void heal() {
        health = 100;
    }

    public void kill(final int points) {
        health = health - points;
    }

    public void addItem(final String item) {
        items.add(item);
    }

    public void loseAllItems() {
        items.clear();
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

    @Override
    public String toString() {
        return "Gjendja e lojes : "
                + "\n" + "health: " + health
                + "\n" + "round: " + round
                + "\n" + "items: " + items;
    }

    public void restoreFromSnapshot(GameStateSnapshot gameStateSnapshot) {
        this.items = List.copyOf(gameStateSnapshot.getItems());
        this.round = gameStateSnapshot.getRound();
        this.health = gameStateSnapshot.getHealth();
    }
}
