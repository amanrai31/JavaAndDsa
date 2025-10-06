# CONTENT => Iterator || Comparable and Comparator

# 1. JAVA Iterator => See 01DS.md

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
