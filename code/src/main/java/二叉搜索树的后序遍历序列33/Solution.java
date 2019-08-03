package 二叉搜索树的后序遍历序列33;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {

        if(sequence==null){
            return false;
        }
        int length = sequence.length;
        if(length==0){
            return false;
        }
        return verify(sequence,0,length-1);
    }

    public boolean verify(int[] sequence,int l,int h){
        if(h-l<=1||l<0||h>=sequence.length){
            return true;
        }
        int root = sequence[h];
        int flag=-1;
        for(int i=h-1;i>=l;i--){
            if(sequence[i]<sequence[h]){
                flag=i;
                break;
            }
        }
        boolean flag2 = true;
        for(int i=l;i<=flag;i++){
            if(sequence[i]>sequence[h]){
                flag2=false;
                break;
            }
        }

        if(!flag2){
            return false;
        }else {
            return verify(sequence,l,flag)&&verify(sequence,flag+1,h-1);
        }
    }
}
