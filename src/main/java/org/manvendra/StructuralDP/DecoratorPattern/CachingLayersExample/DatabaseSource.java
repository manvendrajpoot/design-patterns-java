package main.java.org.manvendra.StructuralDP.DecoratorPattern.CachingLayersExample;


// 2. CONCRETE COMPONENT (The slow, real object)
// ==========================================
public class DatabaseSource implements DataSource{
    @Override
    public String getData(String id) {
        System.out.println("[Database] Fetching data for ID: " + id + " (This takes 2 seconds...)");
        simulateNetworkLatency();

        // Simulating a DB read
        return "{ \"id\": \"" + id + "\", \"name\": \"User_" + id + "\" }";
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
