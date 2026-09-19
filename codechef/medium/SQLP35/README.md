# SQLP35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T05:25:49.672Z  

```sql
SELECT property_id, title, location, rating,
       (SELECT AVG(rating) FROM Properties) AS avg_all_ratings
FROM Properties
WHERE rating > (SELECT AVG(rating) FROM Properties)
ORDER BY property_id ASC;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP35)