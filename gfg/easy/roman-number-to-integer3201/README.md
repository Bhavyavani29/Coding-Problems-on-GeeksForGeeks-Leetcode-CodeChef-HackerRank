# Roman to Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  in Roman number format, your task is to  **convert**  it to an  **integer**. Various symbols and their values are given below.
 **Note:** I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000

 **Examples:** 

```
Input: s = "IX"
Output: 9
Explanation: IX is a Roman symbol which represents 10 – 1 = 9.
```

```
Input: s = "XL"
Output: 40
Explanation: XL is a Roman symbol which represents 50 – 10 = 40.
```

```
Input: s = "MCMIV"
Output: 1904
Explanation: M is 1000, CM is 1000 – 100 = 900, and IV is 4. So we have total as 1000 + 900 + 4 = 1904.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T17:19:43.275Z  

```java
class Solution {
	public int romanToInteger(String s) {
		// code here
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int sum = 0;
		for(int i = 0;i < s.length() - 1;i++){
		    int curr = hm.get(s.charAt(i));
		    int next = hm.get(s.charAt(i + 1));
		    if(curr >= next){
		        sum += curr;
		    }
		    else{
		        sum -= curr;
		    }
		}
		sum += hm.get(s.charAt(s.length() - 1));
		return sum;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/roman-number-to-integer3201/1)