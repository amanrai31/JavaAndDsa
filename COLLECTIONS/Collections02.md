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
  
