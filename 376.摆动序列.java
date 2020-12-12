/*
 * @lc app=leetcode.cn id=376 lang=java
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1) return nums.length;
        if(nums.length==2&&nums[0]==nums[1]) return 1;
        int[] dp = new int[nums.length];
        if(nums[0]!=nums[1]){
            dp[0] = 1;
            dp[1] = 2;
        }else{
            dp[0]=1;
            dp[1] = 1;
        }
       int  start = find(nums);
       int k =start;
        if(k == -1) {
            return 1;
        }else{
            dp[k+1] = 2;
        }
        for(int i = start+2;i<nums.length;i++){
            if(com(nums[k],nums[i-1],nums[i])){
                dp[i] = dp[i-1]+1;
                k=i-1;
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[nums.length-1];

    }
    boolean com(int pre,int now,int right){
        if((now>pre&&now>right)||(now<pre&&now<right)) return true;
        return false;
    }
    int find(int[] nums){
        for(int i = 0;i<nums.length;i++ ){
            if(i==nums.length-1) return -1;
            if(nums[i]!=nums[i+1]) return i;
        }
        return -1;
    }
}
// @lc code=end

