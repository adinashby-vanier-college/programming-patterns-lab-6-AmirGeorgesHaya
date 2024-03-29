[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/kN50camg)
# Programming Patterns - Lab 6

This template repository is the starter project for Programming Patterns Lab 6. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2) ^ 2 + (y1 - y2) ^ 2).

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

Note: Define your own sorting algorithm and solve the problem if you needed to use sorting. Do NOT use the java one.

Example 1:

![](Q1.jpg)

Input: points = [[1,3],[-2,2]], k = 1  
Output: [[-2,2]]  
Explanation:  
The distance between (1, 3) and the origin is sqrt(10).  
The distance between (-2, 2) and the origin is sqrt(8).  
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.  
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].

Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], k = 2  
Output: [[3,3],[-2,4]]  
Explanation: The answer [[-2,4],[3,3]] would also be accepted.

**Constraints**

1 <= k <= points.length <= 104  
-104 < xi, yi < 104

### Setup Command

`gradle clean`

### Run Command

`gradle test`
