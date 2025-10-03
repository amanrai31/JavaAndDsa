# COLLECTION FRAMEWORK

# CONTENT => COLLECTIONS, LIST, ITERATOR

The Java Collections Framework provides a set of interfaces (like List, Set, and Map) and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces. All of these are part of the java.util package.

`WHY => Saves you from writing data structures from scratch (like arrays, linked lists, hash tables).`

Collection framework made up of => 
1. `Collection interface` => Interface that implements Collection interface  => [`List`, `Set`, `Queue`]
2. `Map interface`        => Classes that implement Collection interface    => [HashMap, TreeMap, Hashtable, LinkedHashMap]
3. `Iterator interface`

------

# 1. Collection Interface (List, Set, Queue)

Collection interface => 3 interfaces that implement Collection interface => 1. `List`, 2. `Set`, 3. `Queue`
   
- classes that implements `List<E> interface`  => ArrayList, LinkedList, stack, Vector
- classes that implements `Set<E> interface`   => HashSet, TreeSet(sortedSet)
- classes that implements `Queue<E> interface` => PriorityQueue, ArrayDeque

## Methods of Collection interface

- `int size()` | `boolean isEmpty()` | `boolean contains(Object O)` | `boolean containsAll(Collection<> c)`  
- `boolean add(E e)` | `boolean addAll(Collection<> c)` | `boolean remove(Object O)` | `void clear()`
- `boolean removeAll(Collection<> c)` => removes only common elements(intersection) | `boolean retainAll(Collection<> c)`
- `Object[] toAray()` => returns array containing all elements in Collection

-----

## List interface (ArrayList, LinkedList, stack, Vector)

List interface represents an ordered collection of elements. You can access elements by their index, add duplicates, and maintain the insertion order.

**NOTE :** Use List when you care about order, you may have duplicates, and want to access elements by index.

### List interface methods

- `get(int index)` | `set(int index, E element)` => Replace the element at specific index(update method)
- `add(int index, E element)` => add element at specific index and shift current elements to right
- `indexOf(Object o)` => 1st occurence | `lastIndexOf(object 0)`
- `subList(int from, int to)` =? to/last is exclusive

### 1. ArrayList class    => `Resizable array` that `maintains order` and `allows duplicates`. (Dynamic array)

**NOTE :** Elements of ArrayList are object, we can not use primitives like int, we have to use Integer instead.

**NOTE :** Fast random access (O(1) for get/set). Slow insertion/deletion in middle (O(n)). Not thread safe. Default capacity: 10, grows by 50% when full

```java
import java.util.ArrayList; 

ArrayList<Integer> nums = new ArrayList<Integer>(); // Create an ArrayList object
cars.remove(2);                    // Removes value at index 2 (if we provide int value as a parameter)
cars.remove(Integer.valueOf(2));   // removes the value 2 (if we provide object as a parameter)
```

#### ArrayList methods (All methods of Collection interface & List Interface)
1. Add             => `list.add(item)`, `add(index,item)` || `addAll(Collection<T> items)`, `addAll(index, Collection<T> items)` 
2. Get             => `list.get(index)`
3. Set/update      => `list.set(index,item)`
4. Remove          => `list.remove(index)`, `list.remove(Object O)` || `list.clear()` => remove all elements of list
5. Size            => `list.size()`
6. Sort            => `Collections.sort()` => Manipulates original list
7. Reverse         => `Collection.reverseOrder()`

```java
// The List Interface => This means the cars is declared as a List (interface), but it stores an ArrayList object (the actual list).
import java.util.List;
import java.util.ArrayList;

List<String> cars = new ArrayList<>();
```

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

    Collections.sort(cars, Collections.reverseOrder()); // Sort cars in reverse => Collections.sort(list, comparator)
    // OR we can do => Collections.sort(cars); Collections.reverse(cars); 

    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```

### 2. LinkedList class   => Implements both List and Deque interfaces

List with fast insert and remove operations. The LinkedList class is a collection which can contain many objects of the same type (very similar to arrayList in many cases as both follow List interface).

**Diff in ArrayList & LinkedList =>** The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed. || The LinkedList stores its elements in "containers." The list has a link to the first container and each container has a link to the next container in the list (prev & next pointers). To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

**NOTE :** Implements both List and Deque interfaces || Slow random access (O(n)) || Higher memory overhead due to node pointers.

**LinkedList methods**
1. addFirst()
2. addLast()
3. removeFirst()
4. removeLast()
5. getFirst()
6. getLast()
7. All other methods which are above for ArrayList

#### Vector

Legacy synchronized version of ArrayList
Thread-safe but with performance overhead
Generally avoided in favor of ArrayList with explicit synchronization

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






