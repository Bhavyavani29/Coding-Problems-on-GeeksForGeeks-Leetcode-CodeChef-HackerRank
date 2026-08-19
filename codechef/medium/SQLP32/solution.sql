-- your code goes here
Select user_id, name, email, phone, address from Users where user_id in(Select pmt.user_id from Payments pmt group by user_id having count(*) > 1) Order by user_id;