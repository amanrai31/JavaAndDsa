# CONTENT => EXCEPTIONS, MULTITHRADING 

Exceptions are unexpected event occurs at runtime. Can be handled. Two types => 1. Checked execption(compile time). 2. Unchecked execption(runtime)

Error => Indicate serious problem beyond of control & irrecoverable (e.g. jvm running out of memory, memory leak, infinite recurrsion) 

Exception handling => Handling runtime error to preserve regular flow of program. When an exception occurs within a method, it creates an obj(exception obj) containing all info about that exception such as name,description, & state of program.

**Reasons why exception occurs**
1. invalid user input
2. device failure
3. network connection
4. physical limitation(out of memory)
5. Code error

**NEED :**
1. Propagation of error
2. Meaningful error reporting
3. Identifying error type
4. Provision to complete program execution

**5 keywords in E.H. =>** try, catch, throw, throws, finally
1. Try => Statement/expression that can throw error, put those inside try block
2. catch(exception handler) => catch block handles exception of try block. Try block is always followed by catch block, there may be more than 1 catch block each handling exception to the type indicated by its argument.
3. throw => system generated exception auto thrown by java runtime system. To manually throw an exception form try to catch use - throw.
4. throws => exception that are thrown out of method must be specified by throws clause Used of exception handling without using try catch block. Throws required only for compile time exceptions It convince complier & do not gurantee of normal termination of program.
5. finally => executed after catch. We put some common code in finally block.


**Methods to print exception information**
1. printStackTrace() => exception info, execption desciption, exception stack
2. toString() => exception info, execption desciption
3. getMessage() => execption desciption

**Types of exception**

1. Built-in exception => array/stringIndexOutOfBoundException, arithmaticException, IOException, classNotFoundException, fileNotFoundException, nullPointerException, runtimeException, illegalArgumentException. Further classifications => 1. Checked excep. 2. Unchecked excep.

2. User-defined
```java
class AgeValidator {
   public void checkAge(int age) {
       if (age < 18) {
           throw new IllegalArgumentException("Age must be 18 or above");
       }
       System.out.println("Age is valid: " + age);
   }
}

public class Test {
   public static void main(String[] args) {
       AgeValidator validator = new AgeValidator();
       
       try {
           validator.checkAge(25);  // Works fine
           validator.checkAge(15);  // Throws exception
       } catch (IllegalArgumentException e) {
           System.out.println("Error: " + e.getMessage());
       }
   }
}
```

#### Checked excep, Unchecked excep

1. Checked => Checked at compile time Must be handled using throw keyword. **Fully checked** => Where all child classes are also checked like IO exception, InterruptedException. **Partially checked** => Some of child classes are unchecked.

2. Uncheck execption

-----

# MultiThreading in JAVA
































