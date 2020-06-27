
public class Partition {

    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode partition(ListNode head, int x) {
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        
        ListNode curr = head;
        
        while(curr!= null){
            ListNode next = curr.next;
            curr.next = null;
            if(curr.val < x){
                if(beforeStart == null){
                    beforeStart = curr;
                    beforeEnd = beforeStart;
                }else{
                    beforeEnd.next = curr;
                    beforeEnd = curr;
                }
            }else{
                if(afterStart == null){
                    afterStart = curr;
                    afterEnd = afterStart;
                }else{
                    afterEnd.next = curr;
                    afterEnd = curr;
                }
               
            }
            curr = next;
        }
        if(beforeStart == null){
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
    }
}