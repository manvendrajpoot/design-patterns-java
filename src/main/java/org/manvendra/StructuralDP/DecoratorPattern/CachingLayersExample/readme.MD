## Caching layer

Caching is fundamentally a "wrapper" behavior: you intercept a request, check if you have the answer, and if not, you pass the request down to the real, slower system.


### Step 1: Clarify the Requirements & Intent
State your assumptions to the interviewer:

#### Core Functionality:
We have a system that fetches data (e.g., user profiles) from a slow underlying source, like a Database or a remote API.

#### The Goal: 
We want to add a caching layer to speed up repeated requests for the same data.

#### The Constraint (Why Decorator?): 
We do not want to modify the existing database logic. Furthermore, the client calling the data source shouldn't even know a cache exists—it should just ask for data and get it.

### Step 2: Define the Architecture (Decorator Pattern)
#### Component Interface (DataSource):
The standard interface for fetching data.

#### Concrete Component (DatabaseSource):
The real, heavy object that takes time to fetch data from the DB.

#### Base Decorator (DataSourceDecorator):
An abstract class that implements DataSource and holds a reference to a DataSource object.

#### Concrete Decorator (CacheDecorator):
Adds the caching logic (state) before delegating to the wrapped component.