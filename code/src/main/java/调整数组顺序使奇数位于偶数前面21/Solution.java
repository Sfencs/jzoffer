package 调整数组顺序使奇数位于偶数前面21;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void reOrderArray(int [] array) {
        int length = array.length;
        List<Integer> newarray = new ArrayList<Integer>();

        for(int i=0;i<length;i++){
            if(array[i]%2==1){
                newarray.add(array[i]);
            }
        }
        for(int i=0;i<length;i++){
            if(array[i]%2==0){
                newarray.add(array[i]);
            }
        }
        int index = 0;
        for (Integer i:newarray
             ) {
            array[index] = i;
            index++;
        }
    }
}
