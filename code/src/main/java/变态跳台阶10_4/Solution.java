package 变态跳台阶10_4;

public class Solution {
    public int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }
}