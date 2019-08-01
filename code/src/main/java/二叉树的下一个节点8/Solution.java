package 二叉树的下一个节点8;


public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode){

        if(pNode.right!=null){

            TreeLinkNode node = pNode.right;
            while (node.left != null)
                node = node.left;
            return node;
        }else {

            while(pNode.next!=null){
                TreeLinkNode p = pNode.next;
                if(p.left==pNode){
                    return p;
                }else {
                    pNode = p;
                }
            }
        }
        return null;

    }


}