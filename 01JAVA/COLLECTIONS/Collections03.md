# CONTENT => SET

## Set interface

Set interface is implemented by => `1. HashSet, 2. LinkedHashSet, 3. TreeSet, 4. EnumSet`

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

**We can make a set of custom classes**

```java
class Student{
  int roll;
  String name;

public Student(int n, String name){
  this.rollNo = n;
  this.name = name;
}

@Override
public string toString(){   //override toString method
  return "Studen{rollNo=" + rollNo + ", name" + name + "}";
}

@Override
public boolean equals(Object o){                  
  if(this == o) return true;
  if(o==null || getClass() != o.getClass) return false;
  Student student = (Student) o;
  return rollNo == stuent.rollNo;
}
}

@Override
public int hashCode(){                  // generate diff hashcode on the basis of roll no
  return Object.hash(rollNo);
}

public class Main{
  public static void main(String[] args){
   HashSet<Student> set = new HashSet<>();
   Student s1 = new Student(1, "aman");
   Student s2 = new Student(1, "appu")
   System.out.println(s1.equals(s2));  // return true as both student has same rollNo
   set.add(s1);                    // Set will accept duplicates in this case (if we did not create diff hashCode on the basis of rollNo)
   set.add(s2);
}

// Remove the hashCode function from Student class. the try to add same student multiple time in a set. Set will accept all of them happily, as they 
// all will have diff hashCodes even for the same Student. So, add a hashCode function that can differentiate based on rollNo.
// We have to override the equals & hashCode methods to create set of custom class.
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

