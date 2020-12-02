import java.util.List;

/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> ans1 = new LinkedList<>();
        List<Integer> ans2 = new LinkedList<>();
        ininorderTraversal2(ans1, p);
        ininorderTraversal2(ans2, q);
        return ans1.equals(ans2);
    }
    public void ininorderTraversal2(List<Integer> ans,TreeNode root){
        if(root==null){
            ans.add(null);
            return;
        }
        ans.add(root.val);
        ininorderTraversal2(ans, root.left);
       
        ininorderTraversal2(ans, root.right);
    }
}
// @lc code=end

