SELECT property_id, user_id, comment FROM Reviews WHERE user_id IN (SELECT bk.user_id FROM Bookings bk JOIN Properties prop ON bk.property_id = prop.property_id
    GROUP BY bk.user_id HAVING COUNT(DISTINCT prop.location) > 1
)
ORDER BY user_id;