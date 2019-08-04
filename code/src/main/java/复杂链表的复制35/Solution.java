package 复杂链表的复制35;

public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }

        RandomListNode node = pHead;


        while(node!=null){
            RandomListNode a = new RandomListNode(node.label);
            RandomListNode next = node.next;
            node.next = a;
            a.next = next;
            node = next;
        }

        RandomListNode node2 = pHead;
        while (node2!=null){
            RandomListNode random = node2.random;
            if(random!=null){
                node2.next.random = random.next;
            }
            node2 = node2.next.next;
        }

        RandomListNode node3 = pHead;
        RandomListNode result = new RandomListNode(-1);
        RandomListNode resulthead = result;
        while (node3!=null){

            RandomListNode n = node3.next;
            RandomListNode nn = n.next;
            node3.next = nn;
            result.next = n;
            result = n;
            node3 = nn;
        }

        return resulthead.next;



    }
}
