import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
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
    List<Integer> e = new LinkedList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        inode(root);
        return e.get(k-1);
    }
    public void inode(TreeNode root){
        if(root==null) return;
        inode(root.left);
        e.add(root.val);
        inode(root.right);
    }
}
// @lc code=end

