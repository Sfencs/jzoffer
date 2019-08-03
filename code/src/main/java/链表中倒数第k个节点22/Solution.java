package 链表中倒数第k个节点22;

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }

        if(k==0){
            return null;
        }

//        try {
            ListNode second = head;
//            for(int i=1;i<k;i++){
//                second = second.next;
//            }
            while (second.next!=null && k>1){
                second = second.next;
                k--;
            }
            if(k>1){
                return null;
            }
            ListNode first = head;

            while(second.next!=null){

                second = second.next;
                first = first.next;
            }
            return first;
//        }catch (Exception e){
//            return null;
//        }



    }
}
