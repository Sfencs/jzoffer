package 合并两个排序的链表25;

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {

        ListNode head = new ListNode(-1);
        ListNode node = head;

        while(list1!=null || list2!=null){

            if(list1==null){
                node.next = list2;
                node = node.next;
                list2 = list2.next;
            }
            else if(list2==null){
                node.next = list1;
                node = node.next;
                list1 = list1.next;
            }else {

                if(list1.val<list2.val){
                    node.next = list1;
                    node = node.next;
                    list1 = list1.next;
                }else {
                    node.next = list2;
                    node = node.next;
                    list2 = list2.next;
                }

            }


        }
        return head.next;


    }
}
