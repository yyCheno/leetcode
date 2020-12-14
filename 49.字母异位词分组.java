import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new LinkedList<List<String>>();
        HashMap<String,List<String>> sub = new HashMap<String,List<String>>();
        for (String str : strs) {
            char[] arraystr = str.toCharArray();
            Arrays.sort(arraystr);
            String tmp_str = new String(arraystr);
            if(!sub.containsKey(tmp_str)){
                sub.put(tmp_str, new LinkedList<String>());
            }
            sub.get(tmp_str).add(str);
        }
        for (List<String> list : sub.values()) {
            ans.add(list);
        }
        return ans;
    }
}
// @lc code=end

