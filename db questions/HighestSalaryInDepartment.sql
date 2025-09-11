
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

* `emp_id` is the primary key (column with unique values) for this table.
* Each row of this table contains the ID of an employee, their name, department ID, and salary.

Write a solution to find the employees who have the **highest salary in each department**.
If multiple employees share the same maximum salary in a department, include all of them.
Return the result table in any order.

Example 1
Input:
Employee table:
+--------+----------+---------+--------+
| emp_id | emp_name | dept_id | salary |
+--------+----------+---------+--------+
| 1      | Alice    | 10      | 5000   |
| 2      | Bob      | 10      | 7000   |
| 3      | Charlie  | 20      | 6000   |
| 4      | David    | 20      | 6000   |
| 5      | Eva      | 30      | 8000   |
+--------+----------+---------+--------+

**Output:**
+--------+----------+---------+--------+
| emp_id | emp_name | dept_id | salary |
+--------+----------+---------+--------+
| 2      | Bob      | 10      | 7000   |
| 3      | Charlie  | 20      | 6000   |
| 4      | David    | 20      | 6000   |
| 5      | Eva      | 30      | 8000   |
+--------+----------+---------+--------+

**Explanation:**
* Dept 10 → Max salary is 7000 → Bob
* Dept 20 → Max salary is 6000 → Charlie, David
* Dept 30 → Max salary is 8000 → Eva

---

Approach: 
Using correlated subquery
* For each employee, find the maximum salary in their department.
* Return employees whose salary equals that maximum.
* Ensures that if multiple employees share the max salary, all are included.

*/

SELECT emp_id, emp_name, dept_id, salary
FROM Employee e
WHERE salary = (
    SELECT MAX(salary)
    FROM Employee
    WHERE dept_id = e.dept_id
);
