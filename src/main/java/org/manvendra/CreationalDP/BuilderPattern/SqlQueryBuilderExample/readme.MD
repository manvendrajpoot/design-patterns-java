## SQL Query Builder
### Step 1: Clarify the Requirements
#### Functional Requirements:

The system must dynamically construct SELECT SQL queries.

It needs to support standard clauses: SELECT, FROM, WHERE, ORDER BY, and LIMIT.

#### Crucial constraint: 
Clauses like WHERE, ORDER BY, and LIMIT are optional. The system must generate valid SQL regardless of which optional clauses are included (e.g., no trailing ANDs, correct spacing).

### Step 2: Identify the Design Pattern
#### Builder Pattern (Creational): 
We are constructing a complex string/object step-by-step. If we just used string concatenation, the code would be a mess of if (hasWhere) blocks. The Builder pattern allows the client to chain methods together fluently and delays the actual assembly until the final .build() call.

### Step 3: Class Architecture
#### Query (The Product): 
A simple object that holds the final constructed SQL string (and potentially parameters for prepared statements, though we'll keep it simple for now).

#### SelectQueryBuilder (The Builder): 
Holds the intermediate state of the query (lists of columns, conditions, the table name). It provides fluent methods (select(), from(), where()) that return this.

#### Client: 
Uses the builder to construct the query dynamically.

