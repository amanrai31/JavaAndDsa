# CONTENT => Time Complexity, Space Complexity

## Time Complexity

How the runtime of an algorithm grows as the input size (n) increases. OR the rate at which time taken increases wrt the input size.

- O(1)	      => Constant time	 => Accessing an array element: arr[0], Hastable lookup
- O(log n)	  => Logarithmic    =>	Binary Search
- O(n)	      => Linear	        => Loop over n elements, tree traversal
- O(n log n)	=> Linearithmic   =>	Merge Sort, Quick Sort (average case)
- O(n^2)	    => Quadratic      =>	Nested loops (e.g., bubble sort), Quick sort(worst case)
- O(2^n)	    => Exponential	   => Recursion like Fibonacci
- O(n!)	     => Factorial	     => Brute-force permutations

**NOTE :** Best case(omega), average case(theta), wrost case(big-of). We always measure TC in terms of worst case. Drop constants & lower terms/degree while calculating TC.

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
// Wht is TC of this code => {1+2+3+.....+n} = n*(n+1)/2 = (n^2)/2 + n/2 => So TC is n^2/2 i.e. near to n^2
```

**NOTE :** In coding round if it is mentioned to complete a problem in 1 sec that mean 10^8 operations. Typically servers do 10^8 operations in 1 sec.
-----

## Space Complexity

Space Complexity = How much memory an algorithm uses as input size increases.

Types of Space:
1. Auxiliary Space - Extra memory used by algorithm (space you take to solve a problem)
2. Input Space - Memory for input data
- Space Complexity = Auxiliary Space + Input Space

Suppose you have 2 variable a & b, these will be input space & you storing `c = a+b` for some reason then c will be Auxiliary space. 

**NOTE :** Never manipulate the orignal input data to save space. Very bad pratice.


