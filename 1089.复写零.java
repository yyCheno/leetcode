/*
 * @lc app=leetcode.cn id=1089 lang=java
 *
 * [1089] 复写零
 */

// @lc code=start
class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        for(int i = 0;i<len;i++){
            if(arr[i]!=0) continue;
            if(i==len-1&&arr[i]==0) break;
            move(arr, i, len);
            arr[i+1] = 0;
            i++;
        }
    }
    void move(int[] arr,int j,int i){
        i=i-1;
        for(;i>j;i--){
            arr[i] = arr[i-1];
        }
    }
}
// @lc code=end

