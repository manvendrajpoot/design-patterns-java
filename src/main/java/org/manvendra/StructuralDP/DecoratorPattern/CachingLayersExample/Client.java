package main.java.org.manvendra.StructuralDP.DecoratorPattern.CachingLayersExample;

public class Client {
    public static void main(String[] args) {
        // 1. Instantiate the raw database source
        DatabaseSource rawDatabase = new DatabaseSource();

        // 2. Wrap it with our caching layer
        DataSource cachedDatabase = new CacheDecorator(rawDatabase);

        // Client code only talks to the interface. It doesn't care if it's cached or not!

        System.out.println("--- First Request (Should be slow) ---");
        long start = System.currentTimeMillis();
        System.out.println(cachedDatabase.getData("101"));
        System.out.println("Time taken: " + (System.currentTimeMillis() - start) + "ms\n");

    }
}
