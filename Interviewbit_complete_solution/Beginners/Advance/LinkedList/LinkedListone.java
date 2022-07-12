//package Beginners_Batch.Advance.LinkedList;
//
///*
//public ListNode solve(ListNode A) {
//        ListNode temp = A;
//        ListNode prev = null;
//
//        HashSet<Integer> set = new HashSet<>();
//
//        while(temp!=null){
//            if(set.contains(temp.val)){
//                    prev.next = null;
//            }else{
//                set.add(temp.val);
//                prev = temp;
//                temp = temp.next;
//            }
//            temp = temp.next;
//        }
//return A;
//
//    }
// */
//public class LinkedListone {
//
//    static Node head; // head of list
//
//    /* Linked list Node*/
//    static class Node {
//        int data;
//        Node next;
//        Node(int d)
//        {
//            data = d;
//            next = null;
//        }
//    }
//
//    /* Inserts a new Node at front of the list. */
//    static public void push(int new_data)
//    {
//        /* 1 & 2: Allocate the Node &
//                  Put in the data*/
//        Node new_node = new Node(new_data);
//
//        /* 3. Make next of new Node as head */
//        new_node.next = head;
//
//        /* 4. Move the head to point to new Node */
//        head = new_node;
//    }
//
//    // Returns true if there is a loop in linked
//    // list else returns false.
//    static boolean detectLoop(Node h)
//    {
//
//    }
//
//    /* Driver program to test above function */
//    public static void main(String[] args)
//    {
//        LinkedListone llist = new LinkedListone();
//
//        llist.push(20);
//        llist.push(4);
//        llist.push(15);
//        llist.push(10);
//
//        /*Create loop for testing */
//        llist.head.next.next.next.next = llist.head;
//
//        if (detectLoop(head))
//            System.out.println("Loop found");
//        else
//            System.out.println("No Loop");
//    }
//}
