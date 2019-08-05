package 把数字翻译成字符串46;

class Solution {

    private int count=0;
//    public int numDecodings(String s) {
//        digui(s);
//        return count;
//    }
//    public void digui(String s){
//        if(s.length()==1){
//            if(Integer.valueOf(s)!=0){
//                count++;
//            }
//            return;
//        }
//        if(s.length()==2){
//
//            if(Integer.valueOf(s.substring(0,1))!=0){
//                if(Integer.valueOf(s)<=26){
//                    count++;
//                }
//                digui(s.charAt(1)+"");
//            }
//
//            return;
//
//        }
//
//        String a=s.substring(0,1);
//        String b = s.substring(0,2);
//        if(Integer.valueOf(a)!=0){
//            digui(s.substring(1));
//            if(Integer.valueOf(b)<=26){
//                digui(s.substring(2));
//            }
//        }
//
//    }

    public int numDecodings(String s) {
        if(s==null||s.length()==0){
            return 0;
        }

        if(s.charAt(0)=='0'){
            return 0;
        }
        if(s.length()==1){
            if(Integer.valueOf(s)!=0){
                return 1;
            }else {
                return 0;
            }
        }
//        if(s.length()==2){
//            if(Integer.valueOf(s.substring(0,1))!=0){
//                if(Integer.valueOf(s.substring(1))==0){
//                    if(Integer.valueOf(s)<=26){
//                        return 1;
//                    }else {
//                        return 0;
//                    }
//                }else {
//                    if(Integer.valueOf(s)<=26){
//                        return 2;
//                    }else {
//                        return 1;
//                    }
//                }
//
//            }else {
//                return 0;
//            }
//        }

        int dp[] = new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=s.length();i++){
            if(s.charAt(i-1)!='0'){
                dp[i]+=dp[i-1];
            }
            if(s.charAt(i-2)!='0'){
                if(Integer.valueOf(s.substring(i-2,i))<=26){
                    dp[i]+=dp[i-2];
                }
            }
        }

        return dp[s.length()];




    }
    public static void main(String[] args){
        System.out.println(new  Solution().numDecodings("11"));
    }
}
