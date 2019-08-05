package 二叉查找树的第k个节点54;

import java.util.ArrayList;

public class Solution {
    ArrayList<TreeNode> list=new ArrayList<>();
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null||k==0){
            return null;
        }
        digui(pRoot,k);
        if(list.size()<k){
            return null;
        }else {
            return list.get(k-1);
        }

    }

    public void digui(TreeNode root,int k){
        if(list.size()>k){
            return;
        }
        if(root==null){
            return;
        }

        digui(root.left,k);
        list.add(root);
        digui(root.right,k);

    }


}
