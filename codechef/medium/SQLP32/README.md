# SQLP32

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Identify Frequent Users with Bookings
### Task

Find all users who have made more than one payment and have at least one booking for the month of July 2023.
Arrange the results in ascending order of user IDs.

- You can refer to the dataset here.
### Output Format

user_id
name
email
phone
address

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T16:35:07.471Z  

```sql
-- your code goes here
Select user_id, name, email, phone, address from Users where user_id in(Select pmt.user_id from Payments pmt group by user_id having count(*) > 1) Order by user_id;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP32)