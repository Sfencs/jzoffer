package 重建二叉树7;



public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre.length==0 || in.length ==0 || pre==null || in==null){
            return null;
        }

        TreeNode root = makeTree(pre,in);
        return root;

    }

    public static TreeNode makeTree(int [] pre,int[] in){

        if(pre.length==0){
            return null;
        }

        TreeNode root = new TreeNode(pre[0]);

        int i = 0;
        while(i<in.length){
            if(in[i]==pre[0]){
                break;
            }
            i++;
        }

        int[]leftPre=new int[i];
        int[]leftIn = new int[i];
        int []rightPre = new int[pre.length-i-1];
        int []rightIn = new int[pre.length-i-1];
        int k = 0;
        for(int j=0;j<pre.length;j++){
            if(j<i){
                leftPre[j]=pre[j+1];
                leftIn[j] = in[j];
            }

            if(j>i){

                rightPre[k] = pre[j];
                rightIn[k] = in[j];
                k++;
            }

        }
        root.left = makeTree(leftPre,leftIn);
        root.right = makeTree(rightPre,rightIn);
        return root;
    }
}
