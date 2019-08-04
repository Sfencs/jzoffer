package 数据流中的中位数40_1;

import java.util.PriorityQueue;

public class Solution {

    private PriorityQueue<Integer> maxheap = new PriorityQueue<>();
    private PriorityQueue<Integer> minheap = new PriorityQueue<>((x,y)->y-x);
    private int count = 0;
    public void Insert(Integer num) {
        if(count%2==0){
            maxheap.add(num);
            minheap.add(maxheap.poll());


        }else {
            minheap.add(num);
            maxheap.add(minheap.poll());
        }
        count++;
    }

    public Double GetMedian() {
        if(count%2==0){
            return (minheap.peek()+maxheap.peek())/2.0;
        }else {
            return (double)minheap.peek();
        }
    }


}