# CONTENT => COLLECTIONS

The Java Collections Framework provides a set of interfaces (like List, Set, and Map) and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces. All of these are part of the java.util package.

**Tip =>** Think of the Collections Framework as a toolbox. Interfaces like List define what tools can do, and classes like ArrayList are the actual tools that do the work.

Collection framework made up of => 1. Collection interface, 2. Map interface, 3. Iterator interface

Collection interface => List<E>, Set<E>, Queue<E>

## Common collection framework & their most common classes (List, Set, Map)

## List interface

List interface represents an ordered collection of elements. You can access elements by their index, add duplicates, and maintain the insertion order.

**NOTE :** Use List when you care about order, you may have duplicates, and want to access elements by index.

### 1. ArrayList class    => `Resizable array` that `maintains order` and `allows duplicate`

**NOTE :** Elements of ArrayList are object, we can not use int, we have to use Integer instead.

**NOTE :** Fast random access (O(1) for get/set). Slow insertion/deletion in middle (O(n)). Not thread safe. Default capacity: 10, grows by 50% when full

```java
import java.util.ArrayList; 

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```

#### ArrayList methods
1. Add             => `list.add(item)`, `add(index,item)` || `addAll(Collection<T> items)`, `addAll(index, Collection<T> items)` 
2. Get             => `list.get(index)`
3. Set/update      => `list.set(index,item)`
4. Remove          => `list.remove(index)` || `list.clear()` => remove all elements of list
5. Size            => `list.size()`
6. Sort            => `Collections.sort()` => Manipulates original list
7. Reverse         => `Collection.reverseOrder()`

**NOTE :** sort & reverse comes under Collection class

```java
// The List Interface => This means the cars is declared as a List (interface), but it stores an ArrayList object (the actual list).
import java.util.List;
import java.util.ArrayList;

List<String> cars = new ArrayList<>();
```

### 2. LinkedList class   => List with fast insert and remove operations

The LinkedList class is a collection which can contain many objects of the same type (very similar to arrayList in many cases as both follow List interface).

**Diff in ArrayList & LinkedList =>** The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed. || The LinkedList stores its elements in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

**NOTE :** Implements both List and Deque interfaces || Implements both List and Deque interfaces || Slow random access (O(n)) || Higher memory overhead due to node pointers.

**LinkedList methods**
1. addFirst()
2. addLast()
3. removeFirst()
4. removeLast()
5. getFirst()
6. getLast()
7. All other methods which are above for ArrayList

```java
// sort & reverse

import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mahindra");

    Collections.sort(cars, Collections.reverseOrder()); // Sort cars in reverse

    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```

#### Vector

Legacy synchronized version of ArrayList
Thread-safe but with performance overhead
Generally avoided in favor of ArrayList with explicit synchronization

----- 



## Map interface

The Map interface is a part of the Java Collections Framework and is used to store key-value pairs. Each key must be unique, but values can be duplicated.

### 1. HashMap       => Stores key/value pairs with `no specific order`, Allows one null key

=> Instead of accessing elements by an index (like with ArrayList), we use a key to retrieve its associated value.

**NOTE :** Keys and values in a HashMap are actually objects. => A HashMap can store many different combinations: 1. String keys and Integer values 2.String keys and String values 3. Integer keys and String values

```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>(); //HashMap object

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Dehli");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo"); // Duplicate
    capitalCities.put("USA", "W DC");

    System.out.println(capitalCities);
    System.out.println(capitalCities.get("India"));
    System.out.println(capitalCities.size());
    System.out.println(capitalCities.remove("England"));
    System.out.println(capitalCities.values() instanceof Collection);
    for (String i : capitalCities.keySet()) {
      System.out.println("key: " + i + " value: " + capitalCities.get(i));
    }
    System.out.println(capitalCities.conatains("India"));
  }
}
```

**Note :** Above, if the same key (like "Norway") is added more than once, the latest value will overwrite the previous one, because keys in a HashMap must be unique.

#### HashMap methods
1. put()
2. get()
3. remove()
4. clear()
5. size()
6. keySet() => return Collection<String> of keys, returns keys
7. values()  => return Collection<String> of values, return values
8. map.conatinsKey(), map.containsValue()
9. map.isEmpty()

### 2. TreeMap       => `Sorted map` based on keys, does not allow null key

```java
import java.util.TreeMap; // Import the TreeMap class

TreeMap<String, String> capitalCities = new TreeMap<>();
```
Same method as HashMap

### 3. LinkedHashMap => Maintains the order in which keys were inserted

**NOTE :** Use LinkedHashMap when you want predictable iteration order (insertion order).

```JAVA
import java.util.LinkedHashMap; // Import the LinkedHashMap class

LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();
```


-----

## JAVA Iterator => See 01DS.md

-----

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






