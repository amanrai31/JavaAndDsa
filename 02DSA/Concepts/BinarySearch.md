# Binary Search

Binary search is only applicable on **sorted data structures** (Dictionary analogy)

- Iterative way (Using loop)
- Recurssive way 

TimeComplexity - logn - base 2

Overflow case `mid = low+high/2 => maybe can cross the int limit so use long in this case` OR do `mid = low + (high-low)/2` to overcome overflow condition



## Questions

### EASY

- [704] => https://leetcode.com/problems/binary-search/description/  (Solve both way - Iterative, recursive)
- Lower bound `arr[index]>=target, return index` || Upper bound `arr[index]>target, return index`
- [35] => https://leetcode.com/problems/search-insert-position/submissions/1833462023/   => lower bound   {Must practice}
- [34] => https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/  {IMPORTANT}
