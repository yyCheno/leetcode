/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        isVBST(root.left,root.val,true);
        isVBST(root.right, root.val,false);
        return flag;
    }
    void isVBST(TreeNode root,int n,boolean left){
        if(!flag) return;
        if(left){
        if(root.left!=null&&(root.left.val>=root.val||root.left.val>=n)){
            flag =false;
            return;
        }
        if(root.right!=null&&root.right.val<=root.val||root.left.val>=n){
            flag =false;
            return;
        }
        if(root.left!=null) isVBST(root.left,n,left);
        if(root.right!=null) isVBST(root.right,n,left);
    }else{
        if(left){
            if(root.left!=null&&(root.left.val>=root.val||root.left.val<=n)){
                flag =false;
                return;
            }
            if(root.right!=null&&root.right.val<=root.val||root.left.val<=n){
                flag =false;
                return;
            }
            if(root.left!=null) isVBST(root.left,n,left);
            if(root.right!=null) isVBST(root.right,n,left);
    }
    }
}
// @lc code=end

