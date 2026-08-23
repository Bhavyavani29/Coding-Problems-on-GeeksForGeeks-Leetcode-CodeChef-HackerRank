# LJAAS140

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T16:22:52.495Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        
        int result = calculatePower(base, exponent);
        System.out.println(result);    
    }
    
    public static int calculatePower(int base, int exponent) {
        // Complete the method 
        return (int) Math.pow(base, exponent);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS140)