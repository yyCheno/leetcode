import org.graalvm.compiler.core.common.alloc.Trace;

/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null ) return true;
        if(Math.abs(caH(root.left)-caH(root.right))>1) return false;
        dfs(root);
        return flag;
    }
    int caH (TreeNode root){
        if(root==null) return 0;
        return Math.max(caH(root.left)+1, caH(root.right)+1);
    }
    void dfs(TreeNode root){
        if(flag == false) return ;
        if(root == null) return;
        if(Math.abs(caH(root.left)-caH(root.right))>1){
            flag = false;
            return;
        }
        dfs(root.left);
        dfs(root.right);
    }
}
// @lc code=end

