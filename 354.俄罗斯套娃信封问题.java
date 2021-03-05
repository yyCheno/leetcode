import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=354 lang=java
 *
 * [354] 俄罗斯套娃信封问题
 */

// @lc code=start
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes.length<=1) return envelopes.length;
        int ans = 0;
        Arrays.sort(envelopes, (o1,o2)->o1[0]-o2[0]);
        int[] dp = new int[envelopes.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(check(envelopes[j], envelopes[i])){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    public boolean check(int[] o1,int[] o2){
        return o1[0]<o2[0] && o1[1]<o2[1];
    }
}
// @lc code=end

