/* 
LeetCode Id: 1716

Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.

Example 1:
Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.

Example 2:
Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.

Example 3:
Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
 
Constraints:
1 <= n <= 1000

TC : O(1)

Approach : The approach used in the solution is to first calculate the total money for complete weeks using the arithmetic series formula. 
Then, the remaining days are handled in a loop, where the money for each day is added to the total. The solution is efficient because it avoids iterating over each day individually, 
and instead, it leverages the mathematical properties of the weekly pattern to compute the result more optimally. 
In simpler terms, it efficiently calculates the total amount of money a person accumulates in a LeetCode Bank based on the given number of days.


*/
public class CalculateMoneyInBank {
    public static void main(String[] args) {
        int n = 10;
        int result = totalMoney(n);
        System.out.println("Total money after " + n + " days: " + result);
    }

    public static int totalMoney(int n) {
        int totalWeeks = n / 7;
      
        //Used Arithmetic Progression and formula is = k/2(2*a(k-1)*7)
        int totalMoney = (totalWeeks * (2 * 28 + (totalWeeks -1) * 7)) / 2;

        for(int day = 0;day<n%7;day++){
            totalMoney += (totalWeeks + 1) + day;
        }
        return totalMoney;
    }

  /* 
  Brutforce
  public int totalMoney(int n) {
        int totalMoney = 0;
        int currentWeek = 0;

        for (int day = 1; day <= n; day++) {
            if (day % 7 == 1) {
                // Start of a new week
                currentWeek++;
            }

            // Calculate the money to be added on the current day
            int moneyToAdd = currentWeek + (day % 7 == 0 ? 6 : day % 7 - 1);
            totalMoney += moneyToAdd;
        }
        return totalMoney;
    }
  */
}
