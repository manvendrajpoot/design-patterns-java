package main.java.org.manvendra.CreationalDP.SingletonPattern.DatabasePoolExample;

public class DatabaseConnectionManager {
    /*
    * The field for storing the singleton instance should be declared static.
    * The 'volatile' keyword ensures that multiple threads handle the instance correctly.
    * */
    private static volatile DatabaseConnectionManager instance;

    /*
    * The singleton's constructor should always be private to prevent direct construction.
    * */
    private DatabaseConnectionManager() {
        System.out.println("Initialising Database Connection...");
    }
    /*
    * Static method that controls access to the singleton instance.
    * */
    public static DatabaseConnectionManager getInstance() {
         // First check (no locking) for performance.
         if (instance == null) {
             // acquireThreadLock() in Java is done via 'synchronized'.
             synchronized (DatabaseConnectionManager.class) {
                 // Second check to ensure another thread didn't initialize it while we waited.
                 if (instance == null) {
                     instance = new DatabaseConnectionManager();
                 }
             }
         }
         return instance;
    }

    /*
    * Business logic executed on the instance.
    * */
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
