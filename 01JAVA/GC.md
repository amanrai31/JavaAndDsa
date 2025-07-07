# Garbage collector

Automatically free up memory by removing unused objects.
**Benefit:** Prevents memory leaks and reduces manual memory management.
**Process:** GC runs periodically, identifies and removes objects that have no references pointing to them.

### Memory Generations

**1. Young Generation**

- **Eden Space:** Where new objects are created
- **Survivor Spaces (S0, S1):** Objects that survive first GC

**2. Old Generation (Tenured)** => Long-lived objects that survived multiple GC cycles

### Generational GC Strategy

1. Minor GC: Cleans Young Generation
2. Major GC: Cleans Old Generation
3. Full GC: Cleans entire heap

```java
// When Objects Become Eligible for GC

{
// 1. null ref
String str = new String("Hello");
str = null; // Eligible for GC
}

{
//  2. Reassigning Reference
String str1 = new String("Hello");
String str2 = new String("World");
str1 = str2;                         // "Hello" object eligible for GC
}

{
// 3. Object Going Out of Scope
void method() {
    String localStr = new String("Hello");   // localStr eligible for GC when method ends
}
}

```

### Memory Management Best Practices

```java
{
// 1. Avoid Memory Leaks
// Bad - can cause memory leak
static List<String> list = new ArrayList<>();

// Good - clear when done
list.clear();
}

{
// 2. Use StringBuilder for String Concatenation(if string manipulation heavily involved)
// Bad - creates multiple String objects
String result = "";
for (int i = 0; i < 1000; i++) {
    result += "Hello";
}

// Good - efficient memory usage
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("Hello");
}
}

{
// 3. Close Resources
// Using try-with-resources
try (FileReader file = new FileReader("file.txt")) {
    // File automatically closed
} catch (IOException e) {
    e.printStackTrace();
}
}


```
