# 🧠 0/1 Knapsack Problem – Top-Down DP (Tabulation)

## 📌 Problem Statement
Given `n` items with weights and values, and a knapsack with capacity `W`, find the maximum value that can be obtained by selecting items such that:
- Each item is picked **at most once**
- Total weight ≤ `W`

---

## 🧾 Approach: Dynamic Programming (Top-Down Tabulation)

We use a 2D DP table where:

- `dp[i][w]` represents the **maximum value** we can get using the **first `i` items** and a knapsack capacity of `w`.



