import javax.lang.model.util.ElementScanner6;

/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int F_num = 0;
        int T_num = 0;
        for (int i : bills) {
            switch (i) {
                case 5:
                F_num++;
                    break;
                case 10:
                if(F_num==0) return false;
                F_num--;
                T_num++;
                    break;

                case 20:
                if(F_num==0) return false;
                if(T_num==0){
                    if(F_num<3){
                        return false;
                    }else{
                        F_num = F_num-3;
                    }
                }else{
                   T_num--;
                   F_num--;
                }
                    break;
                default:
                    break;
            }
        }
        return true;
    }
}
// @lc code=end

