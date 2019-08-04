package 序列化二叉树37;

public class Solution {

    private int index;
    String Serialize(TreeNode root) {
        if(root==null){
            return "#";
        }

        return root.val+" "+Serialize(root.left)+" "+Serialize(root.right);
    }
    TreeNode Deserialize(String str) {
        if(str.length()==0){
            return null;
        }
        if(str.equals("")){
            return null;
        }
        index=0;
        String[]strlist = str.split(" ");

        return de(strlist);

    }

    public TreeNode de(String[] strlist){
        if(index>=strlist.length){
            return null;
        }
        if(strlist[index].equals("#")){
            index++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(strlist[index]));
        index++;
        node.left = de(strlist);
        node.right = de(strlist);
        return node;
    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        String a = new Solution().Serialize(node);
        System.out.println(a);
    }


}
