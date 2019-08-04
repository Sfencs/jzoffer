package 字符流中第一个不重复的字符41_2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution {
    //Insert one char from stringstream
    Map<Character,Integer> map = new HashMap<>();
    Queue<Character> queue = new LinkedList<>();
    public void Insert(char ch)
    {
        queue.offer(ch);
        if(map.containsKey(ch)){
            int i = map.get(ch);
            map.put(ch,++i);
        }else {
            map.put(ch,1);
        }
        while(!queue.isEmpty()&&map.containsKey(queue.peek())&&map.get(queue.peek())>1){
            queue.poll();
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if(queue.isEmpty()){
            return '#';
        }else {
            return queue.peek();
        }

    }
}