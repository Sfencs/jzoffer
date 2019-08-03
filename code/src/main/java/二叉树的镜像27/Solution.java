package 二叉树的镜像27;



public class Solution {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        Mirror(right);
        Mirror(left);
    }
}
