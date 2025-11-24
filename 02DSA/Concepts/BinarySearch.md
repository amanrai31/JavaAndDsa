# Binary Search

Binary search is only applicable on **sorted data structures** (Dictionary analogy).

**When to use BS** =>  **Think of BS if array is sorted or we asked to solve a problem in TC in logN**

- Iterative way (Using loop)
- Recurssive way 

TimeComplexity - logn - base 2

Overflow case `mid = low+high/2 => maybe can cross the int limit so use long in this case` OR do `mid = low + (high-low)/2` to overcome overflow condition



## Questions

### EASY

- [704] => https://leetcode.com/problems/binary-search/description/  (Solve both way - Iterative, recursive)
- Lower bound `arr[index]>=target, return index` || Upper bound `arr[index]>target, return index`
- [35] => https://leetcode.com/problems/search-insert-position/  => lower bound  
- [34] => https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/  {IMPORTANT}
- [33] => https://leetcode.com/problems/search-in-rotated-sorted-array/description/ || [81] => https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/ {IMPORTANT}
- [153] => https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/ || SIMILAR - How many times an array is rotated
- [540] => https://leetcode.com/problems/single-element-in-a-sorted-array/ {if i'm standing on even index & if it's next element is same MEANS all previous elements are in pair, so no need to look behind}{IMPORTANT} 
- [162] => https://leetcode.com/problems/find-peak-element/  {IMPORTANT} 
- [69] => https://leetcode.com/problems/sqrtx/description/  || https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1
- [875] => https://leetcode.com/problems/koko-eating-bananas/description/ || [1283] => https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/  => Math.ceil => (element + divisor - 1) / divisor;{IMPORTANT}
- [1482] => https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/ {IMPORTANT}
- [1011] => https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
- [1539] => https://leetcode.com/problems/kth-missing-positive-number/ {TRY} - [arr[e] + ( k - (arr[e] - (e + 1)))] = (k + e + 1) = `k + s`
- 
