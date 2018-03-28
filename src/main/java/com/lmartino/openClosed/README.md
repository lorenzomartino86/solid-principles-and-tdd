### Open Closed Principle (Class design and feature extensions)
![alt text](../../../../../../etc/ocp.jpg?raw=true "Open Closed")

The theoretical explanation is *software entities should be open for extension but closed for modification*.
Such an entity can allow its behavior to be altered without altering its source code.
There are several ways to extend a class/entity:

* Inheritance
* Composition
* Proxy implementation

*Real World situation:* The smartphone has app stores that let you extend the base
functionality of the phone. It ships with the basics (camera operation, actual calls, etc.), 
but via the app store you can 'extend' the phone's capabilities to allow you to manage
the todo list, play video games, etc.

#### Common Refactorings
- Extract Interface / Apply Strategy Pattern
- Parameterize Method
- Form Template Method