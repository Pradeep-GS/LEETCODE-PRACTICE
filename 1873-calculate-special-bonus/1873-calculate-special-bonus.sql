# Write your MySQL query statement below
SELECT employee_id ,CASE WHEN name like 'M%' THEN salary = 0 
    WHEN 
        employee_id%2 = 0  THEN salary = 0 
    else 
        salary 
    END AS bonus
    from 
        Employees order by employee_id asc;