package 扑克牌顺子61;

import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length<5){
            return false;
        }

        int[]pk = new int[14];
        Arrays.fill(pk,0);

        for (int i:numbers
             ) {
            pk[i]++;
        }

        Arrays.sort(numbers);
        int low=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                low=numbers[i];
                break;
            }
        }


        int high = numbers[numbers.length-1];
        int count=0;
        while(count<numbers.length){
            if(low>13||pk[low]<=0){
                pk[0]--;
            }
            low++;
            count++;
        }

        if(pk[0]<0){
            return false;
        }else {
            return true;
        }
    }
}
