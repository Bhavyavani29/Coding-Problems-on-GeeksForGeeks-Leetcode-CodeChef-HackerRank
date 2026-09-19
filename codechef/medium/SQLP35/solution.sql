-- your code goes here
select user_id, count(property_id) as favorite_count from Favorites group by user_id order by count(property_id) desc limit 1;