package 丑数49;

import java.util.ArrayList;

public class Solution {
    public int GetUglyNumber_Solution(int index) {

        if(index<=0){
            return 0;
        }

        if(index==1){
            return 1;
        }
        if(index==2){
            return 2;

        }if(index==3){
            return 3;
        }
        ArrayList<Integer> ug = new ArrayList<>();
        ug.add(1);
        ug.add(2);
        ug.add(3);
        int t2=1;
        int t3=1;
        int t5=0;

        int count=3;

        while(count<index){

            ug.add(Math.min(Math.min(ug.get(t2)*2,ug.get(t3)*3),ug.get(t5)*5));
            count++;
            for(int i=t2;i<count;i++){

                if(ug.get(i)*2>ug.get(count-1)){
                    t2 = i;
                    break;
                }
            }
            for(int i=t3;i<count;i++){
                if(ug.get(i)*3>ug.get(count-1)){
                    t3 = i;
                    break;
                }
            }
            for(int i=t5;i<count;i++){
                if(ug.get(i)*5>ug.get(count-1)){
                    t5 = i;
                    break;
                }
            }
        }

        return ug.get(count-1);



    }

    public static void main(String[] args){
        System.out.println(new Solution().GetUglyNumber_Solution(5));
    }
}
