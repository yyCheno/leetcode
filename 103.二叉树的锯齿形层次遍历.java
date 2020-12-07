import java.util.Collection;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层次遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> sub = new LinkedList<TreeNode>();
        boolean flag = true;
        if(root == null) return ans;
        sub.offer(root);
        while(!sub.isEmpty()){
            List<Integer> tmp = new ArrayList<Integer>();
            int len = sub.size();
            for(int i = 0;i<len;i++){
                TreeNode node = sub.poll();
                tmp.add(node.val);
                if (flag){
                if(node.left!=null) sub.offer(node.left);
                if(node.right!=null) sub.offer(node.right);
                }else{
                    if(node.right!=null) sub.offer(node.right);
                    if(node.left!=null) sub.offer(node.left);
                }
            }
            ans.add(tmp);
            
            if(flag){flag=false;}else{flag=true;}
        }
        return ans;
    }
}
// @lc code=end

