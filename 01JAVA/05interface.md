# CONTENT => INTERFACE,

Interface is an blueprint of class. Interface can have only abstract method(after java 8- we can have default, static & private methods too) and variables(public, static,final).

**USE =>** Used to achive abstraction & multiple inheritance, interface specify what a class must do not how.

**NOTE :** If a class implements an interface & does not provide all method's implementation then class must be declared abstract. 

### Diff b/w Interface & abstract class

1. Type of methods => Interface can have only abstrat methods & methods are public by default(Full abstraction), after java 8 Interface can have default & static methods also. AB class can have concrete methods too (Partial abstraction)
2. Type of variable => Interface have public, static, final variables only (variables are final by default). AB class can have non-static, non-final variables as well.
3. Interface => `implements`, AB Class => `extends`. Similarities - Bot can not be instantiated.

```java
interface Payment {
    void pay(double amount);
}
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
public class PaymentProcessor {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCard();
        payment.pay(500);

        payment = new UPI();
        payment.pay(200);
    }
}
```

### Nested interface

Interface inside class or inside another interface. Interface declared inside class either can be default, public,protected not private. We mention/implement interface as `className.interfaceName`.

1.Interface inside class

```java
class Test {
 interface Yes {void show();}  // We can use protected also
}

class Testing implements Test.Yes {
public void show(){
System.out.println("Show");
}
}
class Main{
 public static void main(String args[]){
   Test.yes.obj;
   Testing t = new Testing();
   obj = t;
   obj.show();
}
}
```

2. Interface in another interface => Same as above, nested interface can not use any other access modifier other than public(compile error).

#### Marker interface 
Empty interface (no fields, no methods) e.g. Serializable interface, clonable interface & remote interface.

#### Functional interface
It has precisely only one abstract method, but can have any no. of static & default methods. They are also called Single abstract method interface(SAM interface). Lambda expression is used to represent the instance of F.I. Annotation => `@FunctionalInterface`

```java
@FunctionalInterface
interface Square{ int calculate(int x);}
class Test{public static void main(String args{}){
  int a = 5;
  Sqaure s1 = (int x) -> x*x;   // lambda expression to define calculate method
  int ansr = s1.calculate(a);
}}

```

#### Comparator object
Used to order the obj of user defined classes. A comparator obj. is capable of comparing 2 objects of same class.


-----

# KEYWORDS

super, final, abstract, static, this, enum. **OTHER =>** assert, try, catch, throw, finally, native, null, strintfp, synchronized, transient, volatile.

1. super => use of super with variables, methods & constructor

2. final => a non-access modifier, applicable only to a variable, method or class.

- final class => Prevent inheritance (e.g. string class wrapper)
- final method => Prevent method overridding
- final variable => To create constant variable. ref can not be changed, though the content inside that object can be changed.

3. Abstract => Non- access modifier applicable for class & method only. Illegal combo of other modifiers w.r.t abstract => final, abstract native, abstract synchronized, abstract static, abstract private, abstract scriotfp

As a final method we can not override but we have to override the abstract methods for its implementation.

4. static => non-access modifier, applied with variable, method, block & nested class. Used for memory managment.

- 




