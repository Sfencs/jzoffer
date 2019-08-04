package 最小的k个数40;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        if(input==null||k<=0||k>input.length){
            return new ArrayList<>();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i:input
             ) {
            maxHeap.add(i);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return new ArrayList<Integer>(maxHeap);

    }
}
