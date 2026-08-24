# LJAAS149

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Increase the integer

Write a program that takes t test cases as input, then for each test case, reads an integer N, and prints N + 1.

### Sample 1:
Input
Output

```
3
4
2
-1
```

```
5
3
0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T15:40:02.279Z  

```java
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0){
		    int N = sc.nextInt();
		     System.out.println(N  + 1);
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS149)