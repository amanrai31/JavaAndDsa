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

-----

## Space Complexity

Space Complexity = How much memory an algorithm uses as input size increases.

Types of Space:
1. Auxiliary Space - Extra memory used by algorithm (space you take to solve a problem)
2. Input Space - Memory for input data
- Space Complexity = Auxiliary Space + Input Space

Suppose you have 2 variable a & b, these will be input space & you storing `c = a+b` for some reason then c will be Auxiliary space.

**NOTE :** Never manipulate the original input data to save space. Very bad practice.


