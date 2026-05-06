package main.java.org.manvendra.CreationalDP.BuilderPattern.SqlQueryBuilderExample;

public class Client {
    public static void main(String[] args) {
        // Scenario 1: A simple query
        SelectQuery query = new SelectQueryBuilder()
                .select("id", "name")
                .from("users")
                .build();

        System.out.println(query.getSql());
        /// Output:
        // SELECT id, name FROM users;

        // Scenario 2: A complex, dynamic query
        boolean filterByActive = true;

        SelectQueryBuilder complexBuilder = new SelectQueryBuilder()
                .select("id", "email", "created_at")
                .from("users")
                .where("age > 18")
                .orderBy("created_at DESC")
                .limit(10);

        // We can dynamically add clauses before building!
        if (filterByActive) {
            complexBuilder.where("status = 'ACTIVE'");
        }

        SelectQuery complexQuery = complexBuilder.build();
        System.out.println(complexQuery.getSql());

        /// Output:
        // SELECT id, email, created_at FROM users
        // WHERE age > 18
        // AND status = 'ACTIVE'
        // ORDER BY created_at
        // DESC LIMIT 10;
    }
}
