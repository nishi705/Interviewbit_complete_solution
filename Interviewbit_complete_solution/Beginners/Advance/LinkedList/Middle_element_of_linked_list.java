package Beginners_Batch.Advance.LinkedList;

public class Middle_element_of_linked_list {
    public int solve(ListNode A) {
        ListNode start = A;
        ListNode end = A;
        ListNode prev = null;
        while(end.next!=null && start.next!=null){
            prev = start;
            start = start.next;
            end = end.next.next;
            if(end==null)break;
        }
        return start.val;
    }
}
