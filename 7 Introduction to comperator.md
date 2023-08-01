# Lesson 7: Introduction to Comparators

## Overview

In this lesson, we will explore the Comparator interface, its methods, and practical use-cases.

## Introduction

The Comparator interface is used to order the objects of user-defined classes. A comparator object is capable of comparing two objects of two different classes. Following are the important points about Comparator −

- The Comparator interface is used to order the objects of user-defined classes.
- The Comparator interface is found in the java.util package.
- A Comparator object is capable of comparing two different objects. The class is not comparing its instances, but some other class’s instances.

## Chapters

1. **Understanding Comparators**
   - Basics of Comparators
   - How Comparators work
   - Real-world examples of Comparators usage

2. **Methods of Comparators**
   - `compare(Object obj1, Object obj2)`: Compares its two arguments for order.
   - `equals(Object obj)`: Indicates whether some other object is "equal to" this comparator.

3. **Practical examples of Comparators**
   - Implementing a Comparator in Java
   - Using Comparators to sort a list

## Conclusion

Comparators are a powerful tool in Java, allowing for the comparison and ordering of objects of user-defined classes. Understanding its methods and their usage is essential for effective programming in Java.

## Q&A

1. **What is Comparator in Java?**
   - The Comparator interface is used to order the objects of user-defined classes. A comparator object is capable of comparing two objects of two different classes.

2. **What are some methods of the Comparator interface?**
   - Some methods of the Comparator interface include `compare(Object obj1, Object obj2)` and `equals(Object obj)`.

3. **What are some practical examples of using the Comparator interface?**
   - Some practical examples of using the Comparator interface include implementing a Comparator in Java and using Comparators to sort a list.

# Lesson 7: Introduction to Comparators (Continued)

## Chapters

### 1. Understanding Comparators

The Comparator interface is used to order the objects of user-defined classes. A comparator object is capable of comparing two objects of two different classes. The class is not comparing its instances, but some other class’s instances.

#### How Comparators work

A Comparator is used to compare two objects to provide an ordering. For example, when sorting a list of objects, you can use a Comparator to define how the objects should be compared to sort them.

Java provides two methods in the Comparator interface, `compare(Object o1, Object o2)` and `equals(Object element)`. The `compare(Object o1, Object o2)` method compares its two arguments for order and returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.

#### Real-world examples of Comparators usage

Real-world situations where Comparators come in handy include:

- **Sorting**: You can use a Comparator to define the sorting order of a list of objects. For example, if you have a list of Person objects, you can create a Comparator that compares Person objects based on their age, name, etc.

- **Priority Queues**: In a priority queue, elements are ordered based on a comparator. You can use a Comparator to define the ordering of elements in a priority queue.

### 2. Methods of Comparators

The Comparator interface provides a number of methods for comparing objects, such as:

- `compare(Object obj1, Object obj2)`: This method compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.

- `equals(Object obj)`: This method indicates whether some other object is "equal to" this comparator. This method must obey the general contract of `Object.equals(Object)`.

### 3. Practical examples of Comparators

#### Implementing a Comparator in Java

Here's an example of how to implement a Comparator in Java:

```java
class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}

class Person {
    private String name;
    private int age;

    // getters and setters omitted for brevity
}

List<Person> people = new ArrayList<>();
// add people to the list

Collections.sort(people, new AgeComparator());
```

#### Using Comparators to sort a list

You can also use Comparators to sort a list. Here's an example:

```java
List<String> names = new ArrayList<>();
// add names to the list

Collections.sort(names, new Comparator<String>() {
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
});
```

## Conclusion

Comparators are a powerful tool in Java, allowing for the comparison and ordering of objects of user-defined classes. Understanding its methods and their usage is essential for effective programming in Java.

## Q&A

1. **How does Comparator work in Java?**
   - A Comparator is used to compare two objects to provide an ordering. For example, when sorting a list of objects, you can use a Comparator to define how the objects should be compared to sort them. Java provides two methods in the Comparator interface, `compare(Object o1, Object o2)` and `equals(Object element)`. The `compare(Object o1, Object o2)` method compares its two arguments for order and returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.

2. **What are some real-world examples of using Comparator?**
   - Some real-world examples of using Comparator include sorting a list of objects and defining the ordering of elements in a priority queue.

3. **What are some practical examples of using Comparator in Java code?**
   - Some practical examples of using Comparator in Java code include implementing a Comparator in Java and using Comparators to sort a list.

## Comparator vs Comparable
   - The Comparable interface is another way in Java to allow objects of a custom class to be compared to each other. The difference between Comparator and Comparable is that:

       - Comparable is used to define a natural ordering for objects of a class, and it affects the class's overall behaviour. If a class implements Comparable, it means "I can compare myself with another object". It has a single method compareTo().
       - Comparator is used to define an external ordering, and it doesn't affect the class's overall behaviour. If a class uses a Comparator, it means "I can use a Comparator to compare two other objects". It can be used if you want to have multiple different possible comparison strategies, or if you want to compare objects of a class that you can't modify.