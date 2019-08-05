package 最长不含重复字符的子字符串48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestSubStringWithoutDuplication(String str) {
        if(str==null||str.length()==0){
            return 0;
        }
        Character[] c = new Character[str.length()];
        Map<Character,Integer> map = new HashMap<>();
        Integer marked=null;
        int maxlength = 0;

        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),i);
                c[i]=str.charAt(i);
            }else {
                int l=0;
                if(marked==null){
                    marked=0;
                    for(int m=marked;m<c.length&&c[m]!=null;m++){
                        l++;
                    }
                }else {
                    for (int m = marked + 1; m < c.length && c[m] != null; m++) {
                        l++;
                    }
                }
                maxlength = Math.max(maxlength,l);
                Integer x = map.get(str.charAt(i));
                for(int j=marked;j<=x;j++){
                    map.remove(c[j]);
                    c[j]=null;
                }
                c[i]=str.charAt(i);
                marked=x;
                map.put(str.charAt(i),i);


            }
        }
        int y=0;
        if(marked==null){
            marked=0;
            for(int m=marked;m<c.length&&c[m]!=null;m++){
                y++;
            }
        }else {
//            System.out.println(c.length);
//            System.out.println(c[marked+1]);
//            System.out.println(marked+1);
            for (int m = marked + 1; m < c.length && c[m] != null; m++) {
                y++;
            }
        }
        maxlength = Math.max(maxlength,y);

        return maxlength;
    }

    public static void main(String[] args){
        int a = new Solution().longestSubStringWithoutDuplication("sasdssgdas");
        System.out.println(a);
    }
}
