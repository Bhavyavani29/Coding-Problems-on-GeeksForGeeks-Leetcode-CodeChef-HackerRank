# SQLP33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Advanced SQL Subquery Rating Filter
### Task

List all properties with their average rating greater than 4 and the number of reviews they have received.
Present the results in ascending order of property IDs.

- You can refer to the dataset here.

 **Expected Output** 

```
┌─────────────┬───────────────────────┬─────────────────────┬────────────────┬──────────────┐
│ property_id │         title         │      location       │ average_rating │ review_count │
├─────────────┼───────────────────────┼─────────────────────┼────────────────┼──────────────┤
│ 1           │ City Center Apartment │ New York, NY        │ 4.35           │ 2            │
│ 3           │ Elegant Townhouse     │ London, UK          │ 4.5            │ 2            │
│ 6           │ Luxury Beach House    │ Miami, FL           │ 4.25           │ 2            │
│ 7           │ Urban Studio          │ Paris, France       │ 4.6            │ 1            │
│ 8           │ Country House         │ Tuscany, Italy      │ 4.7            │ 2            │
│ 9           │ Studio Apartment      │ Tokyo, Japan        │ 4.75           │ 2            │
│ 10          │ Cozy Cabin            │ Lake Tahoe, CA      │ 4.5            │ 1            │
│ 11          │ Lakeside Villa        │ Geneva, Switzerland │ 4.3            │ 1            │
│ 12          │ Ski Resort Chalet     │ Whistler, Canada    │ 4.8            │ 1            │
│ 13          │ Historic Mansion      │ Rome, Italy         │ 4.15           │ 2            │
│ 16          │ Countryside Farmhouse │ Provence, France    │ 4.5            │ 1            │
│ 18          │ Mountain Retreat      │ Banff, Canada       │ 4.5            │ 2            │
│ 19          │ Vineyard Estate       │ Napa Valley, CA     │ 4.2            │ 1            │
│ 20          │ City View Condo       │ Dubai, UAE          │ 4.45           │ 2            │
│ 22          │ Beachfront Villa      │ Phuket, Thailand    │ 4.2            │ 1            │
└─────────────┴───────────────────────┴─────────────────────┴────────────────┴──────────────┘

```

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T16:57:17.020Z  

```sql
SELECT prop.property_id, prop.title, prop.location,
       (SELECT AVG(rating)
        FROM Reviews rv
        WHERE rv.property_id = prop.property_id) AS average_rating,
       (SELECT COUNT(review_id)
        FROM Reviews rv
        WHERE rv.property_id = prop.property_id) AS review_count
FROM Properties prop
WHERE prop.property_id IN (
    SELECT property_id
    FROM Reviews
    GROUP BY property_id
    HAVING AVG(rating) > 4
)
ORDER BY prop.property_id;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP33)