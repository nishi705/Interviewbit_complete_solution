//package LinkedList;
//
//
//import java.util.ArrayList;
//
//public class Two_D_linked_list {
//    public ListNode solve(ArrayList<ArrayList<Integer>> A) {
//        ListNode head = null;
//
//        List<ListNode> getHead = new ArrayList();
//
//        for(int i=0;i<A.size();i++){
//            int k = A.get(i).get(0);
//
//
//            if(k == 0){
//                getHead = insertfirst(A.get(i).get(1),head);
//            }
//            if(k==1){
//                getHead = insertend(A.get(i).get(1),head);
//            }
//            if(k==2){
//                getHead = insertatposition(A.get(i).get(2),A.get(i).get(1),head);
//            }
//            if(k==3){
//                getHead = deletefromposition(A.get(i).get(1),head);
//
//            }
//            head = getHead.get(0);
//
//        }
//        return head;
//
//    }
//    public List<ListNode> insertfirst(int x,ListNode head){
//        ListNode newnode = new ListNode(x);
//        newnode.next = null;
//        newnode.next = head;
//        head = newnode;
//        return Arrays.asList(head);
//    }
//    public List<ListNode>  insertend(int x,ListNode head){
//        ListNode newnode = new ListNode(x);
//        newnode.next = null;
//        if(head==null){
//            return Arrays.asList(newnode);
//        }
//        ListNode temp =head;
//        while(temp.next!=null){
//            temp = temp.next;
//        }
//        if(temp !=null){
//            temp.next = newnode;
//
//        }
//        return Arrays.asList(head);
//
//    }
//    public List<ListNode> insertatposition(int index,int x,ListNode head){
//        ListNode newnode = new ListNode(x);
//        newnode.next = null;
//        if(index==0){
//            return insertfirst(x,head);
//        }
//        ListNode temp = head;
//        for(int i = 0; i < index-1; i++) {
//            if(temp != null) {
//                temp = temp.next;
//            }
//        }
//        if(temp != null) {
//            newnode.next = temp.next;
//            temp.next = newnode;
//        }
//        return Arrays.asList(head);
//
//    }
//    public List<ListNode>  deletefromposition(int index,ListNode head){
//        if(head == null)return Arrays.asList(head);
//        if(index == 0) return Arrays.asList(head.next);
//
//        ListNode temp = head;
//        for(int i = 0; i < index-1; i++) {
//            if(temp != null) {
//                temp = temp.next;
//            }
//        }
//        if(temp != null && temp.next != null) {
//            ListNode nodeToDelete = temp.next;
//            temp.next = temp.next.next;
//            nodeToDelete = null;
//        }
//        return Arrays.asList(head);
//
//    }
//}
