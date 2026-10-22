# Next Greater Element

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array  **arr[]**  of integers, the task is to find the next greater for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
If there does not exist next greater of current element, then next greater element for current element is  **-1**.

**Examples
**

```
Input: arr[] = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.

```

```
Input: arr[] = [6, 8, 0, 1, 3]
Output: [8, -1, 1, 3, -1]
Explanation: The next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1, for 1 it is 3 and then for 3 there is no larger element on right and hence -1.
```

```
Input: arr[] = [1, 2, 3, 5]
Output: [2, 3, 5, -1]
Explanation: For a sorted array, the next element is next greater element also except for the last element.
```

```
Input: arr[] = [5, 4, 3, 1]
Output: [-1, -1, -1, -1]
Explanation: There is no next greater element for any of the elements in the array, so all are -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T17:18:21.964Z  

```java
class Solution {
	public ArrayList<Integer> nextLargerElement(int[] arr) {
		// code here
		int n = arr.length;
		Stack<Integer> st = new Stack<>();
		int[] a = new int[n];
		a[n - 1] = -1;
		st.push(arr[n - 1]);
		for (int i = n - 2; i >= 0; i--) {
			int curr = arr[i];
			while (!st.isEmpty() && st.peek() <= curr)
				st.pop();
			if (st.isEmpty())
				a[i] = -1;
			else
				a[i] = st.peek();
			st.push(curr);
		}
		ArrayList<Integer> al = new ArrayList<>();
		for (int x : a)
			al.add(x);
		return al;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1)