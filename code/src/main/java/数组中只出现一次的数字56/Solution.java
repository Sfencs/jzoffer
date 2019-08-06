package 数组中只出现一次的数字56;

public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int a=0;
        for (int i:array
             ) {
            a ^= i;
        }
        int x=0;
        int count=-1;
        while (x==0){
            x = (a&1);
            count++;
            a>>=1;
        }

        num1[0]=0;
        num2[0]=0;
        for (int i:array
             ) {
            int j=i;
            j >>= count;
            if(0==(j&1)){
                num1[0] ^= i;
            }else {
                num2[0] ^= i;
            }
        }
    }

    public static void main(String[] args){
        int [] array={2,4,3,6,3,2,5,5};
        int[]a = new int[1];
        int[]b = new int[1];
        new Solution().FindNumsAppearOnce(array,a,b);
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}
