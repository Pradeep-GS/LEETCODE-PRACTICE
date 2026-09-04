WITH salary AS (
    SELECT *,
           DENSE_RANK() OVER (
               PARTITION BY departmentId
               ORDER BY salary DESC
           ) AS rnk
    FROM Employee
)
SELECT e.name as "Department", s.name as 'Employee', s.salary as 'Salary'
FROM salary s
INNER JOIN Department e
    ON e.id = s.departmentId
WHERE s.rnk = 1;