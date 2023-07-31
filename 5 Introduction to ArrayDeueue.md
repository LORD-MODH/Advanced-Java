
# Lesson 5: Introduction to ArrayDeque

## Overview

In this lesson, we will explore the ArrayDeque class, its methods, and practical use-cases.

## Introduction

ArrayDeque is a class in Java that implements the Deque interface. It is also known as Array Double Ended Queue and Array Deck. ArrayDeque is a resizable-array implementation of the Deque interface. Array deques have no capacity restrictions; they grow as necessary to support usage.

## Chapters

1. **Understanding ArrayDeque**
   - Basics of ArrayDeque
   - How ArrayDeque works
   - Real-world examples of ArrayDeque usage

2. **Methods of ArrayDeque**
   - `addFirst(E e)`: Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions.
   - `addLast(E e)`: Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions.
   - `removeFirst()`: Retrieves and removes the first element of this deque.
   - `removeLast()`: Retrieves and removes the last element of this deque.
   - `getFirst()`: Retrieves, but does not remove, the first element of this deque.
   - `getLast()`: Retrieves, but does not remove, the last element of this deque.

3. **Practical examples of ArrayDeque**
   - Implementing a Deque using ArrayDeque
   - Using ArrayDeque as a stack

## Conclusion

ArrayDeque is a powerful class in Java, allowing for the insertion and removal of elements from both ends. Understanding its methods and their usage is essential for effective programming in Java.

## Q&A

1. **What is ArrayDeque in Java?**
   - ArrayDeque is a class in Java that implements the Deque interface. It is also known as Array Double Ended Queue and Array Deck. ArrayDeque is a resizable-array implementation of the Deque interface. Array deques have no capacity restrictions; they grow as necessary to support usage.

2. **What are some methods of the ArrayDeque class?**
   - Some methods of the ArrayDeque class include `addFirst(E e)`, `addLast(E e)`, `removeFirst()`, `removeLast()`, `getFirst()`, and `getLast()`.

3. **What are some practical examples of using the ArrayDeque class?**
   - Some practical examples of using the ArrayDeque class include implementing a Deque using ArrayDeque and using ArrayDeque as a stack.

# Lesson 5: Introduction to ArrayDeque (Continued)

## Chapters

### 1. Understanding ArrayDeque

ArrayDeque is a class in Java that implements the Deque interface. It is also known as Array Double Ended Queue and Array Deck. ArrayDeque is a resizable-array implementation of the Deque interface. Array deques have no capacity restrictions; they grow as necessary to support usage.

Unlike Stack, ArrayDeque (or LinkedList) has no capacity restrictions and it provides faster add and remove operations as compared to Stack.

#### How ArrayDeque works

ArrayDeque uses a resizable array to store elements. When elements are added to an ArrayDeque, the array is resized if necessary. Similarly, when elements are removed, the array can be shrunk.

The ArrayDeque class provides methods to insert, remove and retrieve elements. Elements can be inserted or removed from either end (head or tail) of the deque.

#### Real-world examples of ArrayDeque usage

Real-world situations where ArrayDeque comes in handy include:

- **Stack and Queue Implementations**: ArrayDeque can be used as a stack (LIFO data structure) or a queue (FIFO data structure). It is more efficient than Stack when used as a stack, and more efficient than LinkedList when used as a queue.

- **Browser History**: In a web browser, the history of URLs visited can be represented as an ArrayDeque. The back button takes you to the URL at the front of the deque, while the forward button takes you to the URL at the end.

### 2. Methods of ArrayDeque

The ArrayDeque class provides a number of methods for manipulating a deque, such as:

- `addFirst(E e)`: This method inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

- `addLast(E e)`: This method inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions. When using a capacity-restricted deque, this method is generally preferable to add(E), which can fail to insert an element only by throwing an exception.

- `removeFirst()`: This method retrieves and removes the first element of this deque. This method differs from pollFirst only in that it throws an exception if this deque is empty.

- `removeLast()`: This method retrieves and removes the last element of this deque. This method differs from pollLast only in that it throws an exception if this deque is empty.

- `getFirst()`: This method retrieves, but does not remove, the first element of this deque. This method differs from peekFirst only in that it throws an exception if this deque is empty.

- `getLast()`: This method retrieves, but does not remove, the last element of this deque. This method differs from peekLast only in that it throws an exception if this deque is empty.

### 3. Practical examples of ArrayDeque

#### Implementing a Deque using ArrayDeque

Here's an example of how to implement a Deque using ArrayDeque:

```java
Deque<Integer> deque = new ArrayDeque<>();

// Add elements
deque.addFirst(1);
deque.addLast(2);

// Remove element
int removedFirstElement = deque.removeFirst();
int removedLastElement = deque.removeLast();

// Check if an element exists
boolean exists = deque.contains(1);

// Get the size of the deque
int size = deque.size();
```

#### Using ArrayDeque as a stack

ArrayDeque can also be used as a stack. Here's an example:

```java
Deque<Integer> stack = new ArrayDeque<>();

// Push elements
stack.push(1);
stack.push(2);
stack.push(3);

// Pop element
int poppedElement = stack.pop();

// Check if an element exists
boolean exists = stack.contains(2);

// Get the size of the stack
int size = stack.size();
```

## Conclusion

ArrayDeque is a powerful class in Java, allowing for the insertion and removal of elements from both ends. Understanding its methods and their usage is essential for effective programming in Java.

## Q&A

1. **How does ArrayDeque work in Java?**
   - ArrayDeque uses a resizable array to store elements. When elements are added to an ArrayDeque, the array is resized if necessary. Similarly, when elements are removed, the array can be shrunk. The ArrayDeque class provides methods to insert, remove and retrieve elements. Elements can be inserted or removed from either end (head or tail) of the deque.

2. **What are some real-world examples of using ArrayDeque?**
   - Some real-world examples of using ArrayDeque include stack and queue implementations, and browser history.

3. **What are some practical examples of using ArrayDeque in Java code?**
   - Some practical examples of using ArrayDeque in Java code include implementing a Deque using ArrayDeque and using ArrayDeque as a stack.
