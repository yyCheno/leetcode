/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长上升子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans = 0;
        int[] dp = new int[nums.length];
        for ( int i = 0; i < dp.length; i++) {
            dp[i]=1;
            for (int j = 0; j < i; j++) {
                if(nums[j]>nums[i]){
                dp[i]=Math.max(dp[i], dp[j]+1);
                }
            }
            ans=Math.max(ans, dp[i]);
        }
        return ans;
    }
}
// @lc code=end

