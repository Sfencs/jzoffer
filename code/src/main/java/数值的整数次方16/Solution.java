package 数值的整数次方16;

public class Solution {
    public double Power(double base, int exponent) {
        if(exponent==0){
            return 1;
        }
        if(exponent==1){
            return base;
        }
        if(exponent==-1){
            return 1/base;
        }

        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }
        if(isNegative){
            return 1/(Power(base,exponent/2)*Power(base,exponent-exponent/2));
        }else {
            return Power(base,exponent/2)*Power(base,exponent-exponent/2);
        }

    }

    public static void main(String[] args){

        System.out.println(new Solution().Power(2,-3));
    }
}