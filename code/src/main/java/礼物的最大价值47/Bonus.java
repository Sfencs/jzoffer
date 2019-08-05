package 礼物的最大价值47;

import java.util.*;

public class Bonus {
    public int getMost(int[][] board) {
        // write code here

        if(board.length==0||board[0].length==0){
            return 0;
        }

        int rows = board.length;
        int cols = board[0].length;

        int dp[][] = new int[rows][cols];
        dp[rows-1][cols-1] = board[rows-1][cols-1];
        for(int i=cols-2;i>=0;i--){
            dp[rows-1][i] = board[rows-1][i]+dp[rows-1][i+1];
        }
        for(int i=rows-2;i>=0;i--){
            dp[i][cols-1] = board[i][cols-1]+dp[i+1][cols-1];
        }

        for(int i=rows-2;i>=0;i--){
            for(int j=cols-2;j>=0;j--){
                dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j])+board[i][j];
            }
        }

        return dp[0][0];

    }
}