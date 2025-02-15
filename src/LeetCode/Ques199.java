package LeetCode;

import java.util.*;

public class Ques199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        TreeMap<Integer,Integer> levelMap = new TreeMap<>();
        int level =0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size>0){
                TreeNode curr = q.peek();
                q.remove();
                levelMap.put(level,curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            level++;
        }
        for(Map.Entry<Integer,Integer> entry: levelMap.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}
