# Lucky Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer  **n**, determine if it is a  **Lucky Number**.

Lucky numbers are identified using a elimination process on the infinite sequence of natural numbers (1, 2, 3, 4,...):
    **1.** Remove every 2nd number from the sequence.
    **2.** From the remaining sequence, remove every 3rd number.
    **3.** From the remaining sequence, remove every 4th number, and so on...

This continues indefinitely. Return  **true**  if  **n**  survives the elimination process (is a lucky number). Otherwise, return  **false**.

 **Examples :** 

```
Input: n = 5
Output: false
Explanation: 5 is not a lucky number as it gets deleted in the second iteration.

```

```
Input: n = 19
Output: true
Explanation: 19 is a lucky number because it does not get deleted throughout the process.
```

 **Constraints:** 
1 ≤  n ≤  108

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T12:49:17.475Z  

```java
class Solution {
	public static boolean isLucky(int n) {
		// code here
		int counter = 2;
		int remaining = n;
		while (counter <= remaining) {
			if (remaining % counter == 0) {
				return false;
			}
			else {
				remaining = remaining - (int) Math.floor(remaining / counter);
			}
			counter++;
		}
		return true;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/lucky-numbers2911/1)