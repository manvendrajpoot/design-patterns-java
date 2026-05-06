## Design a system to construct complex HTTP requests.
### Step 1: Clarify the Requirements
#### Functional Requirements:

The system must create an HTTP Request object.

An HTTP request has a few mandatory fields (like the URL and HTTP Method) and many optional fields (Headers, Query Parameters, Body/Payload, Timeouts, Auth Tokens).

Crucial constraint: The resulting HttpRequest object should ideally be immutable. Once it is constructed, its state shouldn't change, which makes it safe to pass around in a multi-threaded environment.

### Step 2: Identify the Design Pattern
#### Builder Pattern (Creational): 
We need to construct an object step-by-step. If we used standard constructors, we would suffer from the "Telescoping Constructor Anti-Pattern" (e.g., new HttpRequest("GET", "url", null, headers, null, timeout)). The Builder gives us a clean, fluent API to set only the fields we care about.

### Step 3: Class Architecture
#### HttpMethod (Enum): 
Defines GET, POST, PUT, DELETE, PATCH, etc.

#### HttpRequest (The Product): 
The complex object. It will have a private constructor so that no one can instantiate it directly. It will only have getter methods (no setters) to guarantee immutability.

#### HttpRequest.Builder (The Builder): 
A static inner class. It holds the same fields as the request. It provides fluent methods (like addHeader(), setBody()) that return the Builder instance. Finally, it has a build() method that creates the actual HttpRequest.