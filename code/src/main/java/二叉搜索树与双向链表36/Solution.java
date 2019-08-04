package 二叉搜索树与双向链表36;

import java.util.ArrayList;

public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        ArrayList<TreeNode> result = new ArrayList<>();
        if(pRootOfTree==null){
            return null;
        }
        pre(result,pRootOfTree);

        for(int i=0;i<result.size();i++){
            if(result.size()==1){

            }
            else if(i==0&&i+1<result.size()){
                result.get(i).right = result.get(i+1);
            }else if(i==result.size()-1){
                result.get(i).left = result.get(i-1);
            }else {
                result.get(i).left = result.get(i-1);
                result.get(i).right = result.get(i+1);
            }
        }
        return result.get(0);

    }

    public void pre(ArrayList<TreeNode> array,TreeNode root){

        if(root==null){
            return;
        }
        pre(array,root.left);
        array.add(root);
        pre(array,root.right);
    }
}
