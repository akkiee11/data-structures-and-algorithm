
public class MaxSubArraySum {
	//Naive Approach O(n^3) O(1)
	public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					System.out.print(nums[k] + " ");
					sum += nums[k];
				}
				maxSum = Math.max(sum, maxSum);
				System.out.println();
			}
		}
		return maxSum;
	}

	//Naive Approach O(n^2) O(1)
	public int maxSubArray2(int[] nums) {
		int n = nums.length;
		int maxsum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += nums[j];
				maxsum = Math.max(maxsum, sum);
			}

		}
		return maxsum;
	}

	//Optimize Approach O(n) O(1)
	public int maxSubArray3(int[] nums) {
		int maxSum = nums[0];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (sum < 0) {
				sum = 0;
			}
			sum += nums[i];
			maxSum = Math.max(maxSum, sum);
		}

		return maxSum;
	}

}