import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<Character,String>();
        String[] strings = s.split(" ");
        char[] wordPattern = pattern.toCharArray();
        for (int i = 0; i < wordPattern.length; i++) {
            if(!map.containsKey(wordPattern[i])){
                Collection<String> cStrings = map.values(); 
                if(cStrings.contains(strings[i])) return false;
                map.put(wordPattern[i], strings[i]);
            }else{
               
                if(!map.get(wordPattern[i]).equals(strings[i])) return false;
            }
        }
        return true;
    }
}
// @lc code=end

