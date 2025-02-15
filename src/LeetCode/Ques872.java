package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Ques872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        treeTraversal(root1,leaf1);
        treeTraversal(root2,leaf2);

        if(leaf1.size()!= leaf2.size()){
            return false;
        }

        for(int i=0;i<leaf1.size();i++){
            if(!leaf1.get(i).equals(leaf2.get(i))){
                return false;
            }
        }

        return true;
    }


    public void treeTraversal(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        if(root.left==null && root.right == null){
            list.add(root.val);
            return;
        }
        treeTraversal(root.left,list);
        treeTraversal(root.right,list);
        return;
    }
}
