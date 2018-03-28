### Single Responsibility Principle (Actors and high level architecture)
![alt text](etc/srp.jpg?raw=true "Single Responsibility Principle")

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

#### Common Refactorings
- Extract Class
- Move Method