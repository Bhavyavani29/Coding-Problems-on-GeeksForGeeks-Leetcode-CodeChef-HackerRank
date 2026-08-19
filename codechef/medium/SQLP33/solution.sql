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