package day3;

import java.util.Arrays;

public class Leetcode188 {

	public static int maxProfit(int k, int[] prices) {
		int[][] dp = new int[prices.length + 1][2 * k + 1];
		for (int i = 0; i <= prices.length; i++) {
			Arrays.fill(dp[i], 0);
		}

		for (int i = prices.length - 1; i >= 0; i--) {
			for (int j = 2 * k - 1; j >= 0; j--) {
				if (j % 2 == 0) {
					dp[i][j] = Math.max(dp[i + 1][j], -prices[i] + dp[i + 1][j + 1]);
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], prices[i] + dp[i + 1][j + 1]);
				}
			}
		}

		return dp[0][0];
	}

	public static void main(String[] args) {

		int k = 2;
		int[] prices = { 3, 2, 6, 5, 0, 3 };
		System.out.println(maxProfit(k, prices));

	}

}
