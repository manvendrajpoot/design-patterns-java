package main.java.org.manvendra.CreationalDP.BuilderPattern.HttpRequestBuilderExample;

import java.util.HashMap;
import java.util.Map;

/// 2. The Complex Product (Immutable)
public class HttpRequest {
    private final String url;
    private final HttpMethod method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeoutMs;

    // Private constructor forces the client to use the Builder
    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;

        /// Deep copy maps to ensure true immutability
        this.headers = new HashMap<>(builder.headers);
        this.queryParams = new HashMap<>(builder.queryParams);
        this.body = builder.body;
        this.timeoutMs = builder.timeoutMs;
    }

    // Getters only. No setters.
    public String getUrl() { return url; }
    public HttpMethod getMethod() { return method; }
    public String getBody() { return body; }
    public int getTimeoutMs() { return timeoutMs; }

    public void printRequest() {
        System.out.println("--- Executing http '" + method + "' method Request ---");
        System.out.println("URL: " + url);
        System.out.println("Headers: " + headers);
        System.out.println("Body: " + body);
        System.out.println("Timeout: " + timeoutMs + "ms\n");
    }

    /// 3. The Builder (Static Inner Class)
    public static class Builder {
        // Mandatory fields can be set via Builder constructor
        private String url;
        private HttpMethod method = HttpMethod.GET; // Default

        // Optional fields initialized to defaults
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> queryParams = new HashMap<>();
        private String body;
        private int timeoutMs = 5000; // 5 sec default

        public Builder(String url) {
            this.url = url;
        }

        // Setter methods that return "this"
        public Builder method(HttpMethod method) {
            this.method = method;
            return this;
        }
        public Builder addHeader(String key, String val) {
            this.headers.put(key, val);
            return this;
        }
        public Builder addQueryParam(String key, String val) {
            this.queryParams.put(key, val);
            return this;
        }
        public Builder body(String body) {
            this.body = body;
            return this;
        }
        public Builder timeout(int timeoutMs) {
            this.timeoutMs = timeoutMs;
            return this;
        }

        /// The critical build step where validation happens
        public HttpRequest build() {
            // Validation Logic
            if (url == null || url.trim().isEmpty()) {
                throw new UnsupportedOperationException("URL can't be NULL or empty()");
            }
            if (method == HttpMethod.POST || body == null) {
                throw new UnsupportedOperationException("POST requests must have a body payload");
            }

            // Return the fully constructed, immutable product
            return new HttpRequest(this);
        }

    }
}
