# Reverse Array Using Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**, reverse the array elements in-place by using a  **stack**.

 **Examples :** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 5 4 3 2 1
Explanation: After the reverse, array will look like [5, 4, 3, 2, 1].
```

```
Input: arr[] = [1]
Output: 1
Explanation: After the reverse, array will look like [1].
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:16:27.464Z  

```java
class Solution {
    public void reverseArray(int[] arr) {
        // code here
        Stack <Integer> st = new Stack<>();
        for(int num : arr){
            st.push(num);
        }
        int index = 0;
        while(!st.isEmpty()){
            arr[index] = st.pop();
            index++;
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-array-using-stack--143151/1)