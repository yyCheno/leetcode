/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> sub = new LinkedList<TreeNode>();
        if(root == null) return ans;
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
            Collections.reverse(tmp);
            ans.add(tmp);
        }
        return ans;
    }
}
// @lc code=end

