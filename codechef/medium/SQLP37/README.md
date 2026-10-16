# SQLP37

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T16:51:01.494Z  

```sql
-- your code goes here
SELECT p.property_id, p.title, p.location
FROM Properties p
JOIN PropertyAmenities pa ON p.property_id = pa.property_id
JOIN Amenities a ON pa.amenity_id = a.amenity_id
WHERE a.name IN ('Heating', 'Kitchen')
GROUP BY p.property_id, p.title, p.location
HAVING COUNT(DISTINCT a.name) = 2;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP37)