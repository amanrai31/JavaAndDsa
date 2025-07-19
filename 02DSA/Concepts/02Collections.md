# CONTENT => COLLECTIONS

The Java Collections Framework provides a set of interfaces (like List, Set, and Map) and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces. All of these are part of the java.util package.

**Tip =>** Think of the Collections Framework as a toolbox. Interfaces like List define what tools can do, and classes like ArrayList are the actual tools that do the work.

Collection framework made up of => 1. Collection interface, 2. Map interface, 3. Iterator interface

Collection interface => List<E>, Set<E>, Queue<E>

## Common collection framework & their most common classes (List, Set, Map)

### 1. List interface

List interface represents an ordered collection of elements. You can access elements by their index, add duplicates, and maintain the insertion order.

**NOTE :** Use List when you care about order, you may have duplicates, and want to access elements by index.

1. ArrayList class    => `Resizable array` that `maintains order` and `allows duplicate`

**NOTE :** Elements of ArrayList are object, we can not use int, we have to use Integer instead.

```java
import java.util.ArrayList; 

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```

#### ArrayList methods
1. Add     => `list.add(item)`, `add(index,item)` || `addAll(Collection<T> items)`, `addAll(index, Collection<T> items)` 
2. Access  => `list.get(index)`
3. Change  => `list.set(index,item)`
4. Remove  => `list.remove(index)` || `list.clear()` => remove all elements of list
5. Size    => `list.size()`
6. Sort    => `Collections.sort()` => Manipulates original list
7. Reverse => `Collection.reverseOrder()`

**NOTE :** sort & reverse comes under Collection class

```java
// The List Interface => This means the cars is declared as a List (interface), but it stores an ArrayList object (the actual list).
import java.util.List;
import java.util.ArrayList;

List<String> cars = new ArrayList<>();
```

2. LinkedList class   => List with fast insert and remove operations

The LinkedList class is a collection which can contain many objects of the same type (very similar to arrayList in many cases as both follow List interface).

**Diff in ArrayList & LinkedList =>** The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed. || The LinkedList stores its elements in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

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

    Collections.sort(cars, Collections.reverseOrder()); // Sort cars

    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```
----- 

### 2. Set interface

The Set interface is used to store a collection of unique elements. Unlike a List, a Set does not allow duplicates, and it does not preserve the order of elements (unless you're using TreeSet or LinkedHashSet) also unlike List it has `no index based access` as it does not guarantee order.

1. HashSet class => Unordered collection of unique elements (Faster as no sorting applied)

```java
import java.util.HashSet; // Import the HashSet class

HashSet<String> cars = new HashSet<String>();
```
**NOTE :** Elements of HashSet are object. i.e. Integer(not int), String, Float etc.

#### HashSet methods
1. add()
2. contains()
3. remove()
4. clear()
5. size()

```java
import hava.util.HashSet;

HashSet<String> carsSet = new HashSet<>();
carsSet.add("BMW");
carsSet.add("Tata");
carsSet.add("M&M");
carsSet.add("BMW"); // Duplicate value

System.out.println(carsSet);
System.out.println(carsSet.size());
for(String el : carsSet){
System.out.println(el);
}
carsSet.remove("Tata");


```


2. TreeSet class => `Sorted set` of unique elements (bit slower as sorting applied)

Same as HashSet, main diff is that TreeSet stores its elements sorted automatically.

```java
import java.util.TreeSet; // Import the TreeSet class

TreeSet<String> cars = new TreeSet<>();
// If you add something and print, the set will be in sorted order.
```

3. LinkedHashSet => ordered by insertion

Main diff is that LinkedHashSet remembers the order of insertion

```java
import java.util.LinkedHashSet; // Import the LinkedHashSet class

LinkedHashSet<String> cars = new LinkedHashSet<>();
// The elements will appear in the order they were added 
```
-----

### 3. Map interface



- HashMap       => Stores key/value pairs with no specific order
- TreeMap       => Sorted map based on the natural order of keys
- LinkedHashMap => Maintains the order in which keys were inserted
