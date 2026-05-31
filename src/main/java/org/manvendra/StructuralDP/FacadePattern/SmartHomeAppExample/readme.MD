## SmartHome App 
In a modern smart home ecosystem, we have dozens of micro-services and device protocols (Zigbee, Z-Wave, Wi-Fi APIs) managed by separate manufacturers. If the client app had to manually talk to every single device to trigger a routine, the client code would become incredibly bloated and tightly coupled.

The Facade pattern provides a single, simplified entry point to this complex web of subsystems.

### Step 1: Clarify the Requirements & Constraints

#### The Subsystems: 
We are dealing with distinct, independent systems: LightController, SmartLock, AlarmSystem, and Thermostat.

#### The Problem: 
Each device has its own connection logic, states, and specific API methods.

#### The Goal: 
Provide a unified interface so the user can execute macro-actions like a "Goodnight Routine" or a "Leave Home Routine" with a single API call from the client application.

### Step 2: Define the Architecture (Facade Pattern)
Explain the component roles:

#### Subsystems (Light, Lock, Alarm, AC): 
The complex, low-level classes representing individual smart devices.

#### The Facade (SmartHomeFacade): 
The coordinator wrapper. It holds references to all subsystem objects and exposes simple, high-level macro methods.

#### The Client (SmartHomeApp): 
Directs requests only to the Facade, remaining completely decoupled from individual appliance classes.