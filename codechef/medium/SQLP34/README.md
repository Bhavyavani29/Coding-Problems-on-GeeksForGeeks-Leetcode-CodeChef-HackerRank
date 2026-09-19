# SQLP34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Analyze Above Average Property Ratings
### Task

Retrieve properties that have a rating higher than the average rating of all properties in the dataset.
Present the results in ascending order of property IDs.

- You can refer to the dataset here.
### Output Format

property_id
title
location
rating
avg_all_ratings

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T05:25:47.630Z  

```sql
SELECT property_id, title, location, rating,
       (SELECT AVG(rating) FROM Properties) AS avg_all_ratings
FROM Properties
WHERE rating > (SELECT AVG(rating) FROM Properties)
ORDER BY property_id ASC;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP34)