## Stock monitoring system 

It downloads the stock data from multiple sources in XML format and then displays nice-looking charts and diagrams for the user.

To improve the app by integrating a smart 3rd-party analytics libraries which works with data in JSON and YAML format.

### Step 1: Clarify the Requirements & Constraints
Always start by explicitly stating the problem and your boundaries to the interviewer:

Existing System: We have an established system that downloads stock data in XML format. We cannot (or should not) rewrite this core downloading logic just to support a new analytics tool.

New Requirement: We want to integrate a "Smart Analytics Library" to generate insights.

The Conflict: The 3rd-party library is closed-source (or unmodifiable) and strictly expects input in JSON or YAML format.

The Goal: Integrate the library without modifying our existing XML downloaders or the 3rd-party source code.

### Step 2: Define the Architecture (The Adapter Pattern)
Explain the roles of the classes you are about to create:

#### Target Interface (IAnalyticsTool): 
This is the interface our stock monitoring application expects to interact with. It expects to pass XML data.

#### Adaptee (SmartJsonAnalyticsLib & SmartYamlAnalyticsLib): 
The incompatible 3rd-party libraries.

#### Adapter (AnalyticsAdapter): 
The wrapper class. It implements IAnalyticsTool, takes the XML data, translates it to JSON/YAML, and passes it to the Adaptee.