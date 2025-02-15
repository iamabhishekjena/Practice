package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Ques2364 {
    public static long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (long)n * (n - 1) / 2;
        Map<Integer, Long> diffCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            totalPairs -= diffCount.getOrDefault(diff, 0L);
            diffCount.put(diff, diffCount.getOrDefault(diff, 0L) + 1);
        }
        return totalPairs;
    }

    public static void main(String args[]){
        long result = countBadPairs(new int[]{1,2,3,4,5});
    }
}
