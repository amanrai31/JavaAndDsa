# Array

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

- arr.length, arr.getClass(), arr.clone() || Arrays.copyOfRange(arr,2,6), Arrays.sort(arr) || `char arr[] = str.toCharArray();`
- Arrays.equals(arr1,arr2) => matches content not ref || `arr1.equals(arr2)  same as arr1 == arr2` || `Arrays.deepEquals(arr1,arr2)`
- `String str = arr.toString()` || `String s = new String(arr)` || use `str.append(arr) => in case of stringBuffer/Builder`
- Math.max(x,y); || 



---------

# QESTIONS & PATTERNS

## EASY

- Largest element in array 
- 2nd Largest element 
- [1752] => https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/             {Good one}
- [26] => https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
- Union/intersection of two sorted array => https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/1 (2Pointer)  {Good one}
- [268] => https://leetcode.com/problems/missing-number/description/
- [485] => https://leetcode.com/problems/max-consecutive-ones/description/
- [136] => https://leetcode.com/problems/single-number/                        (Bit) {Good}

## MEDIUM

- [1] => https://leetcode.com/problems/two-sum/description/
- return longest subarray-sum-equal-K(only positive) - prefixSum
- [167] => https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
- [75] => https://leetcode.com/problems/sort-colors/ {DUTCH-NATIONAL-FLAG ALGORITHUM- 3pointer} (If mid =0, exchange low & mid & increase both(low/high) pointers || if mid=2, exchange high & mid & decrease high pointer || if mid=1, just increase mid pointer  - MUST DO)
- [169] => https://leetcode.com/problems/majority-element/description/ {MOORE'S VOTING ALGORITHUM - MUST DO}
- [121] => https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
- [2149] => https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
- [11] => https://leetcode.com/problems/container-with-most-water/description/    {MUST DO}
- [31] => https://leetcode.com/problems/next-permutation/   {MUST DO}
- [128] => https://leetcode.com/problems/longest-consecutive-sequence/ {Tricky - GOOD QUESTION}
- [73] => https://leetcode.com/problems/set-matrix-zeroes/description/
- [48] => https://leetcode.com/problems/rotate-image/description/
- [54] => https://leetcode.com/problems/spiral-matrix/description/

 ### SubArray problems (VVI)
 
 [Resource](https://www.youtube.com/watch?v=frf7qxiN2qU&list=PLgUwDviBIf0rENwdL0nEH0uGom9no0nyB&index=4)
- [53] => https://leetcode.com/problems/maximum-subarray/submissions/1815681459/ {KANADNE ALGORITHUM - find the subarray with the largest sum, and return its sum || we can return it's length too}
- [560] => https://leetcode.com/problems/subarray-sum-equals-k/description/  {return the number of subarrays whose sum = k}
- Same as 560 ABOVE, return longest subarray-sum-equal-K(positive, negative) || or we can return the index of this largest subArray
- Return the length of the longest subarray(only positive) whose sum = k {SLIDING WINDOW}







------

1. Look if we can use `Math` or `Bit - Question with pair elements` concepts to solve? Many questions force you to use Math or Bit. || 2. Look if you can solve using `2Pointer` or `sliding window`, `Prefix sum`. || 3. Look if can use `Hasing(Mao or Set)` || 4. can i start from right side of array || 5. reverse of an array will take BigOf(n/2) we just need to swap using 2pointers & while loop
