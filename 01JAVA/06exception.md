# CONTENT => EXCEPTIONS, MULTITHREADING  

Exceptions are unexpected event occurs at runtime. Can be handled. Two types => 1. Checked exception(compile time). 2. Unchecked exception(runtime)

Error => Indicate serious problem beyond of control & irrecoverable (e.g. jvm running out of memory, memory leak, infinite recursion) 

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
4. throws => exception that are thrown out of method must be specified by throws clause Used of exception handling without using try catch block. Throws required only for compile time exceptions It convince compiler & do not guarantee of normal termination of program.
5. finally => executed after catch. We put some common code in finally block.


**Methods to print exception information**
1. printStackTrace() => exception info, exception description, exception stack
2. toString() => exception info, exception description
3. getMessage() => exception description

**Types of exception**

1. Built-in exception => array/stringIndexOutOfBoundException, arithmeticException, IOException, classNotFoundException, fileNotFoundException, nullPointerException, runtimeException, illegalArgumentException. Further classifications => 1. Checked excep. 2. Unchecked excep.

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

#### Checked exception, Unchecked exception

1. Checked => Checked at compile time Must be handled using throw keyword. **Fully checked** => Where all child classes are also checked like IO exception, InterruptedException. **Partially checked** => Some of child classes are unchecked.

2. Uncheck exception

-----

# MultiThreading in JAVA

MT allows concurrent execution of 2 or more parts of pgm for maximum utilization of CPU each part of such pgm is called thread . Thread is light weight process within a process.

Thread is created using two mechanism => 1. Extending thread class. 2. Implementing runnable interface

**NOTE :** Our class can not extend any other class if we extend the thread class, using runnable gives object that can be shared amongst multiple threads. Extending thread class provide some inbuilt f/n like yields(), interrupt() etc. that are not available in Runnable interface.

Lifecycle and state of a thread => To get current status => `Thread.getState()`

At any point of time, Thread exists in following status
1. New => Thread is created (Not yet running)
2. Runnable state => Might actually running or ready to run (Thread scheduler decides)
3. Blocked/running state
4. Timed waiting
5. Terminated

**join() method =>** It will make thread wait (which is currently executing) & let thread2 complete its execution & is moved to Terminated state.

#### Main thread in java

When java program starts up, main thread starts running immediately. It is the thread from which other child thread will be spawned. Often it must be the last thread to finish execution coz it performs various shutdown actions. The default priority of main thread is 5 & for remaining thread priority will be inherited from parent to child (We can change priority of any thread)

**NOTE :** Thread.currentThread().join() => will tell main thread to wait for this thread (i.e. wait for itself) to die. Thus main thread wait for itself to die called deadlock

**Thread priority**




















