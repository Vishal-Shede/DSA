public class Solution {

    static int knapsack(int wt[], int val[], int W, int n) {
        int[][] dp = new int[n + 1][W + 1];

        // Base case initialization (can be skipped, Java initializes to 0)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int w = 0; w <= W; w++) {
            dp[0][w] = 0;
        }

        // Build the table
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i - 1] > w) {
                    dp[i][w] = dp[i - 1][w]; // can't include
                } else {
                    dp[i][w] = Math.max(
                        val[i - 1] + dp[i - 1][w - wt[i - 1]], // include
                        dp[i - 1][w] // exclude
                    );
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 4, 5};
        int[] values = {10, 40, 50, 70};
        int capacity = 8;
        int n = weights.length;

        int maxValue = knapsack(weights, values, capacity, n);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
