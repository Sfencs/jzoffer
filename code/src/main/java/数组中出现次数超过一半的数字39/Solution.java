package 数组中出现次数超过一半的数字39;



public class Solution {

    class Record{
        public int num;//数字
        public int n;//次数

    }

    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null){
            return 0;
        }
        Record r = new Record();
        r.n=0;

        for(int i=0;i<array.length;i++){

            if(i==0){
                r.num=array[i];
                r.n++;
                continue;
            }
            if(r.n==0){
                r.n=1;
                r.num=array[i];
            }
            else if(array[i]==r.num){
                r.n++;

            }else {
                r.n--;
            }
        }
        int count=0;
        for (int i:array
             ) {
            if (i == r.num) {
                count++;
            }
        }
        if(count*2>array.length){
            return r.num;
        }else {
            return 0;
        }

    }

    public static void main(String[] args){
        int[]a = {1,2,2,2,2,2,2,4,2};
        int r = new Solution().MoreThanHalfNum_Solution(a);
        System.out.println(r);
    }
}
