# LJAAS80

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Arithmetic operation

Write a program that takes two numbers and an operator (+, -, *, /) as input. Use a  **switch**  statement to perform the corresponding arithmetic operation and print the result.

### Sample 1:
Input
Output

```
5 2 +
```

```
7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:57:37.520Z  

```java
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //your code goes InheritableThreadLocal
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS80)