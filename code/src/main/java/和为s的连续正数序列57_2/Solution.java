package 和为s的连续正数序列57_2;

import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        if(sum<=2){
            return new ArrayList<>();
        }

        int start=1;
        int end=2;
        int nowsum =3;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        while(start<=(sum/2+1)&&end<=(sum/2+1)&&start<end){
            if(nowsum<sum){
                end++;
                nowsum+=end;
            }else if(nowsum>sum){
                nowsum-=start;
                start++;

            }else {
                ArrayList<Integer> r =  new ArrayList<>();
                for(int i=start;i<=end;i++){
                    r.add(i);
                }
                end++;
                nowsum+=end;
                result.add(r);
            }
        }

        return result;

    }

    public static void main(String[] args){
        new Solution().FindContinuousSequence(4);
    }
}
