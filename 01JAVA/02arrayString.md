
# CONTENT => ARRAY, STRING

## Array

Array is collection of fixed number of elements of same type. Dynamically allocated, 0-indexed. Size of array should be in `int` OR `short`, long is not allowed.

Every array implements the interface clonable & java.io.Serializable

Learn about => 1. stack underflow. 2. Decrement the top by 1.

- Array declaration

1. `int[] arr = {1,2,3}` => Array literal
2. `int[] arr = new int[3]` => Declaration & allocation OR `int arr[] = new int[3]`


An array can contain primitives(in memory) and object's reference(actual object stored in heap).

```java
// Array of object
class Student {
  public int rollNo;
  public String name;

  Student(int rollNo, String name) { 
    this.rollNo = rollNo;
    this.name = name;
  }
}

public class Main {
  public static void main(String[] args) {
    Student[] stuArr = new Student[2];
    stuArr[0] = new Student(1, "Aman");   // Storing ref of object
    stuArr[1] = new Student(2, "Appu");

     System.out.println(stuArr[0].rollNo + " " + stuArr[0].name + " " +  stuArr.getClass());
     // "Every" array has an associated class object => `arr.getClass()`
  }
}

```

- Copying

```java
int[] arr = {9,8,7,6,5,4,3};
int[] arr1 = Array.copyOfRange(arr,2,5);   // arr1 = {7,6,5} => index 5 excluded
```

- Shallow copy, deep copy

```java
// Deep copy
int[] arr = {9,8,7,6,5,4,3};
int[] arr1 = arr.clone();
System.out.println(arr==arr1); // false, both have diff ref.
```

```java
int[][] arr = {{1,2,3},{4,5}};
int[][] arr1 = arr.clone();
System.out.println(arr==arr1);          // false
System.out.println(arr[0]==arr1[0]);     // true
System.out.println(arr[1]==arr1[1]);     // true
```

### 2-D array

```java
int[][] arr = new int[4][];
System.out.println(arr);                      // Will give some value i.e. ref
for(int i =0; i< arr.length; i++){
  System.out.println(arr[i]);                 // null for all 4 nested arrays
}
```
**NOTE :** Elements of each nested array will have continuos ref in memory, but ref of each array not necessarily continuous.

**NOTE :** `char[] arr = {'a','b'}; => Using double quote here will throw error`
```java
// Jagged array => number of col are not same 
Scanner sc = new Scanner(System.in);
int arrLength, eachArrLength;
System.out.println("Enter array length :");
arrLength = sc.nextInt();
int[][] arr = new int[arrLength][];

for(int i=0; i<arrLength; i++){
  System.out.println("Enter array length for " + i + "th index");
  eachArrLength = sc.nextInt();
  arr[i] = new int[eachArrLength];
  System.out.println("Enter array element for " + i);
  for(int j=0; j<eachArrLength;j++){
    arr[i][j] = sc.nextInt();
  }
}
System.out.println("Elemnts of arr[1] : " );
for(int i=0; i<arr[1].length;i++){
    System.out.println(arr[1][i] + " ");
}
	}

```

### Array methods

- arr.length, arr.getClass(), arr.clone() || Array.copyOfRange(arr,2,6), Array.sort(arr) 
- Array.equals(arr1,arr2) => matches content not ref, `arr1.equals(arr2)  same as arr1 == arr2` || `Array.deepEquals(arr1,arr2)`
- `String str = arr.toString()`, `String s = new String(arr)` || use `str.append(arr) => in case of stringBuffer/Builder`



-----

## String

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


