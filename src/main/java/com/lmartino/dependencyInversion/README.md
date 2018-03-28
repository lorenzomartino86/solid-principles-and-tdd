### Dependency Inversion Principle
![alt text](etc/dip.jpg?raw=true "Dependency Inversion")

The principle states:

1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
2. Abstractions should not depend on details. Details should depend on abstractions.

Instead of a high-level module depending on a low-level module, both should depend on an abstraction.

*Real World situation:* If you go to your local store and pay with a credit card, 
              the clerk just takes your card and swipes it, whatever it is. 
              Both you and the clerk depend on the credit card abstraction without worrying about specifics.

While dependency inversion is more focused on the structure of your code, 
dependency injection is how the code functionally works. 
Spring is using dependency injection to assemble your application, dependency
inversion is what decouples your code so Spring can use dependency injection at run time.

#### Common Refactorings
- Extract Class
- Extract Interface / Apply Strategy Pattern
- Extract Method
- Introduce Service Locator / Container