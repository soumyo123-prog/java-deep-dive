package day3;

import java.util.Arrays;

public class Leetcode790 {

	static int MOD = 1000000007;

	static int f(int top, int bottom, int n, int[][] dp) {
		if (top > n || bottom > n)
			return 0;
		if (top == n && bottom == n)
			return 1;

		if (dp[top][bottom] != -1)
			return dp[top][bottom];

		int result = 0;

		if (top == bottom) {
			result = (result % MOD + f(top + 1, bottom + 1, n, dp) % MOD) % MOD;
			result = (result % MOD + f(top + 2, bottom + 2, n, dp) % MOD) % MOD;
			result = (result % MOD + f(top + 1, bottom + 2, n, dp) % MOD) % MOD;
			result = (result % MOD + f(top + 2, bottom + 1, n, dp) % MOD) % MOD;
		}

		if (top > bottom) {
			result = (result % MOD + f(top, bottom + 2, n, dp) % MOD) % MOD;
			result = (result % MOD + f(top + 1, bottom + 2, n, dp) % MOD) % MOD;
		}

		if (bottom > top) {
			result = (result % MOD + f(top + 2, bottom, n, dp) % MOD) % MOD;
			result = (result % MOD + f(top + 2, bottom + 1, n, dp) % MOD) % MOD;
		}

		return dp[top][bottom] = result % MOD;
	}

	public static int numTilings(int n) {
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], -1);
		}
		return f(0, 0, n, dp);
	}

	public static void main(String[] args) {

		System.out.println(numTilings(10));

	}

}
