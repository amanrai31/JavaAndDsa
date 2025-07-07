# JAVA

Java is 3rd Gen, high level programming language, developed in 1991 in sunMicrosystems. Java is statically typed, robost, secure, high performance, portble, multithreaded, interpreted and OO(OOP) Language.

- **JDK** => JRE(Java runtime environment) + JAVAC, debugger, javaDocs, javaTools etc.

- **JRE** => JVM + Browser, applate support, plugins, Java Standard Library (java.lang, java.util, java.io, etc.). Install JRE if you **only** need to run Java apps.

- **JVM**(Java virtual machine => core execution engine) => Loads and executes Java bytecode (.class files), Memory management (Heap, Stack, Method Area), Garbage collection, Thread management, Security management

JAVA uses Garbage collector, execption handling & auto memory allocation to make it reliable & minimize errors.

OOPS => Everything in java is represented in class as an object(main f/n too). Organising a program in terms of collection of object is way of OOPs, each Obj represents the instance of a class. `Abstraction, Encapsulation, Inheritance, Polymorphism`.

**NOTE :** Java doesn't use pointers, multi inheritance, operator overloading, explicit memory allocation.

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

### Comments, keywords, expression, class body, method body, string literal, octal/hex representation

**Access modifiers =>** public, defalut, protected, private

**Non-Access modifiers** final, abstract, strictfp

-----

### Variables & Data types

`ROM, RAM, bit, bytes, memoery allocation`

**Variable** => Variables are like containers to store data. => Declaration & intialization, taking input

1. Local variable => Defined inside block/method/constructor (intialization mendatory, accessable only inside that scope).
2. Instance variable => non-static, decleared in class(ouside block) & accessed by obj.
3. static/class variables => Declared with static keyword, in class(ouside block), accessed by class directly.

**Data types**

Primitive Variables => byte(1), short(2), int(4), long(8) || float(4), double(8byte) || char(2) || boolean(1bit)

Reference Variables => Object references (String, Arrays, Custom classes), Interface references


```java
com.company
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
- Package => Way to organise projects, consider as folder. Domain name reversed. (Learn a bit more about)
- Range => `int a = Integer.MAX_VALUE`, `double b = Double.MIN_VALUE`
- Size => `System.out.println(Long.BYTES)`, `System.out.println(Double.BYTES)`
- Casting => `int n =20; byte b = (byte)(n/2);`

-----

### Operator, Decision making

- Assignment operator => `=`
- Arithmatic operator => `+, -, *, /, %`
- Comparison operator => `>, >=, <, <=, ==, !=`
- Logical operator => `&&, ||, !`
- Bitwise operator => `&, |, ~, ^, <<, >>, >>>`
- Instance of => Used for type checking if an obj is class, subclass or interface

Operator precedance => `a = b+++c; => a = b ++ + c`, `a = b+++++c; => a = b ++ ++ +c => //ERROR`







