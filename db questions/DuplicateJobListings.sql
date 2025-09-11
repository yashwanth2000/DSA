/*
Assume you're given a table containing job postings from various companies on the LinkedIn platform. Write a query to retrieve the count of companies that have posted duplicate job listings.

Approach
Using GROUP BY with HAVING and DISTINCT
* `GROUP BY company_id, title, description` groups listings by company and job details.
* `HAVING COUNT(*) > 1` keeps only duplicate listings within each group.
* Inner query returns all duplicate listings.
* `COUNT(DISTINCT company_id)` in outer query counts how many companies have such duplicates.
*/

SELECT COUNT(DISTINCT company_id) AS duplicate_companies
FROM (
    SELECT company_id
    FROM job_listings
    GROUP BY company_id, title, description
    HAVING COUNT(*) > 1
) AS duplicate_listings;
