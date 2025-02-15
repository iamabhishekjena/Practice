package LeetCode;

public class Ques23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode();
        int listIndex = 0;

        int elementCount =0;
        for(int i=0;i<lists.length;i++){
            ListNode curr = lists[i];
            while(curr!=null){
                elementCount++;
                curr = curr.next;
            }
        }
        ListNode curr  = result;
        while(elementCount!=0){
            int min =Integer.MAX_VALUE;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null && lists[i].val<min) {
                    min = lists[i].val;
                    listIndex = i;
                }
            }
            curr.next = new ListNode(min);
            curr = curr.next;
            lists[listIndex] = lists[listIndex].next;
            elementCount--;
        }

        return result.next;

    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
