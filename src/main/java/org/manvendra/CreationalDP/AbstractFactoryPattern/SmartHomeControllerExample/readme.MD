## Design a Smart Home Controller 

### Step 1: Clarify the Requirements
#### Functional Requirements:

The system acts as a central hub to control smart home devices (e.g., Lights, Thermostats).

The user's home might be configured for the Apple HomeKit ecosystem, the Google Home ecosystem, or the Amazon Alexa ecosystem

#### Crucial constraint: 
The ecosystems use entirely different underlying protocols. A Google Home command will fail if sent to an Apple HomeKit Light. We must guarantee that all instantiated devices strictly belong to the active ecosystem.


### Step 2: Identify the Design Pattern
#### Abstract Factory (Creational): 
We need to create families of related objects. A "family" here is either the Apple HomeKit devices, the Google Home devices, or the Amazon Alexa devices. The Abstract Factory ensures that the client code only interacts with compatible objects and never accidentally mixes a Google Thermostat with an Apple Light.

### Step 3: Class Architecture
#### Abstract Products (SmartFan, SmartLight, SmartThermostat): 
The common interfaces defining what any light or thermostat can do (e.g., turnOn(), setTemperature()).

#### Concrete Products (HomeKitLight, GoogleLight, etc.): 
The brand-specific implementations.

#### Abstract Factory (SmartHomeFactory): 
The interface declaring methods to create the abstract products (createLight(), createThermostat()).

#### Concrete Factories (AppleHomeKitFactory, GoogleHomeFactory): 
Implement the factory interface to return their specific brand's devices.

#### Client (SmartHomeController): 
The central hub that receives a factory at startup and uses it to manage the home.


