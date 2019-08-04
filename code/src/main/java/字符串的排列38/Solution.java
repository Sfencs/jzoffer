package 字符串的排列38;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    private Set<String> set = new TreeSet<>();
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if(str==null){
            return result;
        }
        if(str.length()==0){

            return result;
        }

        result = digui(str);
        set.addAll(result);
        result = new ArrayList<>(set);
        return result;

    }

    public ArrayList<String> digui(String str){
        ArrayList<String> result = new ArrayList<>();
        if(str.length()==1){
            result.add(str);
            return result;
        }

        ArrayList<String> r = digui(str.substring(1));

        for (String ss:r
             ) {
            StringBuffer s =new StringBuffer(str.charAt(0)+ss);
            result.add(s.toString());
            for (int i=1;i<s.length();i++){
                StringBuffer s2 =new StringBuffer(s);

                s2.setCharAt(0,s.charAt(i));
                s2.setCharAt(i,s.charAt(0));
                result.add(s2.toString());
            }
        }

        return result;


    }

    public static void main(String[] args){
        ArrayList<String> r = new Solution().Permutation("abc");
        for (String s:r
             ) {
            System.out.println(s);
        }
    }
}

