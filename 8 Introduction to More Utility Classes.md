# Lesson 8: Introduction to More Utility Classes

## Overview

In this lesson, we will explore more utility classes in Java, specifically StringTokenizer, Date, and Calendar.

## Introduction

Java provides several utility classes that help in operations such as time tracking and string parsing. StringTokenizer, Date, and Calendar are some of these utility classes.

## Chapters

1. **Understanding StringTokenizer**
   - Basics of StringTokenizer
   - How StringTokenizer works
   - Real-world examples of StringTokenizer usage

2. **Understanding Date**
   - Basics of Date
   - How Date works
   - Real-world examples of Date usage

3. **Understanding Calendar**
   - Basics of Calendar
   - How Calendar works
   - Real-world examples of Calendar usage

## Conclusion

Understanding the utility classes in Java is crucial for effective programming. StringTokenizer, Date, and Calendar are some of the utility classes that provide important functionalities for string parsing and time tracking.

## Q&A

1. **What is StringTokenizer in Java?**
   - StringTokenizer is a utility class in Java that can split a string into tokens based on specified delimiters.

2. **What is Date in Java?**
   - Date is a utility class in Java that represents a specific instant in time, with millisecond precision.

3. **What is Calendar in Java?**
   - Calendar is an abstract base class for converting between a Date object and a set of integer fields such as YEAR, MONTH, DAY, HOUR, and so on.

# Lesson 8: Introduction to More Utility Classes (Continued)

## Chapters

### 1. Understanding StringTokenizer

The `StringTokenizer` class in Java is used to break a string into tokens. It considers the default delimiters are space (' '), tab ('\t'), newline ('\n'), carriage return ('\r') and form feed ('\f').

#### How StringTokenizer works

Here's an example of how to use `StringTokenizer`:

```java
String str = "Hello, World!";
StringTokenizer st = new StringTokenizer(str, ",");

while (st.hasMoreTokens()) {
    System.out.println(st.nextToken());
}
```

This will output:

```
Hello
 World!
```

#### Real-world examples of StringTokenizer usage

`StringTokenizer` is often used when you need to parse a string into "words" or "tokens". For example, you might use it to parse a CSV file, where each line is a string and each comma-separated value is a token.

### 2. Understanding Date

The `Date` class in Java represents a specific instant in time, with millisecond precision. You can use it to get the current date and time, format a date into a specific string format, or calculate the difference between two dates.

#### How Date works

Here's an example of how to use `Date`:

```java
Date now = new Date();
System.out.println(now);
```

This will output the current date and time.

#### Real-world examples of Date usage

`Date` is often used when you need to keep track of dates and times. For example, you might use it to record when a user created an account, or to calculate how long ago a post was made.

### 3. Understanding Calendar

The `Calendar` class in Java is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on.

#### How Calendar works

Here's an example of how to use `Calendar`:

```java
Calendar cal = Calendar.getInstance();
int year = cal.get(Calendar.YEAR);
int month = cal.get(Calendar.MONTH);
int day = cal.get(Calendar.DAY_OF_MONTH);
System.out.println(year + "/" + (month+1) + "/" + day);
```

This will output the current date.

#### Real-world examples of Calendar usage

`Calendar` is often used when you need to manipulate dates and times. For example, you might use it to calculate the date of one week from now, or to find out the day of the week for a specific date.

## Conclusion

Understanding the utility classes in Java is crucial for effective programming. StringTokenizer, Date, and Calendar are some of the utility classes that provide important functionalities for string parsing and time tracking.

## Q&A

1. **How does StringTokenizer work in Java?**
   - StringTokenizer is used to break a string into tokens. It considers the default delimiters are space (' '), tab ('\t'), newline ('\n'), carriage return ('\r') and form feed ('\f').

2. **How does Date work in Java?**
   - The Date class in Java represents a specific instant in time, with millisecond precision. You can use it to get the current date and time, format a date into a specific string format, or calculate the difference between two dates.

3. **How does Calendar work in Java?**
   - The Calendar class in Java is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on.
