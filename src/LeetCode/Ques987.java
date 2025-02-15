package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ques987 {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,List<Integer>> verticalDistanceMap = new TreeMap<>();
        int vd = 0;
        helper(root,vd,verticalDistanceMap);
        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>> entry: verticalDistanceMap.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }

    public void helper(TreeNode root, int vd, TreeMap<Integer,List<Integer>> verticalDistanceMap){
        if(root==null){
            return;
        }
        List<Integer> list = verticalDistanceMap.getOrDefault(vd,new ArrayList<>());
        list.add(root.val);
        verticalDistanceMap.put(vd, list);
        helper(root.left,vd-1,verticalDistanceMap);
        helper(root.right,vd+1,verticalDistanceMap);
    }
}
