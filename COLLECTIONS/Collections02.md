# CONTENT => SET

## Set interface

The Set interface is used to store a collection of unique elements. Unlike a List, a Set does not allow duplicates, and it does not preserve the order of elements (unless you're using TreeSet or LinkedHashSet) also unlike List it has `no index based access` as it does not guarantee order.

### 1. HashSet class => Unordered collection of unique elements (Faster as no sorting applied). TC => O(1)

**NOTE :** Elements of HashSet are object. i.e. Integer(not int), String, Float etc.
**NOTE :** Backed by HashMap internally || Hash table implementation || O(1) average time for basic operations

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


### 2. TreeSet class => `Sorted set` of unique elements (bit slower as sorting applied)

Same as HashSet, main diff is that TreeSet stores its elements sorted automatically.

```java
import java.util.TreeSet; // Import the TreeSet class

TreeSet<String> cars = new TreeSet<>();
// If you add something and print, the set will be in sorted order.
```

### 3. LinkedHashSet => ordered by insertion => Implements Set & Binary search tree. TC => O(logn)

Main diff is that LinkedHashSet remembers the order of insertion

```java
import java.util.LinkedHashSet; // Import the LinkedHashSet class

LinkedHashSet<String> cars = new LinkedHashSet<>();
// The elements will appear in the order they were added 
```
