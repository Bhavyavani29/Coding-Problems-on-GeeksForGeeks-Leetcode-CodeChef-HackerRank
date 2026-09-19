SELECT property_id, title, location, rating,
       (SELECT AVG(rating) FROM Properties) AS avg_all_ratings
FROM Properties
WHERE rating > (SELECT AVG(rating) FROM Properties)
ORDER BY property_id ASC;