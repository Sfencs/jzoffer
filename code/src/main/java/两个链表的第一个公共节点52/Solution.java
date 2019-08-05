package 两个链表的第一个公共节点52;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode node1 = pHead1;
        ListNode node2 = pHead2;

        while(node2!=node1){
            if(node2==null){
                node2=pHead1;
            }else {
                node2 = node2.next;
            }
            if(node1==null){
                node1=pHead2;
            }else {
                node1=node1.next;
            }
        }

        return node1;
    }
}
