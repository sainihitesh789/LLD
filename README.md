# Low Level Design  
* LLD is the process of designing classes, interfaces, relationships, and logic that directly translate into code.
# Design Principles
- S -> Single Responsibility
- O -> Open/Closed Principle
- L -> Liskov Subsitution Principle
- I -> Interface Segregation
- D -> Depedency Inversion

SOLID Principle

| Principle | Design Pattern                |
|-----------|-------------------------------|
| S RP      | Builder, Factory              |
| O CP      | Factory, Strategy             |
| L SP      | Strategy, Template            |
| I SP      | Adapter                       |
| D IP      | Factory, Dependency Injection |


# Design Pattterns
*Creational Desing Pattern - Deals with Object Creation*
- Singleton - Ensures a class has only one instance and provides a global access point to it
- Factory  - Defines an interface for creating an object but lets subclasses decide which class to instantiate
- Builder  - Separates the construction of a complex object from its representation so the same process can create different representations
- Abstract Factory - Provides an interface to create families of related or dependent objects without specifying their concrete classes
- Prototype - Creates new objects by copying an existing object (cloning) instead of creating from scratch

*Structural Design Pattern - How Objects are Composed*
- Adaptor - Converts one interface into another so incomptaible classes can work together
- Decorator – Adds new behavior to an object dynamically without altering its structure
- Composite - Treats individual objects and compositions of objects uniformly in a tree structure
- Facade - Provides a simplified interface to a complex subsystem
- Proxy - Provides a placeholder or surrogate to control access to another object
- Bridge - Decouples abstraction from implementation so both can evolve independently

*Behavioural Design Pattern - How Object Communicate*
- Strategy - Defines a family of algorithms and makes them interchangeable at runtime
- Observer - Defines a one-to-many dependency so when one object changes state, all dependents are notified(Frequently Used by E.D.A)
- Command - Encapsulates a request as an object, allowing parameterization and queuing of operations
- Chain of Responsibility – Passes a request along a chain of handlers until one handles it

| Pattern  | Role in System              |
|----------|-----------------------------|
| Strategy | Dynamic Business Rules      |
| Observer | Event-Driven Communication  |
| Command  | Action Encapsulation + Undo |

