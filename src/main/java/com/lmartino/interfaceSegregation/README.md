### Interface Segregation Principle (Business logic to clients communication)
![alt text](etc/isp.jpg?raw=true "Interface Segregation")

In all modular applications there must be some kind of interface that the client rely on.
The scope is the communication to the client code on how to use the module.
We could take the approach to break the interface into pieces, specialized to each implementation.
This principle states that *no client should be forced to depend on methods it does not use*.

*Real World situation:* When you check out the menu at the restaurant you see something that's just called
'soup of the day'. Why? Because the soup changes a lot and there's no sense reprinting the menus every day.
 Interested clients use the interface (asking the server), while the others don't need to be concerned.
 
 
#### Common Refactorings
- Extract Interface