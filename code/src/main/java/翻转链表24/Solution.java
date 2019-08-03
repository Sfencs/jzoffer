package 翻转链表24;

public class Solution {
    public ListNode ReverseList(ListNode head) {

        if(head==null){
            return null;
        }
        ListNode head2 = head;
        while(head2.next!=null){
            head2 = head2.next;
        }
        digui(head);
        head.next=null;

        return head2;

    }

    public ListNode digui(ListNode head){

        if(head.next==null){
            return head;
        }
        ListNode a = digui(head.next);
            a.next = head;
        return head;
    }

    public static void main(String[] args){

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode node =  new Solution().ReverseList(head);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }

}
