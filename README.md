# SOLID Principles and TDD

A collection of use cases in which I apply the SOLID principles during refactoring phase. 
In my coding tasks I was supported by test driven development approach.

### Test Driven Development
It's a software development process that relies on the repetition of a very short development cycle:

1. Requirements are turned into very specific test cases.
2. Software is improved to pass the new tests.
3. The growing code must be cleaned up regularly during test-driven development with
the four rules of simple design:

    * Writing and running continuously all the tests.
    * Duplication must be removed.
    * Object, class, module, variable and method names should clearly represent their purpose.
    * Minimal classes and methods.
    
These rules help our system's adherence to the primary OO goals of low coupling and high cohesion.

The SOLID principles are five principles of class design. They are:

* The Single Responsibility Principle
* The Open Closed Principle
* The Liskov Substitution Principle
* The Interface Segregation Principle
* The Dependency Inversion Principle

### Single Responsibility Principle (Actors and high level architecture)
![alt text](https://lostechies.com/derickbailey/files/2011/03/SingleResponsibilityPrinciple2_71060858.jpg)

Consider a class that opens a connection to the database, pulls out some table data and writes the data to a file.
This class has multiple reasons to change: adoption of a new database, modified file output format, etc. 
This is a violation of the Single Responsibility Principle because It's doing too much.

The theoretical explanation is that *There is one and only one reason to change a class*. 
This means that we should start to think small. Each complex problem cannot be easily solved as a whole.
It's much easier to divide the problem in smaller sub-problems. Each sub-problem can be tackled separately.
Now we should start thinking in tems of "divide et imperat".
*What to do:* Keep on dividing each sub-problem into sub-sub-problems until you reach
the point where such a "mini-problem" has just one single task left.
Since each class has only one single task to fulfill, there is only one reason left to change this class.
Then the code will be:

* More readable
* More robust
* Better testable
* Better maintainable and extendable


### Open Closed Principle (Class design and feature extensions)
![alt text](https://lostechies.com/derickbailey/files/2011/03/OpenClosedPrinciple2_2C596E17.jpg)

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

### Liskov Substitution Principle (Subtyping and inheritance)
![alt text](https://lostechies.com/derickbailey/files/2011/03/LiskovSubtitutionPrinciple_52BB5162.jpg)

Functions that use references to base classes must be able to use objects of derived classes without knowing it
Child classes should never break the parent class type definitions. It's in strong relation with Open Closed Principle.
In fact a violation of LSP is a latent violation of OCP.
In other words, a subclass should override the parent class methods in a way that does not break 
functionality from a client's point of view.

*Real World situation:* If you cook youserlf a stew, you'd only put things in there that were edible
because you want to eat the stew without asking yourself anytime 'is this edible'.

### Interface Segregation Principle (Business logic to clients communication)
![alt text](https://lostechies.com/derickbailey/files/2011/03/InterfaceSegregationPrinciple_60216468.jpg)

In all modular applications there must be some kind of interface that the client rely on.
The scope is the communication to the client code on how to use the module.
We could take the approach to break the interface into pieces, specialized to each implementation.
This principle states that *no client should be forced to depend on methods it does not use*.

*Real World situation:* When you check out the menu at the restaurant you see something that's just called
'soup of the day'. Why? Because the soup changes a lot and there's no sense reprinting the menus every day.
 Interested clients use the interface (asking the server), while the others don't need to be concerned.

### Dependency Inversion Principle
![alt text](https://lostechies.com/derickbailey/files/2011/03/DependencyInversionPrinciple_0278F9E2.jpg)

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



### General Suggestions
It's a best practice to fulfill following suggestions:

1. You need to write decoupled code so you can mock what you need. This supports the **Dependency Inversion Principle**.
2. You need to write tests that are clear so you won't have to change too much in the tests (which can become a large 
source of code noise if done otherwise). This supports the **Single Responsibility Principle**.
3. The **Interface Segregation Principle** allows classes to depend on lighter interfaces that make mocking
easier to follow and understand, because you don't have a lot of choice when deciding which method to mock.
This is good when you don't really want to go over the whole code of the class before you test it.

Then we can list the *package cohesion* principles that tell us what to put inside packages:

* The Release Reuse Equivalency Principle
* The Common Closure Principle
* The Common Reuse Principle

### Other Principles
1. **Dry (Don't repeat yourself):** Don't duplicate code, instead use abstraction to abstract common things in one place.
 Benefit of this principle is in maintenance.
2. **Encapsulate what varies:** Encapsulate the code you expect to be changed in future. 
It's easy to test and maintain proper encapsulated code. 
Factory design pattern is one example of Encapsulation which encapsulates object creation code
and provides flexibility to introduce new product later with no impact on existing code.
3. **Favor composition over inheritance:** Composition is more flexible than Inheritance.
It allows to change behavior of a class at runtime by setting property during runtime and
by using interfaces to compose a class we use polymorphism which provides flexibility of to 
replace with better implementation any time.
4. **Programming for Interface not implementation:** It will lead to flexible code which can work with any new implementation
of interface. So use interface type on variables, return types of method or argument type of methods in Java.
5. **Delegation Principle:** Don't do all stuff by yourself, delegate it to respective class. 
Benefit of this design principle is no duplication of code and pretty easy to modify behaviour.

### The Release/Reuse Equivalence Principle
Reusability is one of the most oft claimed goals of OOD. In general I reuse the code if, and only if, I never need to look at the source code.
I need only link with static libraries or include dynamic libraries.

# Resources

* [Test Driven Development by Example - Kent Beck](http://www.amazon.com/Test-Driven-Development-By-Example/dp/0321146530)
* [SO - Does TDD Force Me to Follow SOLID?](http://programmers.stackexchange.com/questions/111863/does-test-driven-development-force-me-to-follow-solid)
* [Principles of OOD - Robert Martin](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod)
* [Design Principles and Design Patterns - Robert Martin](http://www.objectmentor.com/resources/articles/Principles_and_Patterns.pdf)
* [SOLID Principles with Uncle Bob - Scott Hanselman](http://s3.amazonaws.com/hanselminutes/hanselminutes_0145.pdf)
* [Working Effectively with Legacy Code - Michael Feathers](http://www.amazon.com/Working-Effectively-Legacy-Michael-Feathers/dp/0131177052)
* [Test Driven Development by Example - Kent Beck](http://www.amazon.com/Test-Driven-Development-By-Example/dp/0321146530)
* [Clean Code - Robert Martin](http://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882)
* [SOLID Motivational Pictures](http://lostechies.com/derickbailey/2009/02/11/solid-development-principles-in-motivational-pictures/)
* [30 Days of TDD: Day 5 - Make Your Code SOLID](http://blogs.telerik.com/james-bender/posts.aspx/13-09-18/30-days-of-tdd-day-five-make-your-code-solid)
* [SOLID eBook](http://lostechies.com/wp-content/uploads/2011/03/pablos_solid_ebook.pdf)