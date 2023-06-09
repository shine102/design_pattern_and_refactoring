# design_pattern_and_refactoring
Short summary of book and code implementation of design pattern in java

---

## I. Design Principles
### 1. Encapsulate What Varies:
- Identify the aspects of your application that vary and separate them from what stays the same.
- Encapsulation on a method level:
	- separate change part into another function
- Encapsulation on a class level:
	- When a class contain too many method, separate it into a sub class, abstract the process
### 2. Program to an Interface, not an Implementation
- Depend on abstractions, not on concrete classes.
    + eg: a cat that can eat any food is more flexible than one that can eat just sausages.
- Flexible way to set up collaboration between objects:

  1. Determine what exactly one object needs from the other: which methods does it execute?
  2. Describe these methods in a new interface or abstract class.
  3. Make the class that is a dependency implement this interface.
  4. Now make the second class dependent on this interface rather than on the concrete class. You still can make it work with objects of the original class, but the connection is now much more flexible.

### 3. Favor Composition Over Inheritance:

## II. SOLID Priciples:
### S: Single Responsibility Principle (a class only do one job.)
### O: Open/Closed Principle (When modify class, extends into sub-class for edit)
### L: Liskov Substitution Principle (focus only subclass)
	+ parameter types in a method of a subclass should be match or be more abstract than of the super-class
	+ return types in a method of a subclass should be match or be a subtype of return type in the method of the super-class
	+ method in a subclass shouldn't throw types of exceptions which the base method isn't expected to throw
	+ subclass shouldn't strengthen pre-conditions.
		.Eg: base method has a param type int. if sub-class overrides and requires the value of param must be positive (by throwing an exception if value is negative) this is strengthen pre-condition.
	+ subclass shouldn't weaken post-conditions
	+ invariants of a superclass must be preserved 
		+ invariant (conditions in which an object makes sense. Cat are having 4 legs, a tail, meow meow,...)
	+ subclass shouldn't change values of private fields of superclass.
		+ Eg: python of javascript have no protection for the private fields.
### I: Inteface Segregation Principle (break inteface into more granular and specific ones).
### D: Dependency Inversion Principle (high-level classes shouldn't depend on low-level classes. Both should depend on abstractions. Abstractions shouldn't depend on details. details should depend on abstractions.)
  	Low level class: implement base operations such as working with a disk, connecting to database,...
  	
    High level class: contain complex business logic that directs low-level class to do things.
Normally, ppl start develop low-level class -> high-level class. This make business logic classes tend to become dependent on low-level class. Solve:
1. Describe interfaces for low-level operations that business class rely on. These intefaces count as high-level ones.
2. Create high-level classes dependent on those interfaces instead of on concrete low-level class.
3. Create low-level classes implement these interfaces. Those now dependent on high-lv classes.

## III. Creational Design Patterns:
### 1. Factory method: 
    is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

When to use:
- When you don't know beforehand the exact types and dependencies of the objects your code should work with.
- When you want to provide users of your library or framework with a way to extend its internal components.
- When you want to save system resources by reusing existing objects instead of rebuilding them each time.

### 2. Abstract Factory:
