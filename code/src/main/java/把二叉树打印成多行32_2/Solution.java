package 把二叉树打印成多行32_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot==null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(pRoot);
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
            result.add(rst);
        }

        return result;


    }

}