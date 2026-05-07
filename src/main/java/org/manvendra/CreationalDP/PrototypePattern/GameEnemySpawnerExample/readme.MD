## Game Enemy Spawner

### Step 1: Clarify the Requirements
#### Functional Requirements:

The system must spawn various types of enemies (e.g., Orcs, Goblins, Trolls) during gameplay.

Enemies require heavy computational resources to initialize (e.g., loading 3D assets).

Crucial constraint: The game runs at 60 Frames Per Second (FPS). If the Spawner tries to initialize a new Orc from scratch in the middle of a battle, the game will stutter and drop frames. We need a way to instantiate enemies instantly.

### Step 2: Identify the Design Pattern
#### Prototype Pattern (Creational): 
Instead of using the new keyword and running heavy constructors during gameplay, we create a fully-loaded instance of each enemy type once while the game is at a loading screen. These are our "Prototypes." When the game needs a new enemy, the Spawner simply asks the Prototype to clone() itself.

### Step 3: Class Architecture
#### Enemy (Prototype Interface): 
Declares the clone() method and common game logic (like spawn(x, y)).

#### Orc, Goblin (Concrete Prototypes): 
Implement the interface. Their standard constructors contain the "expensive" logic. They also contain a private copy constructor used exclusively for fast cloning.

#### EnemySpawner (The Registry/Client): 
A class that acts as a registry. It holds references to the pre-loaded prototypes and provides a method to spawn clones on demand.