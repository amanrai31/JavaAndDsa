# CONTENT => MAP

## Map interface

The Map interface is a part of the Java Collections Framework and is used to store key-value pairs. Each key must be unique, but values can be duplicated.

**Classes that implement Map Interface =>** `HashMap, TreeMap, LinkedHashMap, EnumMap, WeakHashMap` 

### Map interface Methods

- `put(K,V)` | `putAll(Map<> m)` | `putIfAbsent(K,V)`
- 

### 1. HashMap       => Stores key/value pairs with `no specific order`, allows one null key

=> Instead of accessing elements by an index (like with ArrayList), we use a key to retrieve its associated value.

**NOTE :** Keys and values in a HashMap are actually objects. => A HashMap can store many different combinations like: 1. String keys and Integer values 2.String keys and String values 3. Integer keys and String values

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
