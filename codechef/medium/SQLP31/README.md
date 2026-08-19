# SQLP31

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Analyze Multilocation User Reviews SQL

 **HappyHaven**  is a fast-growing house rental app that connects property owners with potential renters.
As a data analyst at HappyHaven, your role is crucial in unlocking the power of data to understand user behavior, property performance, and overall market trends.
By leveraging the company's extensive database, you contribute to various aspects of the business, ensuring data-driven decision-making and continuous improvement of the app's features and offerings.

- The dataset includes 8 tables: 1. Users: Stores information about the platform's users, such as their name, email, phone number, and address. 2. Properties: Contains details about the available properties for rental, including their title, description, rating, and location. 3. Bookings: Stores booking information, linking users to specific properties and their respective start and end dates. 4. Reviews: Holds user-generated reviews for properties, including the associated property and user IDs, rating, and comments. 5. Amenities: Lists various amenities available in the properties, like WiFi, parking, pool, etc. 6. PropertyAmenities: Represents a many-to-many relationship between properties and amenities, showing which amenities each property offers. 7. Favorites: Keeps track of properties marked as favorites by users. 8. Payments: Stores payment information related to bookings, including the amount and payment date.

Overall, this database design enables users to browse and book properties, leave reviews, add properties to favorites, and make payments for their bookings. The tables are interconnected using primary keys and foreign keys to maintain data integrity and provide a well-structured database for the property rental system.

Now, it's time for you to use the available data to address various scenarios and challenges associated with the HappyHaven Home Rental App.

### Task

Retrieve all reviews by users who have booked properties in more than one location.
Arrange the results in ascending order of user IDs.

- You can refer to the dataset here.
### Output Format

property_id
user_id
comment

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T16:27:21.133Z  

```sql
SELECT property_id, user_id, comment FROM Reviews WHERE user_id IN (SELECT bk.user_id FROM Bookings bk JOIN Properties prop ON bk.property_id = prop.property_id
    GROUP BY bk.user_id HAVING COUNT(DISTINCT prop.location) > 1
)
ORDER BY user_id;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP31)