# CONTENT => Recursion

**Recurssion resource1 =>** https://www.youtube.com/watch?v=ngCos392W4w

**Recurssion resource2 =>** https://www.youtube.com/watch?v=yVdKa8dnKiE&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9

A Search(A* algorithum) used by MAPs =>  https://www.youtube.com/watch?v=88I6IidylGc

-----

**Recurssion =>** When a f/n keeps calling itself until a specified condition is met.

- Base case - function return some value when base case meet.
- StackOverflow - function call stack has limited space, when it goes beuond that space then stackpverfloww happens
- Stack space - space to accumulate function calls.
- Recursion tree - represeational diagram of function calls


=> Print your name N times using Recursion - Time complexcity - 0(n) || space complexcity - o(n) - in stack it made n function calls.

## BackTracking

The statements executes after the function call(Not before function call).

```
// General recurssion => i = 1, n = 10;
public static void fun(int i, int n) {
        if( i > n) return;
        System.out.println(i);
        fun(i+1, n);
}
// Will print 1,2,3 ...
```
```
// Backtrack => i = 1, n = 10;

public static void fun(int i, int n) {
        if( i > n) return;
        fun(i+1, n);
        System.out.println(i);
}
// Will print 10, 9, 8 ...
```


## Questions


