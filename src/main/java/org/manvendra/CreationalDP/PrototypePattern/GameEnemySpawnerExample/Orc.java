package main.java.org.manvendra.CreationalDP.PrototypePattern.GameEnemySpawnerExample;

/// 2. Concrete Prototypes
public class Orc implements Enemy{
    private String meshData;        // Expensive 3D Model
    private String textureData;     // Expensive High-Res Texture
    private int health;
    private int speed;
    private int level;

    // The Standard Constructor (HEAVY - only called during loading screens)
    public Orc() {
        System.out.println("Loading Orc 3D Mesh from disk... (Heavy Operation)");
        System.out.println("Loading Orc Textures from disk... (Heavy Operation)");
        try { Thread.sleep(1000); } catch (InterruptedException e) {} // Simulate lag

        this.meshData = "Orc_Mesh_v1";
        this.textureData = "Orc_Tex_v1";
        this.health = 100;
        this.speed = 5;
        this.level = 1;
    }

    // The Copy Constructor (LIGHTNING FAST - used for cloning)
    private Orc(Orc target) {
        // We do a shallow copy of the heavy assets (they share the same mesh in memory)
        this.meshData = target.meshData;
        this.textureData = target.textureData;

        // We do a deep copy of the state variables (so they can take damage independently)
        this.health = target.health;
        this.speed = target.speed;
        this.level = target.level;
    }


    @Override
    public Enemy clone() {
        return new Orc(this); // <--- calls copy const
    }

    @Override
    public void spawn(int x, int y) {
        System.out.println("Spawned Level " + level
                + " Orc at coordinates (" + x + ", " + y + ")");
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
        this.health += (level * 10);
    }
}
