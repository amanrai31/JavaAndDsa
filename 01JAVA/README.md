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

### Comments, keywords, class body, method body, string literal.

**Access modifiers =>** public, defalut, protected, private
**Non-Access modifiers** final, abstract, strictfp
