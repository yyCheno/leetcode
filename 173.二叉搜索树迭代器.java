import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

import jdk.nashorn.api.tree.Tree;

/*
 * @lc app=leetcode.cn id=173 lang=java
 *
 * [173] 二叉搜索树迭代器
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
class BSTIterator {
    
    List<Integer> e = new ArrayList<Integer>();
    int i = 0;
    public BSTIterator(TreeNode root) {
        inode(root);
    }
    
    public int next() {
        i++;
        return e.get(i);
    }
    
    public boolean hasNext() {
        if(i+1<e.size()) return true;
        return false;
    }
    public void inode(TreeNode root){
        if(root == null) return;
        inode(root.left);
        e.add(root.val);
        inode(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

