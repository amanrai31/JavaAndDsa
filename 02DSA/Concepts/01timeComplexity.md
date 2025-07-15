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

```
// Drop constants & lower terms/degree
O(3n + 100) → O(n)
O(n² + n + 1) → O(n²)
O(5) → O(1)
```

-----

## Space Complexity

Space Complexity = How much memory an algorithm uses as input size increases.

Types of Space:
1. Auxiliary Space - Extra memory used by algorithm
2. Input Space - Memory for input data
- Space Complexity = Auxiliary Space + Input Space
