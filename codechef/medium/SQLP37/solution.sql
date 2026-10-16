-- your code goes here
SELECT p.property_id, p.title, p.location
FROM Properties p
JOIN PropertyAmenities pa ON p.property_id = pa.property_id
JOIN Amenities a ON pa.amenity_id = a.amenity_id
WHERE a.name IN ('Heating', 'Kitchen')
GROUP BY p.property_id, p.title, p.location
HAVING COUNT(DISTINCT a.name) = 2;