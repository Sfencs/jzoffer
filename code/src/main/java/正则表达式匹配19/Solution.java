package 正则表达式匹配19;

public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str==null || pattern==null){
            return false;
        }

        return toMatch(str,pattern,0,0);

    }
    public boolean toMatch(char[] str,char[] pattern,int strIndex,int patternIndex){

        int strLength = str.length;
        int patternLength = pattern.length;

        if(strIndex==strLength && patternLength==patternIndex){
            return true;
        }

        if((strIndex<strLength && patternIndex==patternLength)){
            return false;
        }
        if(strIndex==strLength){
            if(patternIndex+1<patternLength && pattern[patternIndex+1]=='*'&&patternIndex+2==patternLength){
                return true;
            }else {
                return false;
            }

        }

        if(patternIndex+1<patternLength && pattern[patternIndex+1]=='*'){
            if((str[strIndex]==pattern[patternIndex]&&strIndex<strLength )|| (pattern[patternIndex]=='.'&& strIndex<strLength )){

                return toMatch(str,pattern,strIndex+1,patternIndex) ||
                        toMatch(str,pattern,strIndex+1,patternIndex+2) ||
                        toMatch(str,pattern,strIndex,patternIndex+2);
            } else {
              return toMatch(str,pattern,strIndex,patternIndex+2);
            }
        }else {
            if(str[strIndex]==pattern[patternIndex] || (pattern[patternIndex]=='.'&&strIndex<strLength)){
                return toMatch(str,pattern,strIndex+1,patternIndex+1);
            }else {
                return false;
            }
        }

    }
}
