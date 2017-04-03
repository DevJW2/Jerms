# Jerms

## Description

A double-ended queue(a **Deque**), able to dequeue from the front of the queue and the end of the queue

## Implementation

We used both an **ArrayList-based** and a **doubly-linked node-based** architecture.

### Methods used
```java
public void addLast(T val);

public T peekLast();

public T pollFirst();

public T pollLast();

public T peekFirst();

public boolean isEmpty();
   
public int size();

public boolean contains(T val);

```

## Comparison
In terms of cleanliness, ArrayList-based deque was the better to write as it was essentially a wrapper class for ArrayList. However, the main flaw of the ArrayList-based deque is its ineffciency. Adding or removing at the front would mean having to set each element of the array to the one next to it, resulting in O(n) runtime. In contrast, the doubly-linked node-based deque needs to only change the _nextNode and _previousNode values of _tail and the node after _head which results in O(1) runtime. As such, the doubly-linked node-based deque is the more efficient of the two.




