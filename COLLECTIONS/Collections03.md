# CONTENT => SET

## Set interface

Set interface is implemented by => `1. EnumSet, 2. HashSet, 3. LinkedHashSet 4. TreeSet`

The Set interface is used to store a collection of unique elements. Unlike a List, a Set does not allow duplicates, and it does not preserve the order of elements (unless you're using TreeSet or LinkedHashSet) also unlike List it has `no index based access` as it does not guarantee order.

### 1. HashSet class => Unordered collection of unique elements (Faster as no sorting applied). TC => O(1)

**NOTE :** Backed by HashMap internally || Hash table implementation || O(1) average time for basic operations

Elements in hash table are accessed using hash codes, think of hashCode like a function which generally gives the same hashCode for the same input.

#### HashSet methods

- add() | addAll()
- contains() | clear() | size()
- remove() | removeAll()

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

**We can make a set of custom class**

```java
class Student{
  int roll;
  String name;

public Student(int n, String name){
  this.rollNo = n;
  this.name = name;
}

public string toString(){   //override toString method
  return "Studen{rollNo=" + rollNo + ", name" + name + "}";
}
}

public class Main{
  public static void main(String[] args){
   HashSet<Student> set = new HashSet<>();
   set.add(new Student(1, aman));
   set.add(new Student(1, aman));                 // Set will accept duplicates in this case as they are
}
}
```

-----

### 2. TreeSet class => `Sorted set` of unique elements (bit slower as sorting is applied) based on red-black tree

Same as HashSet, main diff is that TreeSet stores its elements sorted automatically.

```java
import java.util.TreeSet; // Import the TreeSet class

TreeSet<String> cars = new TreeSet<>();
// If you add something and print, the set will be in sorted order.
```

TC => O(log n)

-----

### 3. LinkedHashSet => ordered by insertion => Implements Hash Table + Linked List. TC => O(1)average

Main diff is that LinkedHashSet remembers the order of insertion using a doubly-linked list across elements.

```java
import java.util.LinkedHashSet; // Import the LinkedHashSet class

LinkedHashSet<String> cars = new LinkedHashSet<>();
// The elements will appear in the order they were added 
```

