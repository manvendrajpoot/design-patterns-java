## Document Copy-Paste (Clipboard)

### Step 1: Clarify the Requirements

#### Functional Requirements:

The system handles a Document that can contain various elements: TextBox, Image, Table, etc.

The user can select any element (or the entire document) and hit "Copy" and then "Paste".

Crucial constraint: Copied elements must be entirely independent of the original. If I copy a TextBox and change the text in the new box, it must not alter the original text. Furthermore, the client code handling the clipboard shouldn't need to know the exact class of the element it is copying.

### Step 2: Identify the Design Pattern
#### Prototype Pattern (Creational): 
We need to create exact duplicates of complex objects. If the ClipboardManager tried to create copies from scratch, it would need to know every single class type, read all their private fields, and use massive if/else blocks.

Instead, the Prototype pattern delegates the cloning process to the actual objects themselves. The objects know their own structure best.

### Step 3: Class Architecture
#### Prototype (Interface):
A simple interface declaring the clone() method.

#### DocumentElement (Abstract Product):
An interface or abstract class representing any item on the page, extending Prototype.

#### TextBox, Image (Concrete Prototypes):
Implement the clone() method to return a fresh instance of themselves with identical state.

#### Document (Complex Prototype):
Contains a list of DocumentElements. Its clone() method must perform a Deep Copy of all its children.

Clipboard (Client): Holds a reference to a copied Prototype and asks it to clone itself when pasted.