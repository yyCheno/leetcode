/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        for(int i = 0;i<nums.length;i++){
            if (nums[i]==target){
                res[0] = i;
                break;
            }
        }
        if(res[0]==-1) return res;
        for(int j = res[0];j<nums.length;j++){
            if(nums[j]!=target){
                res[1] = j-1;
                break;
            }
        }
        if(res[1]==-1) res[1] = nums.length-1;
        return res;
    }
}
// @lc code=end

