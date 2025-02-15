package LeetCode;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Ques373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<Pair<Integer,Pair<Integer,Integer>>> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));

        for(int i=0;i<Math.min(nums1.length,k);i++){
            for (int j=i;j<Math.min(nums2.length,k);j++){
                pq.offer(new Pair<>(nums1[i]+nums2[j],new Pair<>(nums1[i],nums2[j])));
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        int j=0;
        while(j<k){
            List<Integer> curr = new ArrayList<>();
            Pair<Integer,Pair<Integer,Integer>> currPair= pq.poll();
            curr.add(currPair.getValue().getKey());
            curr.add(currPair.getValue().getValue());
            result.add(curr);
        }

        return result;
    }
}
