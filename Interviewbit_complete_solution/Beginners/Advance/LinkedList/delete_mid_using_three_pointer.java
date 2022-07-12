package Beginners_Batch.Advance.LinkedList;
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
public class delete_mid_using_three_pointer {
    public ListNode solve(ListNode A) {
        ListNode fast = A;
        ListNode slow = A;
        ListNode prev = null;

        if (A == null || A.next == null) return null;
        while (fast.next != null && slow.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null) break;
        }
        prev.next = slow.next;
        return A;
    }
}
}
