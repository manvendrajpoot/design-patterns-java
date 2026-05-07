package main.java.org.manvendra.CreationalDP.PrototypePattern.GameEnemySpawnerExample;

public class Goblin implements Enemy{
    private String meshData;

    public Goblin() {
        System.out.println("Loading Goblin assets from disk... (Heavy)");
        this.meshData = "Goblin_Mesh";
    }

    private Goblin(Goblin target) {
        this.meshData = target.meshData;
    }

    @Override
    public Enemy clone() {
        return new Goblin(this);
    }

    @Override
    public void spawn(int x, int y) {
        System.out.println("Spawned Goblin at coordinates (" + x + ", " + y + ")");
    }

    @Override
    public void setLevel(int level) {

    }
}
