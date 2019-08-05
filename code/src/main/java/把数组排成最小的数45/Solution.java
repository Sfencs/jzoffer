package 把数组排成最小的数45;

import java.util.ArrayList;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if(numbers==null){
            return null;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i:numbers
             ) {
            list.add(i);
        }
        list.sort((x,y)->(x.toString() + y.toString()).compareTo(y.toString() + x.toString()));

        String result="";

        for (Integer i:list
             ) {
            result+=i.toString();
        }
        return result;
    }
}
