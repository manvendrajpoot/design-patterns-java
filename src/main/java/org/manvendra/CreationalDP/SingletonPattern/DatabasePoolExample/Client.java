package main.java.org.manvendra.CreationalDP.SingletonPattern.DatabasePoolExample;

public class Client {
    public static void main(String[] args) {
        // Get the first instance.
        DatabaseConnectionManager foo = DatabaseConnectionManager.getInstance();
        foo.query("SELECT * FROM users");

        // Get the instance again.
        DatabaseConnectionManager bar = DatabaseConnectionManager.getInstance();
        bar.query("SELECT * FROM products");

        // Verification: Check if both variables point to the same object.
        if (foo == bar) {
            System.out.println("Both 'foo' and 'bar' contain the same instance.");
        }
    }
}
