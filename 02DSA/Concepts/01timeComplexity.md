# CONTENT => Time Complexity, Space Complexity

## Time Complexity

How the runtime of an algorithm grows as the input size (n) increases. OR the rate at which time taken increases wrt the input size. (Asymptotic analaysis)

- O(1)	      => Constant time	    =>  Accessing an array element: arr[0], Hastable lookup
- O(log n)	  => Logarithmic        =>	Binary Search
- O(n)	      => Linear	            =>  Loop over n elements, tree traversal
- O(n log n)	=> Linearithmic       =>	Merge Sort, Quick Sort (average case)
- O(n^2)	    => Quadratic          =>	Nested loops (e.g., bubble sort), Quick sort(worst case)
- O(2^n)	    => Exponential	      =>  Recursion like Fibonacci
- O(n!)	      => Factorial	        =>  Brute-force permutations

**NOTE :** Best case(omega), average case(theta), worst case(big-of). We always measure TC in terms of worst case. Drop constants & lower terms/degree while calculating TC.

**NOTE :** TC is not the time taken by a pgm, because it depends on machine, the programming language, system load etc.

```
// Drop constants & lower terms/degree
O(3n + 100) → O(n)
O(n² + n + 1) → O(n²)
O(5) → O(1)
```

```java
for(int i=0; i<n;i++){
  for(int j=0; j<=i; j++){
     System.out.println("Hi");
    }
}
// What is TC of this code => {1+2+3+.....+n} = n*(n+1)/2 = (n^2)/2 + n/2 => So TC is n^2/2 i.e. near to n^2
```
```java
for(int i=0;i<n;i*c){
  // some constant work...
}
// TC for this is `log n` to base c => i.e. (log c^n)
```

```java
for(int i=0;i<100;i++){
  // some constant work...
}
// TC for this is O(1) because loop will run for constant value, if there will be n then TC would be O(n).
```

**NOTE :** In coding round if it is mentioned to complete a problem in 1 sec that mean 10^8 operations. Typically servers do 10^8 operations in 1 sec.

**IMPORTANT :** Suppose i have 3 subsequent/individual loops(not nested) in some code, then the TC of that code will be equal to that loop which is having the highest TC. 

### T.C. w.r.t recursion

```java
// T(n) = 2T(n/2) + c
int fun1(n){
 if(n<0) return;
 print("Hi");
 fun1(n/2);
 fun1(n/2);                   // Two time calling the fun1() that is why => 2T(n/2)
// T.C. => 0(n), order of recurrence = (log n -> base 2) => c + 2c + 4c ...i.e. 2 to the power upto (log n) times
}
```
```java
// T(n) = 2T(n/2) + cn
int fun1(n){
 if(n<0) return;
 print("Hi");
 fun1(n/2);
 fun1(n/2);                   // Two time calling the fun1() that is why => 2T(n/2)

// T.C. => 0(n(log n)), order of recurrence = (log n -> base 2) => cn + (c*(n/2) + c*(n/2) = cn ) + (c*(n/4) + c*(n/4) + c*(n/4) + c*(n/4) = cn ) ... upto (log n) times
}
```

```java
// Tower of hanoi => T(n) = 2T(n-1) + c
int fun(n){
if(n<0)
return;
fun(n-1);
fun(n-1);           
}
// T.C. => 0(2^n), order of recurrence = (n) => c + 2c + 4c ... upto n times
```

```java
// Binary search => T(n) = T(n/2) + c
int fun1(n){
 if(n<0) return;
 print("Hi");
 fun1(n/2);                 // only one time calling the fun1() that is why => T(n/2) 
}
// T.C. => 0(log n), order of recurrence =  (log n -> base 2) => c + c + c ... upto (log n) times
```

```java
// Upper bound using recurssion tree method => T(n) = T(n/4) + T(n/2) + cn

// take the upper bound only i.e. (longest chain -> n/2) =>  means tree will go upto (log n) times & series(width) is going like => cn + 3cn/4 + 9cn/16 ... i.e. common ration (r) = 3/4

// Sum of infinite series with common ration `r` (if r is less than 1) = a/(1-r) => i.e. [ cn/(1-3/4) ] means TC = O(n)
```

```
// Upper bound using recurssion tree method => T(n) = T(n-1) + T(n-2) + c

// take the upper bound only i.e. (longest chain -> n-2) => so c + 2c + 4c + 8c upto n times.  So, [TC = 2^n]

```

-----

## Space Complexity

Space Complexity = How much memory/RAM an algorithm uses as input size increases.

Types of Space:
1. Auxiliary Space - Extra memory used by algorithm (space you take to solve a problem). Most of the time we talk about auxiliary space.
2. Input Space - Memory for input data
- Space Complexity = Auxiliary Space + Input Space

Suppose you have 2 variable a & b, these will be input space & you storing `c = a+b` for some reason then c will be Auxiliary space.

**NOTE :** Never manipulate the original input data to save space. Very bad practice.

```java
public int fun(int[] arr, int n){
int sum = 0;
for(int i=0;i<n;i++){
 sum += arr[i];
}
}

// space complexity = O(n), as array size is n but Auxiliary space complexity is O(1).
```

