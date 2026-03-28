# Low Level Design  
* LLD is the process of designing classes, interfaces, relationships, and logic that directly translate into code.
# Design Principles
- S -> Single Responsibility
- O -> Open/Closed Principle
- L -> Liskov Subsitution Principle
- I -> Interface Segregation
- D -> Depedency Inversion

SOLID Principle
- S RP - Builder, Factory
- O CP - Factory, Strategy
- L SP - Strategy, Template
- I SP - Adapter
- D IP - Factory, Dependency Injection


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