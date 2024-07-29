package day3;

public class Leetcode123 {

	public static int maxProfit(int[] prices) {
		int n = prices.length;

		int[] leftProfits = new int[n + 1];
		leftProfits[0] = 0;
		leftProfits[1] = 0;
		int minLeft = prices[0];
		for (int i = 2; i <= n; i++) {
			leftProfits[i] = Math.max(leftProfits[i - 1], prices[i - 1] - minLeft);
			minLeft = Math.min(minLeft, prices[i - 1]);
		}

		int[] rightProfits = new int[n + 1];
		rightProfits[0] = 0;
		rightProfits[1] = 0;
		int maxRight = prices[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			int len = n - i;
			rightProfits[len] = Math.max(rightProfits[len - 1], maxRight - prices[i]);
			maxRight = Math.max(maxRight, prices[i]);
		}

		int ans = 0;
		for (int i = 0; i <= n; i++) {
			ans = Math.max(ans, leftProfits[i] + rightProfits[n - i]);
		}

		return ans;
	}

	public static void main(String[] args) {

		int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };
		System.out.println(maxProfit(prices));

	}

}
