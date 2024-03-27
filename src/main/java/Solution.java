import java.util.Arrays;

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) {
            return 0;
        }
        long prod = 1L;
        int n = nums.length;
        int start = 1;
        int[] dp = new int[n + 1];
        int tot = 0;
        for (int end = 1; end <= n; end++) {
            prod *= nums[end - 1];
            while (prod >= k && start <= end) {
                prod /= nums[start - 1];
                start++;
                dp[end]--;
            }
            dp[end] += dp[end - 1] + 1;
            tot += dp[end];
        }

        return tot;
    }
}

/*  1  2  3 4 5 6 7 8 9
    10,9,10,4,3,8,3,3,6,2,10,10,9,3
    1  1 1  1 2 1 1 2 2 2 1  1  1 1
*/