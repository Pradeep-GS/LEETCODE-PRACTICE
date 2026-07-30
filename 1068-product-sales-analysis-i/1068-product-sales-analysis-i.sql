# Write your MySQL query statement below
SELECT s2.product_name , s1.year , s1.price FROM Sales S1
JOIN Product s2 ON s1.product_id = s2.product_id;