### Weather Application
This application aggregates weather information from multiple sources.
The original solution has serious design flaws:

1. Weather knows about concrete APIs it uses and it has to deal the fact that 
   WeatherApi2 returns temperature in Fahrenheits. Our high-level aggregation policy is dependent on details of low-level data sources
2. Weather creates concrete objects itself. It both rises the level of coupling and violates Single Responsibility Principle.
3. Each new API requires us to change Weather application. This is an Open-Closed principle violation.

### Solution
**Dependency Injection** is a pattern that moves the responsibility of dependencies creation
outside the object thas is using them! 
Dependencies are passed into the object using a constructor or a bunch of setter methods.
Dependency injection is used to enable dependency inversion. 

The outcome is that API objects need to be created outside of our application and passed 
during its creation