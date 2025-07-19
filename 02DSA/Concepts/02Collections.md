# CONTENT => COLLECTIONS

The Java Collections Framework provides a set of interfaces (like List, Set, and Map) and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces. All of these are part of the java.util package.

**Tip =>** Think of the Collections Framework as a toolbox. Interfaces like List define what tools can do, and classes like ArrayList are the actual tools that do the work.

Collection framework made up of => 1. Collection interface, 2. Map interface, 3. Iterator interface

Collection interface => List<E>, Set<E>, Queue<E>

## Common collection framework & their most common classes (List, Set, Map)

### 1. List interface

List interface represents an ordered collection of elements. You can access elements by their index, add duplicates, and maintain the insertion order.

**NOTE :** Use List when you care about order, you may have duplicates, and want to access elements by index.

1. ArrayList class    => `Resizable array` that maintains order and allows duplicates

- LinkedList class   => List with fast insert and remove operations
























----- 

### 2. Set interface

- HashSet class => Unordered collection of unique elements
- TreeSet class => Sorted set of unique elements (natural order)
- LinkedHashSet => Maintains the order in which elements were inserted

### 3. Map interface

- HashMap       => Stores key/value pairs with no specific order
- TreeMap       => Sorted map based on the natural order of keys
- LinkedHashMap => Maintains the order in which keys were inserted
