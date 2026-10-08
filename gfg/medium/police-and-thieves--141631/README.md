# Police and Thieves

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**, where each element contains either a  **'P'**  for policeman or a  **'T'**  for thief. Find the  **maximum number of thieves** that can be caught by the police. 
Keep in mind the following conditions :

- Each policeman can catch only one thief.
- A policeman cannot catch a thief who is more than k units away from him.

 **Examples:** 

```
Input: arr[] = ['P', 'T', 'T', 'P', 'T'], k = 1
Output: 2
Explanation: Maximum 2 thieves can be caught. First policeman catches first thief and second police man can catch either second or third thief.
```

```
Input: arr[] = ['T', 'T', 'P', 'P', 'T', 'P'], k = 2
Output: 3
Explanation: Maximum 3 thieves can be caught.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ k ≤ 1000
arr[i] = 'P' or 'T'

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:50:01.808Z  

```java
class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> police = new ArrayList<>();
        ArrayList<Integer> thief = new ArrayList<>();
		for(int i = 0;i < n;i++){
			if(arr[i] == 'P')
                police.add(i);
            else if(arr[i] == 'T')
                thief.add(i);
		}
		int i = 0,j = 0,res = 0;
		while(i < police.size() && j < thief.size()){
            if(Math.abs(police.get(i) - thief.get(j)) <= k){
                res++;
                i++;
                j++;
            }
            else if(police.get(i) < thief.get(j))
                i++;
            else
                j++;
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/police-and-thieves--141631/1)