package 斐波那契数列10_1;

public class Solution {
    public int Fibonacci(int n) {

        if(n<=1){
            return n;
        }else {
            int pre1 = 0;
            int pre2 = 1;
            int result = 0;
            for(int i=2;i<=n;i++){
                result = pre1+pre2;
                pre1 = pre2;
                pre2 = result;
            }
            return result;
        }
    }
}
