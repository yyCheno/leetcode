import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        ininorderTraversal2(ans, root);
        return ans;
    }
    public void ininorderTraversal2(List<Integer> ans,TreeNode root){
        if(root==null) return ;
        ininorderTraversal2(ans, root.left);
        ans.add(root.val);
        ininorderTraversal2(ans, root.right);
    }
}
// @lc code=end

