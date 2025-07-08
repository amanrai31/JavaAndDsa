# JAVA

Java is 3rd Gen, high level programming language, developed in 1991 in sunMicrosystems. Java is statically typed, robost, secure, high performance, portble, multithreaded, interpreted and OO(OOP) Language.

- **JDK** => JRE(Java runtime environment) + JAVAC, debugger, javaDocs, javaTools etc.

- **JRE** => JVM + Browser, applate support, plugins, Java Standard Library (java.lang, java.util, java.io, etc.). Install JRE if you **only** need to run Java apps.

- **JVM**(Java virtual machine => core execution engine) => Loads and executes Java bytecode (.class files), Memory management (Heap, Stack, Method Area), Garbage collection, Thread management, Security management

JAVA uses Garbage collector, execption handling & auto memory allocation to make it reliable & minimize errors.

OOPS => Everything in java is represented in class as an object(main f/n too). Organising a program in terms of collection of object is way of OOPs, each Obj represents the instance of a class. `Abstraction, Encapsulation, Inheritance, Polymorphism`.

**NOTE :** Java doesn't use pointers, multi inheritance, operator overloading, explicit memory allocation.

=> Source-file => `compiler` => ByteCode/.class => `JVM` => native code.

**Process of JAVA programming =>** 1. Create pgm using editor(plain), save as .java file. 2. compile by typing `javac <filename>` in terminal. 3. Run by typing `java <filename>`

### First java pgm

```java
public class Main {
  public static void main(String[] args){
    System.out.println("Hello world");   // System is predefined class, provide access to system. out is a variable of type output stream connected to console.
}
}
```

### Comments, keywords, expression, class body, method body, string literal, octal/hex representation

**Access modifiers =>** public, defalut, protected, private

**Non-Access modifiers** final, abstract, strictfp

-----

### Variables & Data types

`ROM, RAM, bit, bytes, memoery allocation`

**Variable** => Variables are like containers to store data. => Declaration & intialization, taking input

1. Local variable => Defined inside block/method/constructor (intialization mendatory, accessable only inside that scope).
2. Instance variable => non-static, decleared in class(ouside block) & accessed by obj.
3. static/class variables => Declared with static keyword, in class(ouside block), accessed by class directly.

**Data types**

Primitive Variables => byte(1), short(2), int(4), long(8) || float(4), double(8byte) || char(2) || boolean(1bit)

Reference Variables => Object references (String, Arrays, Custom classes), Interface references

**NOTE :** Primitive & ref of non-premitive are stored in `stack memory` & actual data of non-premitive stored in `Heap memory`

```java
com.company
public class Main{
  public static void main(String[] args){
    int kids = 2;
    int teens = 4, adults = 5;
    int totalPeople = kids + teens + adults;
    System.out.println("Total people : " + total people );
}
}

```

- Wrapper class, BigDecimal class(for more accurate decimal calculation)
- Package => Way to organise projects, consider as folder. Domain name reversed. (Learn a bit more about)
- Range => `int a = Integer.MAX_VALUE`, `double b = Double.MIN_VALUE`
- Size => `System.out.println(Long.BYTES)`, `System.out.println(Double.BYTES)`
- Casting => `int n =20; byte b = (byte)(n/2);`

#### Character

- `chat ch = 'A';`  => Declare inside single quote.
- `char[] arr = {'a','b'};` => Declare inside single quote.
- Scan char => `char ch = sc.next().charAt(0);`

-----

### Operator, Decision making, loops

1. Operators

- Assignment operator => `=`
- Arithmatic operator => `+, -, *, /, %`
- Comparison operator => `>, >=, <, <=, ==, !=`
- Logical operator => `&&, ||, !`
- Bitwise operator => `&, |, ~, ^, <<, >>, >>>`
- Instance of => Used for type checking if an obj is class, subclass or interface

Operator precedance => `a = b+++c; => a = b ++ + c`, `a = b+++++c; => a = b ++ ++ +c => //ERROR` complied in pairs from left to right.

2. Decision making => Controls the flow of execution based on certain conditions.

- if, if-else, else-if, nested if, switch
- Jump statements => `continue`, `break`, `return`

3. Loops

- for loop, while loop, do-while loop, `read only loop => for(T element: collection of obj/array){statement...}`

-----

# Array

Array is collection of fixed number of elements of same type. Dynamically allocated, 0-indexed. Size of array should be in `int` OR `short`, long is not allowed.

Every array implements the interface clonable & java.io.Serializable

Learn about => 1. stack underflow. 2. Decrement the top by 1.

- Array declaration

1. `int[] arr = {1,2,3}` => Array literal
2. `int[] arr = new int[3]` => Declaration & allocation OR `int arr[] = new int[3]`


An array can contain primitives(in memory) and object's refernce(actual object stored in heap).

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
**NOTE :** Elements of each nested array will have conitious ref in memory, but ref of each array not neccessirily continous.

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

# String

String is a sequence of characters. In java, string is an object, internally backed by `char array` hence immutable as Arrays are immutable.

```java
String str1 = "abc";    // Stored in 'STRING POOL' inside heap memory (optimised memory allocation - refer same ref if already there )
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
```
- stbf.replace(start,end,"") 































