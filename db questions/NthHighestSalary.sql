/*
LeetCode Id : 177
------------------------
Problem Description

Table: Employee
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| salary      | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
Each row of this table contains information about the salary of an employee.
 
Write a solution to find the nth highest salary from the Employee table. If there is no nth highest salary, return null.
The result format is in the following example.

Example 1:
Input: 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
n = 2
Output: 
+------------------------+
| getNthHighestSalary(2) |
+------------------------+
| 200                    |
+------------------------+

Example 2:
Input: 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
+----+--------+
n = 2
Output: 
+------------------------+
| getNthHighestSalary(2) |
+------------------------+
| null                   |
+------------------------+

--------------------------------------------------------------------------------------------
SQL SCHEMA

Create table If Not Exists Employee (Id int, Salary int)
Truncate table Employee
insert into Employee (id, salary) values ('1', '100')
insert into Employee (id, salary) values ('2', '200')
insert into Employee (id, salary) values ('3', '300')
---------------------------------------------------------------------------------------------------

Explanation:
The function `getNthHighestSalary(N)` returns the Nth highest salary from the `Employee` table.
It first subtracts 1 from `N` because SQL `LIMIT` uses **zero-based indexing**—so to get the Nth item, we skip `N-1` rows.
Then it selects distinct salaries in descending order and uses `LIMIT N,1` to fetch exactly that salary.
If `N` is larger than the number of distinct salaries, it returns `NULL`.
*/

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
     SET N = N - 1;
    
    RETURN (
        SELECT DISTINCT Salary 
        FROM Employee 
        ORDER BY Salary DESC 
        LIMIT N, 1
    );
END;
