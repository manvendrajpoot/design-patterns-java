package main.java.org.manvendra.CreationalDP.PrototypePattern.GameEnemySpawnerExample;

public class Client {
    public static void main(String[] args) {
        EnemySpawner spawner = new EnemySpawner();

        // 1. Load heavy assets once
        spawner.loadAssets();

        // 2. Gameplay begins! The player enters a dungeon.
        System.out.println("Player entered the dungeon. Spawning enemies...");

        // Notice how these spawn instantly without hitting the "Heavy Operation" print statements
        spawner.spawnEnemy("Orc", 10, 20, 1);
        spawner.spawnEnemy("Orc", 15, 25, 5); // A level 5 variation!
        spawner.spawnEnemy("Goblin", 5, 5, 1);
        spawner.spawnEnemy("Orc", 30, 40, 2);
    }
}
