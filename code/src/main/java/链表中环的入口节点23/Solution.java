package 链表中环的入口节点23;

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null){
            return null;
        }

        ListNode slow = pHead;
        ListNode fast = pHead;

        while(fast.next!=null && fast.next.next!=null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }

        if(fast.next==null || fast.next.next==null){
            return null;
        }

        ListNode newNode = pHead;

        while(pHead!=slow){
            pHead = pHead.next;
            slow = slow.next;
        }

        return slow;
    }
}
