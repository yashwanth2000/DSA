
/*
Problem Description

Table: Employee
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| emp_id      | int     |
| emp_name    | varchar |
| dept_id     | int     |
| salary      | int     |
+-------------+---------+
* `emp_id` is the primary key (column with unique values).
* Each row contains the employee’s ID, name, department, and salary.

Write a solution to **find all employee names that appear more than once** in the Employee table.
Return each name along with the number of times it appears.

Example 1
**Input:**
Employee table:
+--------+----------+---------+--------+
| emp_id | emp_name | dept_id | salary |
+--------+----------+---------+--------+
| 1      | Alice    | 10      | 5000   |
| 2      | Bob      | 10      | 7000   |
| 3      | Alice    | 20      | 6000   |
| 4      | David    | 20      | 6000   |
| 5      | Eva      | 30      | 8000   |
+--------+----------+---------+--------+

**Output:**
+----------+----------+
| emp_name | count(*) |
+----------+----------+
| Alice    | 2        |
+----------+----------+

**Explanation:**
* `Alice` appears **2 times** in the Employee table.
* Other names appear only once, so they are not included in the result.

Approach
Using GROUP BY with HAVING
* `GROUP BY emp_name` groups all rows by employee name.
* `COUNT(*)` counts how many times each name appears.
* `HAVING COUNT(*) > 1` filters only names that occur more than once.
*/

SELECT emp_name, COUNT(*) AS name_count
FROM Employee
GROUP BY emp_name
HAVING COUNT(*) > 1;
