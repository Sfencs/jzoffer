package 从1到n整数中1出现的次数43;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {

        int count=0;
        int base=1;
        int round=n;
        while(round>0)
        {
            int weight = round%10;
            round/=10;
            count += round*base;
            if(weight==1)
            {
                count+=(n%base)+1;
            }
            else if(weight>1)
            {
                count+=base;
            }
            base*=10;
        }


        return count;
    }

    public static void main(String[] args){
        System.out.println(new Solution().NumberOf1Between1AndN_Solution(111));
    }
}