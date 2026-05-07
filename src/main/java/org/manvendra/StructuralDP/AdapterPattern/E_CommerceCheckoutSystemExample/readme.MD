## E-Commerce checkout system 

It allows seamless switching between different 3rd-party logistics/shipping providers

### Step 1: Clarify the Requirements
Before writing any code, state your assumptions to the interviewer:

#### Core functionality: 
We need to calculate shipping costs and generate a shipping label/tracking ID during checkout.

#### The Pain Point: 
Different logistics providers (e.g., FedEx, UPS) have completely different API methods, request payloads, and response formats.

#### The Goal: 
Our CheckoutSystem should not care which provider is being used. Adding a new provider in the future (like DHL) should require zero changes to the core checkout logic (Open-Closed Principle).

### Step 2: Define the Architecture (The Adapter Pattern)
Instead of putting if (provider == "FedEx") inside our checkout logic, we will define a Target Interface that our system understands. Then, we will create Adapters for each 3rd-party provider that implement this interface and translate our standard requests into the specific API calls the 3rd-party expects.

#### Target Interface: 
ShippingProvider

#### Adaptees (Incompatible 3rd Party APIs):
FedExAPI, UPSApi

#### Adapters: 
FedExAdapter, UPSAdapter

#### Client: 
CheckoutSystem

#### Step 3: The Code Implementation (Java)
1. The 3rd-Party APIs (What we cannot change) : 

   Imagine these come from a downloaded SDK or an external REST client. Notice how completely different their methods and inputs are.
   ```
   class FedExAPI { }
   class UPSApi { }
   ```
   
2. The Target Interface (What our system wants) : 
      We define a clean, standard interface that our e-commerce system will use. It uses our system's internal domain models (like ```Order```).

    ```
   class Order { }
   interface ShippingProvider { }
   ```
   
3. The Adapters (The Bridge) :
   Now, we write the adapters. They "wrap" the 3rd-party APIs and translate the methods.

   ```
    // Adapter for FedEx
   class FedExAdapter implements ShippingProvider { }
   // Adapter for UPS
   class UPSAdapter implements ShippingProvider { }
   ```
   
4. The Client (Checkout System) :
  Our checkout system relies entirely on the ShippingProvider abstraction. It has no idea FedEx or UPS even exist.
