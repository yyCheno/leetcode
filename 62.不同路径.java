/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    private int conut = 0;
    public int uniquePaths(int m, int n) {
        if(m==1&&n==1) return 1;
       int x = 1;
       int y = 1;
        if(x+1<=m) down(x+1, y,m,n);
        if(y+1<=n) right(x, y+1,m,n);
        return conut;
    }
    void down(int x,int y,int m,int n){
        if(x==m&&y==n) {
            conut++;
            return;
        }
        if(x+1<=m) down(x+1, y,m,n);
        if(y+1<=n) right(x, y+1,m,n);
    }
    void right(int x,int y,int m,int n){
        if(x==m&&y==n) {
            conut++;
            return;
        }
        if(x+1<=m) down(x+1, y,m,n);
        if(y+1<=n) right(x, y+1,m,n);
    }
}
// @lc code=end

