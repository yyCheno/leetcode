/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null ) return false;
        int  result =  0;
        if(root.left == null&& root.right == null){
            result += root.val;
            return result == sum;
        }
        dfs(root,result,sum);
       return flag;
    }
    public void dfs(TreeNode root,int result,int sum){
        if (flag == true) return;
        result += root.val;
        if(root.left == null&& root.right == null){
            if(result == sum ) flag = true;
            return;
        }
        if(root.left == null && root.right != null) {
             dfs(root.right, result,sum);
        }else if(root.right == null && root.left != null){
             dfs(root.left, result,sum);
        }else{
            dfs(root.left, result,sum);
            dfs(root.right, result,sum);
        }

        return ;
    }
}
// @lc code=end

