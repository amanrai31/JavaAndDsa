# JAVA

Java is 3rd Gen, high level programming language, developed in 1991 in sunMicrosystems. Java is statically typed, robust, secure, high performance, portable, multithreaded, interpreted and OO(OOP) Language.

- **JDK** => JRE(Java runtime environment) + JAVAC, debugger, javaDocs, javaTools etc.

- **JRE** => JVM + Browser, applet support, plugins, Java Standard Library (java.lang, java.util, java.io, etc.). Install JRE if you **only** need to run Java apps.

- **JVM**(Java virtual machine => core execution engine) => Loads and executes Java bytecode (.class files), Memory management (Heap, Stack, Method Area), Garbage collection, Thread management, Security management. JAVA run on JVM not directly on machine that's why it is platform independent.

JAVA uses Garbage collector, exception handling & automatic memory allocation to make it reliable & minimize errors.

OOPS => Everything in java is represented in class as an object(main f/n too). Organizing a program in terms of collection of object is way of OOPs, each Obj represents the instance of a class. `Abstraction, Encapsulation, Inheritance, Polymorphism`.

**NOTE :** Java doesn't use pointers, multiple inheritance, operator overloading, explicit memory allocation.

=> Source-file => `compiler` => ByteCode/.class => `JVM` => native code.

**Process of JAVA programming =>** 1. Create pgm using editor(plain), save as .java file. 2. compile by typing `javac <filename>` in terminal. 3. Run by typing `java <filename>`

### First java pgm

```java
public class Main {
  public static void main(String[] args){
    System.out.println("Hello world");   // System is predefined class, provide access to system. out is a variable of type output stream connected to console.
}
}
```

**NOTE :** The JVM's `ClassLoader` subsystem locates the compiled `Main.class` file. It loads the bytecode into memory. The class is passed to the `Bytecode Verifier`, which checks for structural correctness and security (no invalid opcodes, etc). The main class's metadata (methods, fields, constant pool, etc.) is stored in the `method area`. Return error if main method is not there with exact signature. `Execution engine` begains the execution & finish. Garbage Collection may kick in to clean unused memory.

### Comments, keywords, expression, class body, method body, string literal, octal/hex representation

**Access modifiers =>** public, default, protected, private

**Non-Access modifiers =>** final, static, abstract, strictfp, synchronised, volatile, transient, native

-----

### Variables & Data types

`ROM, RAM, bit, bytes, memory allocation`

**Variable** => Variables are like containers to store data. => Declaration & initialization, taking input

1. Local variable => Defined inside block/method/constructor (initialization mandatory, accessible only inside that scope).
2. Instance variable => non-static, declared in class(outside block) & accessed by obj.
3. static/class variables => Declared with static keyword, in class(outside block), accessed by class directly.

**Data types**

Primitive Variables => byte(1), short(2), int(4), long(8) || float(4), double(8byte) || char(2) || boolean(1bit)

Reference Variables => Object references (String, Arrays, Custom classes), Interface references

**NOTE :** Primitive & ref of non-primitive are stored in `stack memory` & actual data of non-primitive stored in `Heap memory`

```java
package com.company;
public class Main{
  public static void main(String[] args){
    int kids = 2;
    int teens = 4, adults = 5;
    int totalPeople = kids + teens + adults;
    System.out.println("Total people : " + total people );
}
}

```

- Wrapper class, BigDecimal class(for more accurate decimal calculation)
- Range => `int a = Integer.MAX_VALUE`, `double b = Double.MIN_VALUE`
- Size => `System.out.println(Long.BYTES)`, `System.out.println(Double.BYTES)`
- Casting => `int n =20; byte b = (byte)(n/2);`

- **Package** => Way to organizing projects(group related classes logically and physically ), consider as folder. While importing package => Domain name reversed. `Built-in packages => java.util, java.io, java.net, java.sql`.

#### Character

- `chat ch = 'A';`  => Declare inside single quote.
- `char[] arr = {'a','b'};` => Declare inside single quote.
- Scan char => `char ch = sc.next().charAt(0);`

-----

### Operator, Decision making, loops

1. Operators

- Assignment operator => `=`
- Arithmetic operator => `+, -, *, /, %`
- Comparison operator => `>, >=, <, <=, ==, !=`
- Logical operator => `&&, ||, !`
- Bitwise operator => `&, |, ~, ^, <<, >>, >>>`
- Instance of => Used for type checking if an obj is class, subclass or interface

Operator precedence => `a = b+++c; => a = b ++ + c`, `a = b+++++c; => a = b ++ ++ +c => //ERROR` complied in pairs from left to right.

2. Decision making => Controls the flow of execution based on certain conditions.

- if, if-else, else-if, nested if, switch
- Jump statements => `continue`, `break`, `return`

3. Loops

- for loop, while loop, do-while loop, `read only loop => for(T element: collection of obj/array){statement...}`

-----





























