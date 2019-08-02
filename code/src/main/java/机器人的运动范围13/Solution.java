package 机器人的运动范围13;

public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][]marked = new boolean[rows][cols];
        huishuo(threshold,rows,cols,0,0,marked);
        int sum = 0;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(marked[i][j]){
                    sum++;
                }
            }
        }
        return sum;

    }

    public void huishuo(int threshold,int rows,int cols,int i,int j,boolean[][] marked){
        if(i<0 || i>rows-1 || j<0 || j>cols-1 || marked[i][j] == true || getsum(i,j)>threshold){
            return;
        }

        marked[i][j]=true;

        huishuo(threshold,rows,cols,i+1,j,marked);
        huishuo(threshold,rows,cols,i-1,j,marked);
        huishuo(threshold,rows,cols,i,j+1,marked);
        huishuo(threshold,rows,cols,i,j-1,marked);
        return;
    }

    public static int getsum(int i,int j){
        int sum = 0;

        while(i>0){
            sum += i%10;
            i = i/10;
        }

        while (j>0){
            sum += j%10;
            j = j/10;
        }
        return sum;
    }
}