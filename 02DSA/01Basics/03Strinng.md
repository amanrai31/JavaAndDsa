# String


String is a sequence of characters. In java, string is an object, internally backed by `char array` hence immutable as Arrays are immutable.

```java
String str1 = "abc";    // Stored in 'STRING POOL' inside heap memory (optimized memory allocation - refer same ref if already there )
String str2 = "abc";
String str3 = new String("abc");  // Stored directly in heap memory (dynamically allocated)

System.out.println(str1==str2);      // true, because stored in STRING POOL, having same content so ref of str1&str2 are same
System.out.println(str2==str3);      // false

```

**LEARN  ABOUT 1.String tokenizer 2.String joiner**

### String conversions

```java
// 1. Arr to string
char[] arr = {'a','b','c'};
String str = new String(arr);
String str = new String(arr,0,3);

// 2. StringBuilder/ buffer to string
StringBuffer stbf = new StringBuffer("abc");
String str1 = new String(stbf);                        // Same for StringBuilder

// 3. String to StringBuilder/ buffer 
String str2 = "abc";                              // String str2 = new String("abc"); 
StringBuilder stbl = new StringBuilder(str2);      // Same for StringBuffer

```

### String methods

- str.hashcode(), str.length()
- str.substring(), str.contains("someString"), str.indexOf("someString") || str1.equals(str2), str1.equalsIgnoreCase(str2) 
- Interger.toString() || toLowerCase(), toUpperCase()
- str1.compareTo(str2) => gives -1 if str1 comes before str2, opposite for +1 & 0 iff both equal

**NOTE :** Never use == for string comparison in Java. Use .equals() instead because .equals() checks content only AND  `==` checks if both variables point to the same object in memory

### StringBuffer 

`StringBuffer stbf = new StringBuffer("abc")` => reserves 16 more characters without reallocation
`StringBuffer stbf = new StringBuffer(20)` => Explicitly set size of buffer

- length() || capacity() || append() || insert() || delete() || deleteCharAt() || reverse() || substring()

```java
StringBuffer stbf = new StringBuffer("abc");
System.out.println(stbf.length());                // 3
System.out.println(stbf.capacity());              // 16 + 3 = 19
stbf.append("rai");
System.out.println(stbf);
stbf.insert(4,31);                                // We can insert string, array & numeric content as well
System.out.println(stbf);
stbf.delete(2,4);
System.out.println(stbf);
stbf.deleteCharAt(3);
System.out.println(stbf);
System.out.println(stbf.reverse());
System.out.println(stbf.replace(1,4,"xyz"));      // stbf.replace(start,end,"")

```

**NOTE :** stringBuffer is thread-safe, synchronized

### StringBuilder

It is fast, multithreaded hence no synchronization & not thread safe. All the above methods of Buffer also applied on Builder

Constructor in stringBuilder =>

1. `stringBuilder()` => initial capacity of 1 characters.
2. `stringBuilder(int capacity)` => capacity is specified manually
3. `stringBuilder(string-literal)` => `stringBuilder("abc")` 
4. `stringBuilder(string)` => `String str = "abc"; StringBuilder s = new StringBuilder(str);`
