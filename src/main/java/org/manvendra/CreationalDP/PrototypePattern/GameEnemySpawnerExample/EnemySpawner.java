package main.java.org.manvendra.CreationalDP.PrototypePattern.GameEnemySpawnerExample;

import java.util.HashMap;
import java.util.Map;

/// 3. The Registry / Client (The Spawner)
public class EnemySpawner {
    private Map<String, Enemy> prototypes = new HashMap<>();

    // Called during the game's Loading Screen
    public void loadAssets() {
        System.out.println("--- GAME LOADING SCREEN ---");
        prototypes.put("Orc", new Orc());
        prototypes.put("Goblin", new Goblin());
        System.out.println("--- LOADING COMPLETE ---\n");
    }

    // Called during active gameplay (60 FPS loop)
    public Enemy spawnEnemy(String type, int x, int y, int level) {
        Enemy prototype = prototypes.get(type);
        if (prototype != null) {
            // 1. INSTANTLY clone the heavy object
            Enemy clone = prototype.clone();

            // 2. Mutate the clone's specific state
            clone.setLevel(level);
            clone.spawn(x, y);

            return clone;
        }
        throw new IllegalArgumentException("Unknown enemy type!");
    }
}
