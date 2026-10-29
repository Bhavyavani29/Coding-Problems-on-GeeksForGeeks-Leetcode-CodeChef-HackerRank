# SQUIDRULE - Rating 740

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T15:44:13.777Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            
            // Your code goes here
            int i;
            for(i = 1; i < n;i++){
                if(d[i] < d[i - 1]){
                    System.out.println("No");
                    break;
                }
            }
            if(i == n)
                System.out.println("Yes");
        }
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SQUIDRULE)