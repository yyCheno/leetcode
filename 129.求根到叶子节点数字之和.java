/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根到叶子节点数字之和
 */
import java.util.List;
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
    public int sumNumbers(TreeNode root) {
        List<Integer> allPath = binaryTreePaths(root);
        int sum = 0;
        for (Integer integer : allPath) {
            sum+=integer;
        }
        return sum;
    }
    public List<Integer> binaryTreePaths(TreeNode root) {
        if(root == null ) return null;
                String path = String.valueOf(root.val) ;
                List<Integer> allPath = null;
               dfs(root, path, allPath);
               return allPath;
            }
            public void dfs(TreeNode root,String path,List<Integer> allPath){
                if (root == null ){
                    allPath.add(Integer.valueOf(path));
                    return;
                } 
                path += String.valueOf(root.val);
                dfs(root.left, path, allPath);
                dfs(root.right, path, allPath);
            }
            }
}
// @lc code=end

