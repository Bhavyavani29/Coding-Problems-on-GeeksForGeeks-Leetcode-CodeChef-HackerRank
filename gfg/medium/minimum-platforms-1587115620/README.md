# Minimum Platforms

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given arrival  **arr[]** and departure  **dep[]** times of trains on the same day, find the minimum number of platforms needed so that no train waits. A platform cannot serve two trains at the same time; if a train arrives before another departs, an extra platform is needed.

 **Note:**  Time intervals are in the 24-hour format (HHMM), where the first two characters represent hour (between 00 to 23) and the last two characters represent minutes (this will be <= 59 and >= 0). Leading zeros for hours less than 10 are optional (e.g., 0900 is the same as 900).

 **Examples:** 

```
Input: arr[] = [900, 940, 950, 1100, 1500, 1800], dep[] = [910, 1200, 1120, 1130, 1900, 2000]
Output: 3
Explanation: There are three trains during the time 9:40 to 12:00. So we need a minimum of 3 platforms.
```

```
Input: arr[] = [900, 1235, 1100], dep[] = [1000, 1240, 1200]
Output: 1
Explanation: All train times are mutually exclusive. So we need only one platform.

```

```
Input: arr[] = [1000, 935, 1100], dep[] = [1200, 1240, 1130]
Output: 3
Explanation: All three trains have to be there from 11:00 to 11:30
```

**Constraints:
**1 ≤ number of trains ≤ 105
0000 ≤ arr[i] ≤ dep[i] ≤ 2359

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T17:55:32.653Z  

```java
class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n = arr.length;
        int v[][] = new int[n][2];
		for(int i = 0;i < n;i++){
			v[i][0] = arr[i];
			v[i][1] = dep[i];
		}
		Arrays.sort(v,(a,b) ->a[0] - b[0]);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int res = 0;
		for(int i = 0;i < n;i++){
			while(!pq.isEmpty() && pq.peek() < v[i][0]){
				pq.poll();
			} 
			pq.add(v[i][1]);
			res = Math.max(res,pq.size());
		}
		return res;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1)