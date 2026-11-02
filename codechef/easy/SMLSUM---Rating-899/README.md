# SMLSUM - Rating 899

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T04:20:46.588Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            // Your code goes here
            int result = 0;
            for(int i = 0;i < n;i++){
                if(a[i] <= 2 * b[i] && b[i] <= 2 * a[i]){
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SMLSUM)