### Liskov Substitution Principle (Subtyping and inheritance)
![alt text](../../../../../../etc/lsp.jpg?raw=true "Liskov Substitution")

Functions that use references to base classes must be able to use objects of derived classes without knowing it
Child classes should never break the parent class type definitions. It's in strong relation with Open Closed Principle.
In fact a violation of LSP is a latent violation of OCP.
In other words, a subclass should override the parent class methods in a way that does not break 
functionality from a client's point of view.

*Real World situation:* If you cook youserlf a stew, you'd only put things in there that were edible
because you want to eat the stew without asking yourself anytime 'is this edible'.

#### Common Refactorings
- Collapse Hierarchy
- Pull Up / Push Down Field
- Pull Up / Push Down Method