-- delete id from Person 
-- where id not in(
-- select min(id)
-- from Person 
-- group by email
-- )


DELETE FROM Person 
WHERE id NOT IN (
    SELECT min_id FROM (
        SELECT MIN(id) AS min_id
        FROM Person 
        GROUP BY email
    ) AS temp
);
