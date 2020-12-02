import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null ) return new LinkedList();
        String path = String.valueOf(root.val) ;
        List<String> allPath = new LinkedList<String>();
        if(root.left == null&& root.right == null){
            allPath.add(path);
            return allPath;
        }
       dfs(root.left, path, allPath);
       dfs(root.right, path, allPath);
       return allPath;
    }
    public void dfs(TreeNode root,String path,List<String> allPath){
        if(root == null){
            return;
        }
        path += "->"+ String.valueOf(root.val);
        if (root.left == null && root.right == null ){
            allPath.add(path);
            return;
        }
        if(root.left == null) {
            dfs(root.right, path, allPath);
            return;
        }
        if(root.right == null){
            dfs(root.left, path, allPath);
            return;
        }
        dfs(root.left, path, allPath);
        dfs(root.right, path, allPath);
    }
}
// @lc code=end

