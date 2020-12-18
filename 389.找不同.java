import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        for (int i = 0; i < schar.length; i++) {
            if(schar[i]!=tchar[i]) return tchar[i];
        }
        return tchar[tchar.length-1];
    }
}
// @lc code=end

