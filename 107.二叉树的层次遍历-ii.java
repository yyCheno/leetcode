import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> sub = new LinkedList<TreeNode>();
        if(root == null) return ans;
        if(root.left==null&&root.right==null) {
            ans.add(new LinkedList<Integer>(root.val));
            return ans;
        }
        sub.offer(root);
        while(!sub.isEmpty()){
            List<Integer> tmp = new ArrayList<Integer>();
            int len = sub.size();
            for(int i = 0;i<len;i++){
                TreeNode node = sub.poll();
                tmp.add(node.val);
                if(node.left!=null) sub.offer(node.left);
                if(node.right!=null) sub.offer(node.right);
            }
            ans.add(0,tmp);
        }
        return ans;
    }
}
// @lc code=end

