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

1. Modifiers => Class can have only `public` OR `default` access.
2. class name => First letter Capital(recommended)
3. superclass (if any) => use keyword `extend`
4. interface (if any) => A comma separated list of interface(s) (if any), use keyword `implements`
5. Body => {}

**Type of class used in real time application =>** `Nested class`, `anonymous class`, `lambda expression`

### Object

Object is building block of OOPs. An object is made up of => 
1. field/props/instance variable => Reflect properties of an object
2. methods/functions => Reflects behavior of object
3. Identity => Unique name to object, enable one object to interact with other.

#### Declare & initialization of object

Declare => `Cars m5cs;` => Value will be null, declaring a reference variable does not create an object.

Initialization => A `new` operator instantiate the class by allocating memory for new object & return ref to that memory, `new` operator also invokes the class constructor. `Cars m5cs = new Cars();` => There are 3 other way to create obj from a class

**Anonymous object =>** Instantiate but are not stored in a reference variable. Used for immediate method call & destroyed after method call.


### Methods/functions is JAVA

Collection of statements that does some specific task and `may` return result to caller. Gets execute when called.

**USE =>** Reusability of code.

**Method declaration =>**
1. Access modifiers (All 4)
2. Return type
3. Method name
4. Parameter list
5. Exception list (Exception that you expect by f/n can throw)
6. Body {}

**Types of methods =>** 1. Built-in function  ||   2. user defined function

**Method signature =>** `Name of method` & `parameters list` (no of para, order of para, type of para)

**Method overloading =>** F/n name is same but overall signature is different. 

**NOTE :** When a method is called it completes all statements, reaches return statement(may or may not return), throws an exception. 

**Memory allocation for method call =>** When a method is called a stack frame (SF) is created within the stack area after that an argument passed to a local variable & value returned by this method is stored in SF & after execution allocated SF would be deleted . There is stack pointer register which keep track of all SFs, this stack pointer register is managed by JVM.  

-----

### Wrapper class

It's object wrap primitive data types only.

**Need**
1. They convert primitive data type into Obj are needed to modify arguments passed into a method (Primitive data type passed by value).
2. java.util package handle only obj
3. Wrappers provide useful methods like `valueOf()`, `parseInt()`, `toString()` etc. that works for object only.
4. Java’s collections like ArrayList, HashMap, etc., can only store objects, not primitives.

**Primitive data type and their corresponding wrapper class** => `byte => Byte`, `int => Integer`, `double => Double`, `char => Character` & so on.

**AutoBoxing & unboxing**

```java
int a = 10;
Integer obj = a;                       // Auto-boxing
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

**Constructor chaining** => Two ways
1. Same class (using this keyword)
2. from child class (using super keyword)


**NOTE :** this should be the 1st line of the constructor. There should be at-least one constructor without `this`.

```java
// Constructor chaining in same class => using this 
public class Employee {
    private String name;
    private int id;

    public Employee() {                                       // Default constructor
        this("Unknown", 0);                                   // Calling main constructor which is accepting both parameters
        System.out.println("Default constructor executed");
    }

    public Employee(String name) {                            // Constructor with name only
        this(name, 0);
        System.out.println("Constructor with name executed");
    }

    public Employee(String name, int id) {                      // Main Constructor with name and id (All parameters)
        this.name = name;
        this.id = id;
        System.out.println("Main constructor with all parameters executed");
    }

    public void displayInfo() {
        System.out.println("Employee: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.displayInfo();
        System.out.println();

        Employee e2 = new Employee("John");
        e2.displayInfo();
        System.out.println();

        Employee e3 = new Employee("Sarah", 101);
        e3.displayInfo();
        System.out.println();

    }
}
```
**See copy constructor in => copyConstructor.java**

**Private constructor :** Declared with private access modifier, where we use pvt constructor => 1. Internal constructor chaining. 2. Singleton class design patterns. 3. Utility/helper classes.

Singleton class => We can not have more than one object. Applied for networking and DB connectivity etc..











































 


















