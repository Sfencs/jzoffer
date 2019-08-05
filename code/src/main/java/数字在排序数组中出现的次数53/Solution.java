package 数字在排序数组中出现的次数53;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {

        if(array==null||array.length==0){
            return 0;
        }

        int a = findfirst(array,0,array.length-1,k);
        int b = findlast(array,0,array.length-1,k);
        System.out.println(a);
        System.out.println(b);
        if(a==-1){
            return 0;
        }else {
            return b-a+1;

        }

    }


    public int findfirst(int[]array,int l,int h,int k){

        if(l>h){
            return 0;
        }


        int m=(l+h)/2;
        if(m>=0&&m<array.length&&array[m]==k){
            if(m-1<0||array[m-1]<k){
                return m;
            }else {
                return findfirst(array,l,m-1,k);
            }
        }else if(array[m]>k){
            return findfirst(array,l,m-1,k);
        }else {
            return findfirst(array,m+1,h,k);
        }

    }

    public int findlast(int[]array,int l,int h,int k){

        if(l>h){
            return -1;
        }


        int m=(l+h)/2;
        if(m>=0&&m<array.length&&array[m]==k){
            if(m+1>=array.length||array[m+1]>k){
                return m;
            }else {
                return findlast(array,m+1,h,k);
            }
        }else if(array[m]>k){
            return findlast(array,l,m-1,k);
        }else {
            return findlast(array,m+1,h,k);
        }

    }

    public static void main(String[] args){
        int[] a = {1,3,3,3,4,5};
        System.out.println(new Solution().GetNumberOfK(a,6));
    }
}