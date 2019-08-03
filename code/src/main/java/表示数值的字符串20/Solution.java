package 表示数值的字符串20;

public class Solution {
    public boolean isNumeric(char[] str) {

        if(str==null || str.length==0){
            return false;
        }

        return new String(str).matches("[+-]?\\d*(\\.\\d*)?([eE][+-]?\\d+)?");
    }
}