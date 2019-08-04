package 连续子数组的最大和42;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {

        if(array==null||array.length==0){
            return 0;
        }



        int []media = new int[array.length];


        media[0] = array[0];


        int max = media[0];


        for(int i=1;i<array.length;i++){
            media[i] = array[i];
            for(int j=0;j<i;j++){
                int t = media[j];
                for(int k=j+1;k<=i;k++){
                    t+=array[k];
                }

                media[i] = Math.max(media[i],t);

            }
            if(media[i]>max){
                max = media[i];
            }

        }

        return max;
    }
}
