# CONTENT => INHERITANCE, Polymorphism, Abstraction

## INHERITANCE

INHERITANCE allow one class to inherit the features(fields, methods, nested classes) of another class. `class Subclass extends Superclass {methods & fields}`. Usually we use inheritance, polymorphism and other concept of OOPs together.

**USE =>** Reusability || **Terms =>** Superclass(parent), Subclass(child)

#### Types of inheritance
1. Single Inh => one class inherits some other class
2. Multilevel Inh => class A inherited by class B and class B is inherited by class C and so on.
3. Hierarichal Inh => class A is inherited by many classes.
4. Hybrid Inh => Mix of any two above.
5. Multiple inheritnce => Java does not support (child can inherit more that 1 parent class), we use interface for this.

**NOTE :** 1 => Except `Object class` every class has one and only one superclass. 2 => Subclass inherits all from superclass except constructor. 3 => To access private members of supperclass we can use public/protected methods like getters/setters.

#### What can be done in subclass
1. We can inherit members as it is(can directly use them), replace them, hide them or supplement them with new member
2. we can write new fields/methods that are not in superclass.
3. We can write new instance methods with same signature (overriding)
4. We can write new static method have same signature as the one in superclass thus hidding it.

**Why Java does not support multiple inheritance =>** In MI child can inherit more that 1 parent class, problem occures when there is method with same signature in both parent classes and in the child class. On that method call compiler can get confused wchich one to call and which one will get priority. (DIAMOND PROBLEM), there will be problem in constructor chaining Also there are very few cases where we actually need MI. (We can use interface for this)

=> In java a class can implement 2 or more interfaces, in case both implemented interface contain default method signature then class should explicitly specify which default method to be used, or it should override the default method.

```java
interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
    void move();
}
interface Machine {
    default void start() {
        System.out.println("Machine is starting...");
    }
    void operate();
}
class Car implements Vehicle, Machine {
    private String model;
    public Car(String model) {
        this.model = model;
    }
    
    @Override
    public void start() {
        System.out.println("Car " + model + " is starting...");
        
        // Can call specific interface's default method if needed, depends on what you want to call
        Vehicle.super.start();  
        Machine.super.start();  
    }
    
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
    
    @Override
    public void operate() {
        System.out.println("Car is operating");
    }
}

class Motorcycle implements Vehicle, Machine {
    @Override
    public void start() {
        Vehicle.super.start();
    }
    
    @Override
    public void move() {
        System.out.println("Motorcycle is moving");
    }
    
    @Override
    public void operate() {
        System.out.println("Motorcycle is operating");
    }
}

class ConflictingDefaultDemo {
    public static void main(String[] args) {
        System.out.println("=== Car Example ===");
        Car car = new Car("Toyota");
        car.start();
        car.move();
        car.operate();
        System.out.println("\n=== Motorcycle Example ===");
        Motorcycle bike = new Motorcycle();
        bike.start();
        bike.move();
        bike.operate();
    }
}
```
-----

## Polymorphism 

Polymorphism means having many forms. Real world analogy => A person at same time is a father, a husband, an employee, so same person posses diff behaviours in diff situation. 

**Types :**
1. Compile time Polymorphism (Static Polymorphism) => Method overloading
2. Runtime Polymorphism (Dynamic Polymorphism) => Method overriding

**Need :** Ease of code, we do not have to remmenber diff names for all function doing similar work.

**1. Method overloading =>** Method name is same but overall method signature is changed i.e. changes in parameters. 

**NOTE :** Complier does not consider the return type while differntiating the overloading. Also we can overload static & main method too.

**NOTE :** What if exact prototype does not match with argument? => 1. Type conversion to higher type(in same family). 2. Type conversion to next higher family, suppose if there is no long data available for an int data type, then it will search for an float data type.

**2. Method overriding =>** When a subclass has method with same method signature & same return type as a method in it's super class.

**Rules =>**
1. Overriding & access modifier => The access modifier for an overrding method can not allow less access than overridden method (Can allow more)
2. final & private methods & constructor can not be overridden
3. We can have multilevel method overriding.
4. Static method => Can not overridden, when we define a static method with same signature as that one in superclass then it is `method hidding` => Will call child's static method. `See PUBLIC => PAGE 13`
5. Learn about (method overriding & exception handling) || method overriding & abstract class || method overriding & synchronized method.

### UUPERCASTING

```java
class Parent{ void print() {System.out.println("Parent")}}
class Child1 extends Parent{void print() {System.out.println("Child1")}}
class Child1 extends Parent{void print() {System.out.println("Child2")}}
class Test{
public static void main(String[] args){
Parent a = new Parent();
Child1 b = new Child1();
Child2 c = new Child2();

Parent ref;
ref = a;
ref.print();                       // Parent
ref = b                                        // reference type of ref is Parent(compile time) & actual object type is B(runtime)
ref.print();                       // Child1
ref = c;
ref.print();                       // Child2
}
}

// A superclass reference varaible can refer to a subclass object. This is called `UUPERCASTING`.
// Resolved at runtime and depend on type of object being refered to (not on type of refered variable) that determines which version of overridden method will be executed.

`SuperclassA refV = new subclassB() => obj refered = subclassB || type of refV is superclassA`

```java
class A {int x = 10;}
class B extends A {int x = 20;}
public class Test {
public static void main(String args[]){
  A a = new B();                      // object of type B
  System.out.println(a.x);            // 10, variable are not overridden so `a.x` will refer to data member of superclass.
}
}

```

**NOTE :** Fields determined by	Reference Type (at compile time), Methods	determined by Actual Object Type (at runtime).

-----

## Abstraction

Process of hiding implementation details and showing only the essential features of an object. (Abstract methods declared without implementation & abstract method can not be declared as final)

**NEED :** Hide complex internal logic. Expose only relevant functionalities, improve code maintainability, flexibility & security.

### Abstraction is achived in 2 ways
1. Abstract class 
2. Interface      => Full abstraction (only method declarations in older versions; now can have default/static methods)

#### 1. Abstract class

- Cannot be instantiated (new Animal() is not allowed), can not create object from Abstract class. We can inherit them only.
- Can have constructors, variables, and methods (can have both abstract and concrete methods => that's why it is partial abstraction)
- Child class must implement all abstract methods

**NOTE :** We Cannot instantiate abstract class but we can have ref. to abstract class type though. `Shape s1 = new Circle("red", 14); // Shape is abstract class here`

**NOTE :** Like interface we can have static method in AB class that can be called independently.

**NOTE :** If child is not able to implement all the abstract methods of base AB class then we have to declare that child as Abstract class too so that next level child can implement remaining AB methods.

**NOTE :** The constructor of Abstract class is called when an instance of an inherited class is created.

```
abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);               // Calls Animal constructor, or if we do not write than it can call automatically
        System.out.println("Dog constructor called");
    }
}
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");             // Animal a = new Animal("Generic"); => This would cause error
    }
}
```



