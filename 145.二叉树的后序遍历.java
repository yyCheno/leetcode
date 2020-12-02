/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        postorderTraversal2(ans, root);
        return ans;
    }
    public void postorderTraversal2(List<Integer> ans,TreeNode root){
        if(root==null) return ;
        postorderTraversal2(ans, root.left);
        postorderTraversal2(ans, root.right);
        ans.add(root.val);
    }
}
// @lc code=end

