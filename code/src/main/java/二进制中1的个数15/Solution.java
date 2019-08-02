package 二进制中1的个数15;

public class Solution {
    public int NumberOf1(int n) {
        int sum = 0;

        while(n != 0){
            n = n&(n-1);
            sum++;
        }

        return sum;
    }
}
