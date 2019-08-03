package 二叉树中和为某一值的路径34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;


public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null){
            return result ;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        find(result,list,root,target);
        //ArrayList<ArrayList<Integer>> a =  (ArrayList)result.stream().sorted((ArrayList<Integer> x,ArrayList<Integer> y)->y.size()-x.size()).collect(Collectors.toList());
        return result;

    }
    public void find(ArrayList<ArrayList<Integer>> array,ArrayList<Integer> list,TreeNode root,int target){

        if(root.left==null&&root.right==null){
            list.add(root.val);
            int sum = list.stream().mapToInt(Integer::intValue).sum();
            if(sum==target){
                array.add(new ArrayList<>(list));
            }
            list.remove(list.size()-1);
            return;
        }

        list.add(root.val);
//        ArrayList<Integer> newList1 = new ArrayList<>(list);
//        ArrayList<Integer> newList2 = new ArrayList<>(list);
//        Collections.copy(newList1,list);
//        Collections.copy(newList2,list);
        if(root.left!=null){
            find(array, list,root.left,target);
        }
        if(root.right!=null){
            find(array,list,root.right,target);
        }

        list.remove(list.size()-1);

    }

    public static void main(String[] args){

            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(5);
            root.right = new TreeNode(12);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(7);
            ArrayList<ArrayList<Integer>> a = new Solution().FindPath(root,22);

        for (ArrayList<Integer> i:a
             ) {
            for (Integer j:i
                 ) {
                System.out.println(j);
            }
        }
    }
}