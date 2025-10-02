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

------

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
public class Dog<T, N>{               // primitive data types not supported

private T id;
private N name;

public Dog(T id, N name){
  this.id = id;
  this.name = name;
}

T getId(){
return this.id;         // OR => return id; Learn instance variable VS local variable
}

}

public class Main{
  public static void main(String[] args){
    Dog<String,String> d1 = new Dog<>("dtf5567", "benchoo");
    Dog<Integer, String> d2 = new Dog<>(4313, "rocky");
  }
}

```

### Java generic method

We can create a method that can be used with any type of data. `public <T> void genericMethod(T data){...}`. We can create genericMethod without generic class. 


### Bounded generic type, Upper bound, Lower bound

In general type parameter can accept any data type (except primitive). But if we want to use generic for some specific types only then we can use `bounded types`.

```java
// UPPER BOUND => USE extends keyword 
class Box<T extends Number> {   // T must be Number or its subclass
    private T value;

    public void set(T value) {
        this.value = value;
    }
}
// Now only types like Integer, Double, Float, etc. are allowed
```

```java
// LOWER BOUND => USE super keyword
public void addNumbers(List<? super Integer> list) {
    list.add(10);   // ✅ safe to add Integer
    // list.add(3.14); ❌ not allowed
}
 // the list can accept Integer and its supertypes (Number, Object).
```





















