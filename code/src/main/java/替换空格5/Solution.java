package 替换空格5;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        int length = str.length();
        for(int i = 0;i<length;i++){
            if(str.charAt(i)==' ') {
                str.append("  ");
            }
        }


        int newLength = str.length();
        int p1 = length-1;
        int p2 = newLength-1;

        while(p1>=0){
            if(str.charAt(p1)!=' '){
                str.setCharAt(p2--,str.charAt(p1));
            }else{
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
            }
            p1--;
        }

        return str.toString();
    }
}
