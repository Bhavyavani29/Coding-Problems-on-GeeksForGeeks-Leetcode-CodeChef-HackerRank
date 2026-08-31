# Kth Smallest Factor

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number  **n**  and an integer  **k**, find the k-th smallest divisor (factor) of n. If the k-th divisor does not exist, return -1.

 **Examples:** 

```
Input: n = 12, k = 5
Output: 6
Explanation: Divisors of 12 in sorted order are: 1, 2, 3, 4, 6, 12. The 5th smallest divisor is 6.
```

```
Input: n = 16, k = 2
Output: 2
Explanation: Divisors of 16 in sorted order are: 1, 2, 4, 8, 16. The 2nd smallest divisor is 2.
```

 **Constraints:** 
1 ≤ n ≤ 109
1 ≤ k ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T17:10:21.757Z  

```java
class Solution {
    public static int kThSmallestFactor(int n, int k) {
        //code here.
      List<Integer> fact=new ArrayList<>();
      for(int i=1;i*i<=n;i++){
          if(n%i==0){
              fact.add(i);
              if(i!=n/i){
                  fact.add(n/i);
              }
          }
      }
      Collections.sort(fact);
      return (k<=fact.size())?fact.get(k-1):-1;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/kth-smallest-factor2345/1)