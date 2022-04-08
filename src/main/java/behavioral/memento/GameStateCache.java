package behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameStateCache {
    private final Deque<GameStateSnapshot> snapshoots = new ArrayDeque<>();

    public void saveGameState(final GameState gameState) {
        snapshoots.push(new GameStateSnapshot(gameState));
    }

    public GameStateSnapshot restoreFromPrevieousSnapshot() {
        return snapshoots.pop();
    }
}
