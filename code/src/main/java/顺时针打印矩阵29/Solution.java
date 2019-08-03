package 顺时针打印矩阵29;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix==null||matrix[0]==null){
            return new ArrayList<Integer>();
        }
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][]marked = new boolean[row][col];
        int i=0;int j=0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        int flag = 0;
        for(int k=0;k<row*col;k++){
            result.add(matrix[i][j]);
            marked[i][j]=true;


            if(flag==0){
                j++;
                if(j>col-1||marked[i][j]==true){
                    flag=1;
                    j--;
                    i++;
                }

            }
            else if(flag==1){
                i++;
                if(i>row-1||marked[i][j]==true){
                    flag=2;
                    i--;
                    j--;
                }

            }
            else if(flag==2){
                j--;
                if(j<0||marked[i][j]==true){
                    flag=3;
                    j++;
                    i--;
                }

            }
            else if(flag==3){
                i--;
                if(i<0||marked[i][j]==true){
                    flag=0;
                    i++;
                    j++;
                }

            }
        }

        return result;


    }
}
