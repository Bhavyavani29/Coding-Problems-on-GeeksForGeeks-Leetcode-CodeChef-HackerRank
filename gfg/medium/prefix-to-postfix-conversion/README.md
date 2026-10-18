# Prefix to Postfix Conversion

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string  **s**  that represents the prefix form of a valid mathematical expression. Convert it to its postfix form.

 **Examples:** 

```
Input: s = "+AB"
Output: "AB+"
Explanation: In postfix form, operands come first followed by operator.
Prefix to Infix: +AB becomes A + B
Infix to Postfix: A + B becomes AB+

```

```
Input: s = "*+ABC"
Output: AB+C*
Explanation: 
Prefix to Infix:  *+ABC becomes (A + B)* C
Infix to Postfix: (A + B) *C becomes AB+C*  
```

```
Input: s = "*-A/BC-/AKL"
Output: "ABC/-AK/L-*"
Explanation:
Prefix to infix:  *-A/BC-/AKL becomes (A - (B / C))*  ((A / K) - L)
Convert left part to Postfix: (A - (B / C)) becomes ABC/-
Convert right part to Postfix: ((A / K) - L) becomes AK/L-
Combine both with  *to get ABC/-AK/L-* 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T16:45:59.529Z  

```java
class Solution {
	static String preToPost(String s) {
		// code here
		Stack<String> st = new Stack<>();
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				String x = st.pop();
				String y = st.pop();
				st.push(x + y + ch);
			}
			else if (ch != ' ')
				st.push(ch + "");
		}
		return st.pop();
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/prefix-to-postfix-conversion/1)