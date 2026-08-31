# Power of the Largest Prime Factor

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer  **n**, find if the largest prime factor of n has an exponent greater than  **1**  in its prime factorization.

Return  **true** if its exponent is greater than 1; otherwise, return  **false**.

 **Examples:** 

```
Input: n = 36
Output: true
Explanation: The prime factorization of 36 is 2² × 3². The largest prime factor is 3, and its exponent is 2.

```

```
Input: n = 13
Output: false
Explanation: The prime factorization of 13 is 13¹. The largest prime factor has exponent 1.

```

 **Constraints:** 
1 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T17:11:35.689Z  

```java
// User function Template for Java

class Solution {
    static boolean largePrime(long n) {
        // code here
        return (primeFactPowers(n))?true:false;
    }
    public static boolean primeFactPowers(long n){
        int max=0;
        long lp=-1;
        if(n<=1) return false;
        if(n%2==0){
           int c=0;
	       while(n%2==0){
	         c++;
	         n=n/2;
    	   }
    	   if(c>0){
    	     lp=2;
    	     max=c;
    	   }
        }
	    for(long i=3;i*i<=n;i+=2){
	        int c=0;
	        while(n%i==0){
	            n=n/i;
		        c++;
	         }
	         if(c>0){
                 lp=i;
    	         max=c;
	         }
	    }
	    if(n>2) {
    	    lp=n;
    	    max=1;
	    }
    	return max>1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-of-largest-prime3452/1)