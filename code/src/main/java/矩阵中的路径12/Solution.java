package 矩阵中的路径12;

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        char [][]array = new char[rows][cols];
        boolean [][]marked = new boolean[rows][cols];

        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                array[i][j] = matrix[i*cols+j];
            }
        }

        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){

                    if (backtracking(array, str, marked, 0, i, j))
                        return true;

            }
        }
        return false;


    }

    public static boolean backtracking(char[][] array, char[] str,
                                       boolean[][] marked, int pathLen, int i, int j){
        if (str.length == pathLen){
            return true;
        }

        if (i < 0 || i >= array.length || j < 0 || j >= array[0].length
                || array[i][j] != str[pathLen] || marked[i][j]) {
            return false;
        }

        marked[i][j] = true;

        if(backtracking(array,str,marked,pathLen+1,i+1,j)){
            return true;
        }else if (backtracking(array,str,marked,pathLen+1,i-1,j)){
            return true;
        }else if(backtracking(array,str,marked,pathLen+1,i,j+1)){
            return true;
        }else if (backtracking(array,str,marked,pathLen+1,i,j-1)){
            return true;
        }else {
            marked[i][j] = false;
            return false;
        }



    }


}