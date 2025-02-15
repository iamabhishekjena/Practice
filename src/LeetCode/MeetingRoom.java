package LeetCode;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MeetingRoom {
    public int maxMeetings(int start[], int end[]) {
        List<int[]> pairList = new ArrayList<>();

        for(int i=0;i<start.length;i++){
            pairList.add(new int[]{start[i],end[i]});
        }

        pairList.sort(Comparator.comparingInt(a -> a[1]));
        int ans=0;
        int prev=-1;

        for(int i=0;i<start.length;i++){
            int ss = pairList.get(i)[0];
            if (ss>prev){
                ans++;
                prev = pairList.get(i)[1];
            }
        }

        return ans;
    }
}
