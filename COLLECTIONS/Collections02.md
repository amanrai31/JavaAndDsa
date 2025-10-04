# CONTENT => QUEUE, DEQUE, PRIORITYQUEUE
  
## Queue 

The queue interface provides functionality of a queue data structure. It extends the collection interface. The queue interface is implemented by =>

1. `ArrayDeque`
2. `LinkedList`
3. `PriorityQueue`

### Queue interface

- `boolean add(E e)` | `boolean offer(E e)` => same as add but used with capacity-restricted queue.
- `E remove()` => remove front of queue (execption if queue is empty) | `E poll()` => removes front & return null if queue is empty
- `E element()` => retrives the front element, exeception if empty | `E peek()` => retrives the front element, null if empty 
  
**NOTE =>** Use `offer, poll & peek` instead of `add, remove & element`

```java

Queue<Integer> myQ = new LinkedList<>();

myQ.offer(10);
myQ.offer(20);

System.out.println(myQ.peek());

myQ.poll();
```

-----

## ArrayDeque (Doubly ended queue)

- `addFirst(E e)` | `offerFirst(E e)` | `addLast(E e)` | `offerLast(E e)`
- `removeFirst()` | `pollFirst()` | `removeLast()` | `pollLast()`  
- `getFirst()` | `peekFirst()` | `getLast()` | `peekLast()`

**NOTE :** We can implement Stack using Deque

```java
ArrayDeque<Integer> dq = new ArrayDeque<>();
```











