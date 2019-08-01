package 从尾到头打印链表6;


import java.util.ArrayList;



public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
       ArrayList<Integer> result = new ArrayList<Integer>();
       prt(result,listNode);
       return result;

    }

    public static void prt(ArrayList<Integer> a,ListNode listNode){
        if(listNode==null){
            return;
        }
        if(listNode.next==null){
            a.add(listNode.val);
            return;
        }else {
            prt(a,listNode.next);
            a.add(listNode.val);
        }

    }
}
