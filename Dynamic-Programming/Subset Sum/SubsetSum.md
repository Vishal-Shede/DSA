# Subset Sum Problem

**Problem:** Given a set of integers and a value sum, check if there exists a subset that adds up to sum.

**Approach:**
- Use Dynamic Programming (Bottom-Up)
- 2D DP table `dp[i][j]`: True if sum `j` is possible with first `i` elements.

**Time Complexity:** O(n * sum)  
**Space Complexity:** O(n * sum)

**Edge Cases:**
- Empty array
- Sum = 0 (always true)

**Link:** [GeeksforGeeks - Subset Sum](https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/0)
