package 剪绳子14;

class Solution {
    public int integerBreak(int n) {
        int []max = new int[n+1];
        max[1] = 1;
        for(int i = 2;i<=n;i++){
            for(int j = 1;j<i;j++){

                max[i] = Math.max(max[i],Math.max((i-j)*j,(i-j)*max[j]));
            }
        }
        return max[n];
    }
}
