package LeetCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Ques3434 {
    public int maxFrequency(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) +1 );
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getKey()!=k){
                maxHeap.offer(entry.getValue());
            }
        }
        int kCount=0;
        for(int num:nums){
            if(num==k){
                kCount++;
            }
        }

        return kCount+maxHeap.peek();
    }
}
