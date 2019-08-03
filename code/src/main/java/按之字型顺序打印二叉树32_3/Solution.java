package 按之字型顺序打印二叉树32_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot==null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(pRoot);
        boolean flag=true;
        while(!queue.isEmpty()){
            ArrayList<TreeNode> array = new ArrayList<TreeNode>();
            while(!queue.isEmpty()) {
                TreeNode node = queue.poll();
                array.add(node);
            }
            ArrayList<Integer> rst = new ArrayList<Integer>();
            for (TreeNode i:array
            ) {
                rst.add(i.val);
                if(i.left!=null){
                    queue.offer(i.left);
                }
                if(i.right!=null){
                    queue.offer(i.right);
                }
            }
            if(flag){
                flag=false;
                result.add(rst);
            }else {
                flag=true;
                Collections.reverse(rst);
                result.add(rst);
            }

        }

        return result;
    }

}
