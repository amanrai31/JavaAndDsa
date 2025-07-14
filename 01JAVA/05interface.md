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






































