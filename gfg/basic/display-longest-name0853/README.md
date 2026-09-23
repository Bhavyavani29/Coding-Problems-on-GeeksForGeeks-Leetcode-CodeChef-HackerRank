# Longest Word

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array arr[] containing strings of names. Your task is to return the longest string. If there are multiple names of the longest size, return the  **first**  occurring name.

 **Examples :** 

```
Input: arr[] = ["Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"]
Output: "GeeksforGeeks"
Explanation: Name "GeeksforGeeks" has maximum length among all names. 

```

```
Input: arr[] = ["Apple", "Mango", "Orange", "Banana"]
Output: "Orange"
Explanation: Names "Orange" and "Banana" both have maximum length among all names but Orange comes first so answer will be "Orange". 
```

 **Constraints:** 
1 ≤ arr.size() ≤ 1000
1 ≤ arr[i] ≤ 1000
arr[i] has only lowercase and uppercase letters

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T16:40:28.088Z  

```java
class Solution {
    public String longest(String[] arr) {
        // code here
        int max = 0 , length = 0, idx = 0;
        String name = "";
        for(int i = 0;i < arr.length;i++){
            name = arr[i];
            length = name.length();
            if(max < length){
                max = length;
                idx = i;
            }
        }
        return arr[idx];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/display-longest-name0853/1)