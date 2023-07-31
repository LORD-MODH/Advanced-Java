# Lesson 3: Exploring the Dequeue Interface

## Overview

In this lesson, we will explore the Dequeue Interface, its methods, and practical use-cases.

## Introduction

The Deque interface extends the Queue interface. In Deque, we can insert and remove elements from both ends so it can be used as a stack (LIFO) and a queue (FIFO). Deque stands for a double-ended queue which enables us to perform the operations at both the ends.

## Chapters

1. **Introduction to Dequeue Interface**
   - Understanding the Dequeue Interface
   - Hierarchy of Dequeue Interface
   - Real-world examples of Dequeue usage

2. **Deque Interface methods**
   - `addFirst(E e)`: Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions.
   - `addLast(E e)`: Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions.
   - `removeFirst()`: Retrieves and removes the first element of this deque.
   - `removeLast()`: Retrieves and removes the last element of this deque.
   - `getFirst()`: Retrieves, but does not remove, the first element of this deque.
   - `getLast()`: Retrieves, but does not remove, the last element of this deque.

3. **Use-cases of Dequeue Interface**
   - Implementing a Deque using ArrayDeque
   - Using LinkedList to implement a Deque

## Conclusion

The Deque interface is a powerful tool in Java, allowing for the insertion and removal of elements from both ends. Understanding its methods and their usage is essential for effective programming in Java.

## Q&A

1. **What is the Deque Interface?**
   - The Deque interface extends the Queue interface. In Deque, we can insert and remove elements from both ends so it can be used as a stack (LIFO) and a queue (FIFO).

2. **What are some methods of the Deque Interface?**
   - Some methods of the Deque Interface include `addFirst(E e)`, `addLast(E e)`, `removeFirst()`, `removeLast()`, `getFirst()`, and `getLast()`.

3. **What are some practical examples of using the Deque Interface?**
   - Some practical examples of using the Deque Interface include implementing a Deque using ArrayDeque and using LinkedList to implement a Deque.

# Lesson 3: Exploring the Dequeue Interface (Continued)

## Chapters

### 1. Introduction to Dequeue Interface

The Deque interface, pronounced as "deck", stands for Double Ended Queue. It is a linear collection that supports element insertion and removal at both ends. Deque is an acronym for "double ended queue" and is usually pronounced as "deck". Most Deque implementations place no fixed limits on the number of elements they may contain, but this interface supports capacity-restricted deques as well as those with no fixed size limit.

#### Hierarchy of Dequeue Interface

The hierarchy of the Deque Interface is as follows:

- **Deque Interface**: It is the root interface in the deque hierarchy.

- **ArrayDeque, LinkedList, ConcurrentLinkedDeque, LinkedBlockingDeque Classes**: These classes implement the Deque Interface and provide more specific methods for manipulating deques.

#### Real-world examples of Dequeue usage

Real-world situations where deques come in handy include:

- **Browser History**: In a web browser, the history of URLs visited can be represented as a deque. The back button takes you to the URL at the front of the deque, while the forward button takes you to the URL at the end.

- **Undo/Redo functionality**: In software applications like text editors, the undo and redo operations can be implemented using a deque. When an operation is undone, it is pushed to the front of the deque. When it is redone, it is removed from the front.

### 2. Deque Interface methods

The Deque Interface provides a number of methods for manipulating deques, such as:

- `addFirst(E e)`: This method inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

- `addLast(E e)`: This method inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions. When using a capacity-restricted deque, this method is generally preferable to add(E), which can fail to insert an element only by throwing an exception.

- `removeFirst()`: This method retrieves and removes the first element of this deque. This method differs from pollFirst only in that it throws an exception if this deque is empty.

- `removeLast()`: This method retrieves and removes the last element of this deque. This method differs from pollLast only in that it throws an exception if this deque is empty.

- `getFirst()`: This method retrieves, but does not remove, the first element of this deque. This method differs from peekFirst only in that it throws an exception if this deque is empty.

- `getLast()`: This method retrieves, but does not remove, the last element of this deque. This method differs from peekLast only in that it throws an exception if this deque is empty.

### 3. Use-cases of Dequeue Interface

#### Implementing a Deque using ArrayDeque

ArrayDeque class in Java implements the Deque interface, providing the functionality of a deque. Here's an example:

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

#### Using LinkedList to implement a Deque

LinkedList class in Java implements the Deque interface. It provides a way to apply all the operations at both the ends. Here's an example:

```java
Deque<Integer> deque = new LinkedList<>();

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

## Conclusion

The Deque interface in Java is a powerful tool, allowing for the insertion and removal of elements from both ends. Understanding its methods and their usage is essential for effective programming in Java.

## Q&A

1. **What is the hierarchy of the Deque Interface?**
   - The hierarchy of the Deque Interface starts with the Deque Interface, followed by the ArrayDeque, LinkedList, ConcurrentLinkedDeque, and LinkedBlockingDeque classes.

2. **What are some real-world examples of using the Deque Interface?**
   - Some real-world examples of using the Deque Interface include browser history and undo/redo functionality in software applications.

3. **What are some practical examples of using the Deque Interface in Java code?**
   - Some practical examples of using the Deque Interface in Java code include implementing a deque using the ArrayDeque class and using the LinkedList class to implement a deque.
