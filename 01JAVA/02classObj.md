# CONTENT => OOPS => CLASS, OBJECT, FUNCTION, CONSTRUCTOR, WRAPPER CLASS

### OOP

In Object oriented programming (OOP), we treat everything as an object. Main aim is to bind data and f/n(that operate on data) together into a single unit(class). 


**USE :** Better code structure + Maintainability + Scalability + Reusability

We will be covering => `class`, `object`, `Inheritance`, `polymorphism`, `encapsulation`, `Abstraction`

#### Prerequisite => Access modifiers

- public => accessible from any class
- protected => accessible within the package in which it is defined & in it's subclass/childClass ( including outside the package )
- default => Package protected
- private => accessible only within the defined class.

### Class

Class is a blueprint/prototype, from which objects are created. It is set of fields/props & methods. We can consider as user-defined data types.

**NOTE :** Only one class can be public in a package.

Class Declaration =>

1. Modifiers => Class can have only `pulic` OR `default` access.
2. class name => First letter Capital(recommended)
3. superclass (if any) => use keyword `extend`
4. interface (if any) => A comma seperated list of interface(s) (if any), use keyword `implements`
5. Body => {}

**Type of class used in real time application =>** `Nested class`, `annonymous class`, `lambda expression`

### Object

Object is building block of OOPs. An object is made up of => 
1. field/props/instance variable => Reflect properties of an object
2. methods/functions => Reflects behaviour of object
3. Identity => Unique name to object, enalble one object to interact with other.

#### Declare & initalization of object

Declare => `Cars m5cs;` => Value will be null, declareing a reference variable does not create an object.

Initalization => A `new` operator instantiate the class by allocating memory for new object & return ref to that memory, `new` operator also invokes the class constructor. `Cars m5cs = new Cars();` => There are 3 other way to create obj from a class

**Anonymous object =>** Instantiate but are not stored in a reference vaiable. Used for immediate method call & destroyed after method call.


### Methods/functions is JAVA

Collection of statements that does some specific task and `may` return result to caller. Gets execute when called.

**USE =>** Reuseability of code.

**Method declaration =>**
1. Access modifiers (All 4)
2. Return type
3. Method name
4. Parameter list
5. Execption list (Execption that you expect by f/n can throw)
6. Body {}

**Types of methods =>** 1. Bulit-in function  ||   2. user defined function

**Method signature =>** `Name of method` & `parameters list` (no of para, order of para, type of para)

**Method overloading =>** F/n name is same but overall signature is different. 

**NOTE :** When a method is called it completes all statements, reaches return statement(may or may not return), throws an exception. 

**Memory allocation for method call =>** When a method is called a stack frame (SF) is created within the stack area after that an argumant passed to a local variable & value returned by this method is stored in SF & after execution allocated SF would be deleted . There is stack pointer register which keep track of all SFs, this stack pointer register is managed by JVM.  

-----

### Wrapper class

It's object wrap primitive data types only.

**Need**
1. They convert primitive data type into Obj are needed to modify arguments passed into a method (Primitive data type passed by value).
2. java.util package handle only obj
3. Wrappers provide useful methods like `valurOf()`, `parseInt()`, `toString()` etc. that works for object only.
4. Java’s collections like ArrayList, HashMap, etc., can only store objects, not primitives.

**Primitive data type and their corresponding wrapper class** => `byte => Byte`, `int => Integer`, `double => Double`, `char => Character` & so on.

**AutoBoxing & unboxing**

```java
int a = 10;
Integer obj = a;                       // Autoboxing
int b = obj;                           // unboxing
```

```java
Double a = Double.valueOf(45.15);
int b = a.intValue();                   // do not work if a was not an object

Integer c = Interger.valueOf("101",2);   // Will treat this string as binary and convert to int value.
Integer c = Interger.valueOf("101");     // string to int
```

-----

## Constructor

It is a special method without any return type, used to set the fields of object and to initialize the object.

How it is diff from function => No return type(we can not write return inside constructor) || must be same name as class || called only once at the time of obj creation || can not be overridden (will be treated as diff f/n altogether) || constructor can not be abstract, final, static or synchronized

**Types =>** `Default (no parameters) constructor` || `Parameterized constructor`

**Constructor overloading =>** Same as f/n overloading. Provides Flexibility that allows creating objects with different initialization options. We can use constructor chaining (constructor chaining is actually a technique used within constructor overloading).






















































 


















