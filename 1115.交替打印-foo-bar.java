/*
 * @lc app=leetcode.cn id=1115 lang=java
 *
 * [1115] 交替打印FooBar
 */

// @lc code=start
class FooBar {
    private int n;
    final Object object= new Object();
    private boolean flag = true;
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            if(flag){
             printFoo.run();
             object.notifyAll();
            }else{
            object.wait();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            object.notifyAll();
            }
          
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            object.wait();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            object.notifyAll();
        }
    }
}
// @lc code=end

