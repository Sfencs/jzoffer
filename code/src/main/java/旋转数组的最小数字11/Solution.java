package 旋转数组的最小数字11;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {

        int length = array.length;
        if(length==0){

            return 0;
        }
        if(length==1){

            return array[0];
        }

        int l = 0;
        int h = length-1;
        int m = (h-1)/2;

        while(l<h){
            if(array[l]==array[h]&&array[l]==array[m]){
                for(int i=l;i<h;i++){
                    if(array[l]>array[l+1]){
                        return array[l+1];
                    }
                }
                return array[l];

            }

            if(array[m]<=array[h]){

                h = m;
                m = (h-1+l)/2;
            }else {
                l = m+1;
                m = (h-1+l)/2;
            }

        }
        return array[h];

    }

    public static void main(String[] args){

        int a[] = {3,4,5,1,2};
        int result = new Solution().minNumberInRotateArray(a);
        System.out.println(result);
    }
}
