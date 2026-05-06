package main.java.org.manvendra.CreationalDP.BuilderPattern.HttpRequestBuilderExample;

public class Client {
    public static void main(String[] args) {
        // Ex 1: A simple GET request (Relies on defaults)
        HttpRequest getRequest = new HttpRequest.Builder("https://api.github.com/users")
                .addHeader("Accept", "application/json")
                .build();

        getRequest.printRequest();

        // Ex 2: A complex POST request
        /* HttpRequest postRequest = new HttpRequest.Builder("https://api.stripe.com/v1/charges")
                .method(HttpMethod.POST)
                .addHeader("Authorization", "Bearer sk_test_123")
                .addHeader("Content-Type", "application/json")
                .body("{\"amount\": 2000, \"currency\": \"usd\"}")
                .timeout(10000) // 10 seconds
                .build();

        postRequest.printRequest();

         */
    }
}
