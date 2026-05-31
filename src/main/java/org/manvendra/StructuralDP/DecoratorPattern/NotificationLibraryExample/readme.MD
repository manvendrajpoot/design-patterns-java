## Notification Library

### Step 1: Clarify the Requirements & Intent

#### Core Functionality: 
We have an alerting system that needs to send messages to users or admins.

##### The Goal: 
We want to support multiple channels (Email, SMS, Slack, Push) and allow users to configure any combination of them dynamically.

#### The Constraint: 
We want to avoid class explosion. The client code triggering the alert shouldn't need to know how many channels are being used; it should just call a single send() method.

### Step 2: Define the Architecture (Decorator Pattern)
Explain the roles of your classes:

#### Component Interface (Notifier): 
The standard interface for sending a message.

#### Concrete Component (EmailNotifier): 
The base notification method. We'll assume Email is our default, bare-minimum notification.

#### Base Decorator (NotifierDecorator): 
Implements Notifier, holds a reference to a wrapped Notifier object, and delegates the send() call to it.

#### Concrete Decorators (SMSDecorator, SlackDecorator): 
Extend the base decorator to add their specific channel's logic before or after delegating to the wrapped object.
