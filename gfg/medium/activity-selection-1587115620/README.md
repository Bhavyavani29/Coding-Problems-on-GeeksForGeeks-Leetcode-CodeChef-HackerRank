# Activity Selection

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays **start[]** and  **finish[]**, where start[i] and finish[i] represent the start time and finish time of the i-th activity, find the maximum number of activities that a single person can perform.

A person can perform only one activity at a time, and no two selected activities can overlap. If an activity finishes at time x, the next selected activity must start at a time greater than x.

 **Examples:** 

```
Input: start[] = [1, 3, 0, 5, 8, 5], finish[] = [2, 4, 6, 7, 9, 9]
Output: 4
Explanation: One possible selection is activities {0, 1, 3, 4} with time intervals (1, 2), (3, 4), (5, 7), and (8, 9). Each activity starts after the previous one finishes, so a total of 4 activities can be performed.
```

```
Input: start[] = [10, 12, 20], finish[] = [20, 25, 30]
Output: 1
Explanation: Activity 0 finishes at time 20, and activity 2 also starts at time 20. Since the next activity must start after the previous one finishes, they cannot both be selected. Hence, only one activity can be performed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T17:54:57.245Z  

```java
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        PriorityQueue <int[]> pq = new PriorityQueue<>((x,y) -> x[1] - y[1]);
		for(int i = 0;i < n;i++){
			pq.add(new int[] {start[i],finish[i]});
		}
		int ans = 0,ftime = -1;
		while(!pq.isEmpty()){
			int z[] = pq.poll();
			if(z[0] > ftime){
				ans++;
				ftime = z[1];
			}
		}
		return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/activity-selection-1587115620/1)