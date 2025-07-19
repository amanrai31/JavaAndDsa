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
1. Add    => `list.add(item)`, `add(index,item)` || `addAll(Collection<T> items)`, `addAll(index, Collection<T> items)` 
2. Access => `list.get(index)`
3. Change => `list.set(index,item)`
4. Remove => `list.remove(index)` || `list.clear()` => remove all elements of list
5. Size   => `list.size()`
6. Sort   => `Collections.sort()`

```java
// The List Interface => This means the cars is declared as a List (interface), but it stores an ArrayList object (the actual list).
import java.util.List;
import java.util.ArrayList;

List<String> cars = new ArrayList<>();
```


2. LinkedList class   => List with fast insert and remove operations
























----- 

### 2. Set interface

- HashSet class => Unordered collection of unique elements
- TreeSet class => Sorted set of unique elements (natural order)
- LinkedHashSet => Maintains the order in which elements were inserted

### 3. Map interface

- HashMap       => Stores key/value pairs with no specific order
- TreeMap       => Sorted map based on the natural order of keys
- LinkedHashMap => Maintains the order in which keys were inserted
