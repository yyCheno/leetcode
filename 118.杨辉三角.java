import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans  = new ArrayList<List<Integer>>();
        List<Integer> sub =  new ArrayList<Integer>();
        if(numRows == 1){
            sub.add(1);
            ans.add(sub);
            return ans;
        }
        if(numRows==2){
            sub.add(1);
            ans.add(new ArrayList<Integer>(sub));
            sub.clear();
            sub.add(1);
            sub.add(1);
            ans.add(sub);
            return ans;
        }
        sub.add(1);
            ans.add(new ArrayList<Integer>(sub));
            sub.clear();
            sub.add(1);
            sub.add(1);
            ans.add(new ArrayList<Integer>(sub));
            sub.clear();
        for(int i = 2;i<numRows;i++){
            sub.add(1);
            for(int j = 1;j<i;j++){
                sub.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            sub.add(1);
            ans.add(new ArrayList<Integer>(sub));
            sub.clear();
        }
        return ans;
    }
}
// @lc code=end

