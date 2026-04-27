# CONTENT => Iterator || Comparable and Comparator

# 1. JAVA Iterator 

An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.

**METHODS =>** `hasNext()` || `next()` || `remove()`

```java
// Iterator works for collection only - you have to convert array to list.
import java.util.*;

Integer[] arr = {1, 2, 3};
List<Integer> list = Arrays.asList(arr);
Iterator<Integer> it = list.iterator();

while (it.hasNext()) {
    System.out.println(it.next());
}
```

**NOTE :** When we print array in `sout()` we get some ref like `[I@15db9742` I means array of type Integer. We do not get the whole array elements because array does not override toString method BUT Collections does.
```java
// If you want to print whole array
System.out.println(Arrays.toString(arr));  // [1, 2, 3] => manually apply toString method
```





```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Mahindra");
    cars.add("BMW");
    cars.add("Ford");

    Iterator<String> it = cars.iterator();       // Iterator for arrayList car.
    while (it.hasNext()) {
    String car = it.next();                      // Each time you call it.next(), moves the iterator one step forward.
    if (car.equals("Ford")) {
        it.remove();
    } else {
        System.out.println(car);
     }
    }
  }
}

```

**NOTE :** Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing size at the same time that the code is trying to loop.

**NOTE :** Never use == for string comparison in Java. Use .equals() instead because .equals() checks content only AND  `==` checks if both variables point to the same object in memory.
