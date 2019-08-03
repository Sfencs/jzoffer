package 对称的二叉树28;

public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null){
            return true;
        }
        return isduicheng(pRoot.left,pRoot.right);
    }

    public boolean isduicheng(TreeNode root1,TreeNode root2){

        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if (root1.val!=root2.val){
            return false;
        }
        return isduicheng(root1.left,root2.right)&&isduicheng(root1.right,root2.left);

    }
}
