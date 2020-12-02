import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
 */

// @lc code=start

  public class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
 }
 
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        List<Integer> sub_ans = new LinkedList<Integer>();
        int total = 0;
        dfs(root,sum,ans,sub_ans,total);
        return ans;
    }
    public void dfs(TreeNode root,int sum,List<List<Integer>> ans,List<Integer> sub_ans,int total){
        total+=root.val;
        if(total>sum) return;
        sub_ans.add(root.val);
        if(root.left==null&&root.right==null){
            if(total==sum){
                ans.add(sub_ans);
                sub_ans.clear();
                return;
            }else{
                sub_ans.clear();
                return;
            } 

        }
        if(root.left == null&&root.right!=null) {
            dfs(root.right, sum, ans, sub_ans, total);}
        else if(root.right ==null && root.left!=null) {dfs(root.left, sum, ans, sub_ans, total);}
        else{
            dfs(root.left, sum, ans, sub_ans, total);
            dfs(root.right, sum, ans, sub_ans, total);
        }
    }
}
// @lc code=end

