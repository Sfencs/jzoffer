package 二维数组中的查找4;

public class Solution {
    public boolean Find(int target, int [][] array) {

        if(array == null ||array.length == 0 || array[0].length == 0){
            return false;
        }

        int rowLength = array.length;
        int colLength = array[0].length;
        int r = 0;
        int c = colLength - 1;
        while (r <= rowLength-1 && c >= 0){

            if(target == array[r][c]){
                return true;
            }else if(target > array[r][c]){
                r++;
            }else if(target < array[r][c]){
                c--;
            }

        }
        return false;

    }
}