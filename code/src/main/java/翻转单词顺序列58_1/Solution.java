package 翻转单词顺序列58_1;

public class Solution {
    public String ReverseSentence(String str) {
        char[] s = str.toCharArray();
        int i=0;int j=0;
        while (j<str.length()){
            if(s[j]==' '){
                reverse(s,i,j-1);
                j++;
                i=j;
            }else if((j+1)==str.length()) {
                reverse(s,i,j);
                j++;
                i=j;
            }else {
                j++;
            }
        }

        reverse(s,0,str.length()-1);
        return new String(s);
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

    public static void main(String[] args){
        System.out.println(new Solution().ReverseSentence("student. a am I"));
    }
}