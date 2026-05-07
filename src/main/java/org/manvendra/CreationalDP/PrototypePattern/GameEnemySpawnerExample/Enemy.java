package main.java.org.manvendra.CreationalDP.PrototypePattern.GameEnemySpawnerExample;

/// 1. The Prototype Interface
public interface Enemy {
    Enemy clone();

    void spawn(int x, int y);
    void setLevel(int level);

}
