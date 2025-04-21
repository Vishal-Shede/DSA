public class Solution {

    // Function to check if a subset with given sum exists
    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;

        // Create a 2D boolean DP table
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Base Case 1: If sum is 0, answer is true (empty subset)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Base Case 2: If no elements and sum > 0, answer is false
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = false;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                // If current element is greater than the target sum,
                // we cannot include it
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
                // Else check if we can form the sum either by:
                // 1. excluding the current element OR
                // 2. including it
                else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        // The answer is in the bottom-right corner of the table
        return dp[n][sum];
    }

    
    public static void main(String[] args) {
        // Sample test case
        int[] arr = {2, 3, 5, 8, 10};
        int sum = 11;

        System.out.println(isSubsetSum(arr, sum)); // true

    }
}
