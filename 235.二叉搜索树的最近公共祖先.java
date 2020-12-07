/*
 * @lc app=leetcode.cn id=235 lang=java
 *
 * [235] 二叉搜索树的最近公共祖先
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(isIn(root.val, p.val, q.val)) return root;
        if(root.val>)
        
    }
    boolean isIn(int root, int p, int q){
        boolean flag = true;
        if(q<p) flag =false;
        if(flag){
            if(root>p&&root<q) return true;
        }else{
            if(root<p&&root>q) return true;
        }
        return false;
    }
}
// @lc code=end

