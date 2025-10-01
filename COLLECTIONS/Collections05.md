# Generics & Wrapper class

## Wrapper class

Class in java whose object wraps or contains a primitive data type. `chat - Character` | `byte - Byte` | `short - Short` | `int - Integer` | `float - Float` | `double - Double` | `boolean - Boolean`

### Why wrapper class

1. java.util package handles only objects
2. DS in collection framework (like ArrayList, HashMap) works with objects only(ref types)
3. An object is needed to support synchronization in multithreading.


### AutoBoxing & UnBoxing

1. AutoBoxing - Auto conversion of primitive data type to object of it's corresponding wrapper class.
`Integer obj1 = new Integer(12)` || `Integer obj1 = 12`
   
2. UnBoxing - Auto conversion of object of wrapper class to it's corresponding primitive data type
`int n = obj1`

## Generic Class

We can create classes that works with diff data types. An entity such as Class, Interface or method that operate on parameterized type is a Generic entity.

```java

public class GenericClass<T>{
  private T data;

  public GenericClass(T data){
    this.data = data;
  }
  public getData(){
    return this.data;
  }

}

```

```java
public class Dog<T, N>{

private T id;
private N name;

public Dog(T id, N name){
  this.id = id;
  this.name = name;
}

}

public class Main{
  public static void main(string[] args){
    Dog<string,string> d1 = new Dog<>("dtf5567", "benchoo");
    Dog<Integer, string> d2 = new Dog<>(4313, "rocky");
  }
}

```








