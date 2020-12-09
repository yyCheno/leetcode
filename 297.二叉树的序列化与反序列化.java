import java.util.LinkedList;
import java.util.Queue;

;

/*
 * @lc app=leetcode.cn id=297 lang=java
 *
 * [297] 二叉树的序列化与反序列化
 */

// @lc code=start

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class Codec {

  
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String ans = "[";
        if (root==null) return "[]";
        Queue<TreeNode> tree = new LinkedList<TreeNode>();
        tree.offer(root);
        while(!tree.isEmpty()){
            TreeNode node = tree.poll();
            if(node == null){
                ans = ans +"null,";
                continue;
            }
            ans = ans+String.valueOf(node.val);
            ans = ans + ",";
            tree.offer(node.left);
            tree.offer(node.right);
        }
        String r_ans = new StringBuffer(ans).reverse().toString();
        int index = 0;
        for (char r : r_ans.toCharArray()) {
            if(Character.isDigit(r)){
                break;
            }
            index++;
        }
        ans = ans.substring(0, ans.length()-index);
        ans = ans + "]";
        return ans;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        data = data.substring(1,data.length()-1);
        String[] arr = data.split(",");
        int h = 1;
        int index = 1;
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        TreeNode tmp_node = root;
        Queue<TreeNode> t = new LinkedList<TreeNode>();
        t.offer(tmp_node);
        while(!t.isEmpty()){
              if (index==arr.length) break;
            int tmp = 1;
            TreeNode node = t.poll();
            if(node == null) continue;
            while(tmp<=2){
                  if (index==arr.length) break;
                if(arr[index].equals("null")){
                    index++;
                    tmp++;
                    continue;
                }
                if(tmp%2==0){
                    node.right = new TreeNode(Integer.parseInt(arr[index]));
                    index++;
                    tmp++;
                }else{
                    node.left = new TreeNode(Integer.parseInt(arr[index]));
                    index++;
                    tmp++;
                }
            }
            t.offer(node.left);
            t.offer(node.right);
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end

