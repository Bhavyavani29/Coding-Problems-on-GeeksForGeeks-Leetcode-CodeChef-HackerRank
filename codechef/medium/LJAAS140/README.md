# LJAAS140

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calculate area

Write a program to compute and print the area of a rectangle. Take length and width as user inputs.

### Sample 1:
Input
Output

```
5 8
```

```
40
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T16:24:14.434Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Take length and width as input
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = calculateArea(length, width);
        System.out.println(area);    
    }
    
    public static int calculateArea(int length, int width) {
        // Complete this method
        return (length * width);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS140)