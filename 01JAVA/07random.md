
### field vs variable

- Field(class-level) => A variable declared inside a class, but outside any method, constructor, or block. It can be instance or static.
- Variable(general-term) => Any named storage location in Java: includes fields, local variables, parameters, etc.

**So, all fields are variables, but not all variables are fields.**

-----

```java
// File: MyApp.java => Multiple class in same file is not recommended => main method can exist in multiple classes.
public class MyApp {
    public static void main(String[] args) {
        System.out.println("Main from MyApp");
    }
}

class Another {
    public static void main(String[] args) {
        System.out.println("Main from Another");
    }
}
```
```bash
// bash => you decide which class to run
java MyApp      # Main from MyApp
java Another    # Main from Another
```
