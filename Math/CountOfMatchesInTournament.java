/ * 
LeetCode Id : 1688

You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. 
A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
Return the number of matches played in the tournament until a winner is decided.


Example 1:
Input: n = 7
Output: 6
Explanation: Details of the tournament: 
- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 3 + 2 + 1 = 6.
    
Example 2:
Input: n = 14
Output: 13
Explanation: Details of the tournament:
- 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
- 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
- 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 7 + 3 + 2 + 1 = 13.
 

Constraints:
1 <= n <= 200

TC : O(logN), SC : O(1)

Approach: The numberOfMatches function calculates the total matches in a tournament where teams halve in each round until a single winner emerges. 
It increments the match count by half the current teams in each round, efficiently determining the advancing teams. 
This logarithmic time complexity approach accurately computes the total matches played.
*/
public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        int n = 7;
        int result = numberOfMatches(n);
        System.out.println("Number of Matches: " + result);
    }

    public static int numberOfMatches(int n) {
       int numOfMatches = 0;

        while (n > 1) {
            int matches = n / 2;
            numOfMatches += matches;
            // Determine the number of teams advancing to the next round
            n = (n % 2 == 0) ? matches : matches + 1;
        }

        return numOfMatches;
    }
}
