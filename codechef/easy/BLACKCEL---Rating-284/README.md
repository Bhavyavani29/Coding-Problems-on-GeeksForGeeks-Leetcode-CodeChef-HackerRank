# BLACKCEL - Rating 284

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T17:24:57.088Z  

```js
// Solution

function solve(n, a, b){
    console.log(n - a, n - a - b);
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const nums = input.trim().split(' ');
  const n = parseInt(nums[0]); 
  const a = parseInt(nums[1]); 
  const b = parseInt(nums[2]); 
  solve(n, a, b);
});
```

---

[View on CodeChef](https://www.codechef.com/problems/BLACKCEL)