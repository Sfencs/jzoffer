package 和为s的两个数57_1;



import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if(array==null||array.length==0){
            return new ArrayList<Integer>();
        }
        if(array.length<2){
            return new ArrayList<Integer>();
        }

        int i=0;
        int j=array.length-1;

        Integer result1 = null;
        Integer result2 = null;


        while(i<j){
            if((array[i]+array[j])==sum){
                if(result1==null){
                    result1=array[i];
                    result2=array[j];
                    i++;
                }else {
                    if(result1*result2>array[i]*array[j]){
                        result1=array[i];
                        result2=array[j];
                    }
                    i++;
                }

            }else if((array[i]+array[j])<sum){
                i++;
            }else {
                j--;
            }
        }

        if(result1==null){
            return new ArrayList<Integer>();
        }else {
            ArrayList<Integer> result=new ArrayList<Integer>();
            result.add(result1);
            result.add(result2);
            return result;
        }


    }
}
