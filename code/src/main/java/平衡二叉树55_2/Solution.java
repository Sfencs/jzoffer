package 平衡二叉树55_2;

public class Solution {
    boolean isBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        digui(root);
        return isBalanced;
    }

    public int digui(TreeNode root){
        if(root==null||!isBalanced){
            return 0;
        }

        int left = digui(root.left);
        int right = digui(root.right);

        if(Math.abs(left-right)>1){
            isBalanced=false;
        }

        return Math.max(left,right)+1;
    }
}