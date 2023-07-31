# Lesson 4: Introduction to PriorityQueue

## Overview

In this lesson, we will explore the PriorityQueue class, its methods, and practical use-cases.

## Introduction

PriorityQueue is a class in Java that implements the Queue interface. It holds elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.

## Chapters

1. **Understanding PriorityQueue**
   - Basics of PriorityQueue
   - How PriorityQueue works
   - Real-world examples of PriorityQueue usage

2. **Methods of PriorityQueue**
   - `add(E e)`: Inserts the specified element into this priority queue.
   - `offer(E e)`: Inserts the specified element into this priority queue.
   - `remove()`: Retrieves and removes the head of this queue.
   - `poll()`: Retrieves and removes the head of this queue, or returns null if this queue is empty.
   - `element()`: Retrieves, but does not remove, the head of this queue.
   - `peek()`: Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

3. **Practical examples of PriorityQueue**
   - Implementing a PriorityQueue in Java
   - Using PriorityQueue with custom comparator

## Conclusion

PriorityQueue is a powerful class in Java, allowing for the insertion and removal of elements based on their priorities. Understanding its methods and their usage is essential for effective programming in Java.

## Q&A

1. **What is PriorityQueue in Java?**
   - PriorityQueue is a class in Java that implements the Queue interface. It holds elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.

2. **What are some methods of the PriorityQueue class?**
   - Some methods of the PriorityQueue class include `add(E e)`, `offer(E e)`, `remove()`, `poll()`, `element()`, and `peek()`.

3. **What are some practical examples of using the PriorityQueue class?**
   - Some practical examples of using the PriorityQueue class include implementing a PriorityQueue in Java and using PriorityQueue with a custom comparator.

# Lesson 4: Introduction to PriorityQueue (Continued)

## Chapters

### 1. Understanding PriorityQueue

PriorityQueue is a queue data structure implementation in which objects are processed based on their priority. It is different from the normal queue, as it allows you to insert an element based on their priority. If elements with the same priority occur, they are served according to their ordering in the queue.

#### How PriorityQueue works

In a PriorityQueue, elements are ordered either by natural ordering (in which case the elements that are to be inserted should implement the Comparable interface), or by a Comparator that is passed at queue construction time.

The `poll()` method retrieves and removes the head of this queue, or returns null if this queue is empty. The head of this queue is the least element with respect to the specified ordering.

#### Real-world examples of PriorityQueue usage

Real-world situations where PriorityQueue comes in handy include:

- **Task Scheduling**: In a task scheduling system, tasks are assigned a priority and are processed based on their priority.

- **Dijkstra's Algorithm**: In Dijkstra's algorithm for finding the shortest path in a graph, a priority queue is used to determine the next most closest or highest priority node.

### 2. Methods of PriorityQueue

The PriorityQueue class provides a number of methods for manipulating a priority queue, such as:

- `add(E e)`: This method inserts the specified element into this priority queue.

- `offer(E e)`: This method inserts the specified element into this priority queue.

- `remove()`: This method retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.

- `poll()`: This method retrieves and removes the head of this queue, or returns null if this queue is empty.

- `element()`: This method retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.

- `peek()`: This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

### 3. Practical examples of PriorityQueue

#### Implementing a PriorityQueue in Java

Here's an example of how to implement a PriorityQueue in Java:

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

// Add elements
pq.add(1);
pq.add(2);
pq.add(3);

// Remove element
int removedElement = pq.remove();

// Check if an element exists
boolean exists = pq.contains(2);

// Get the size of the priority queue
int size = pq.size();
```

#### Using PriorityQueue with custom comparator

You can also use a PriorityQueue with a custom comparator. Here's an example:

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
});

// Add elements
pq.add(1);
pq.add(2);
pq.add(3);

// Remove element
int removedElement = pq.remove();

// Check if an element exists
boolean exists = pq.contains(2);

// Get the size of the priority queue
int size = pq.size();
```

In this example, the PriorityQueue is implemented with a custom comparator that orders the elements in descending order.

## Conclusion

PriorityQueue is a powerful class in Java, allowing for the insertion and removal of elements based on their priorities. Understanding its methods and their usage is essential for effective programming in Java.

## Q&A

1. **How does PriorityQueue work in Java?**
   - In a PriorityQueue, elements are ordered either by natural ordering, or by a Comparator that is passed at queue construction time. The `poll()` method retrieves and removes the head of this queue, or returns null if this queue is empty. The head of this queue is the least element with respect to the specified ordering.

2. **What are some real-world examples of using PriorityQueue?**
   - Some real-world examples of using PriorityQueue include task scheduling systems and Dijkstra's algorithm for finding the shortest path in a graph.

3. **What are some practical examples of using PriorityQueue in Java code?**
   - Some practical examples of using PriorityQueue in Java code include implementing a PriorityQueue in Java and using PriorityQueue with a custom comparator.
