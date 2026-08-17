# Multiply Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.

 **Note:**  You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

 **Example 1:** 

```
Input: num1 = "2", num2 = "3"
Output: "6"

```

 **Example 2:** 

```
Input: num1 = "123", num2 = "456"
Output: "56088"

```

 

 **Constraints:** 

- 1 <= num1.length, num2.length <= 200
- num1 and num2 consist of digits only.
- Both num1 and num2 do not contain any leading zero, except the number 0 itself.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.81%)  
**Memory:** 43.7 MB (beats 34.09%)  
**Submitted:** 2026-08-14T15:40:27.919Z  

```java
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
        return "0";
        int m = num1.length();
        int n = num2.length();

        int arr1[] = new int[m];
        for(int i = 0;i < m;i++){
            arr1[i] = num1.charAt(i) - '0';
        }
        
        int arr2[] = new int[n];
        for(int j = 0;j < n;j++){
            arr2[j] = num2.charAt(j) - '0';
        }

        int result[] = new int[m + n];
        for(int i = m - 1;i >= 0;i--){
            for(int j = n - 1;j >= 0;j--){
                int mul = arr1[i] * arr2[j];
                int p1 = i + j;
                int p2 = i + j + 1;
                int total = mul + result[p2];
                result[p1] += total / 10;
                result[p2] = total % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int val : result){
            if(!(sb.length() == 0 && val == 0)){
                sb.append(val);
            }
        }
        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/multiply-strings/)