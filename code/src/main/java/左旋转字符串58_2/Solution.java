package 左旋转字符串58_2;

public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0){
            return "";
        }

        n = n%str.length();
        char[]c = str.toCharArray();
        reverse(c,0,n-1);
        reverse(c,n,str.length()-1);
        reverse(c,0,str.length()-1);
        return new String(c);
    }
    public void reverse(char[] c,int l,int h){
        while(l<h){
            char t = c[l];
            c[l]=c[h];
            c[h] = t;
            l++;
            h--;
        }
    }
}