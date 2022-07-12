//package Beginners_Batch.Advance.LinkedList;
//
//import java.util.LinkedList;
//
//class Node{
//
//    int data;
//    Node next;
//
//    Node(){
//
//    }
//
//    Node(int x){
//        this.data = x;
//        this.next = null;
//    }
//}
//
//public class Size_of_the_linked_list {
//    static Node head = null;
//    static void callnode(){
//
//        Node temp = head;
//
//        if(head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp= temp.next;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Size_of_the_linked_list sList = new Size_of_the_linked_list();
//        sList.addNode(1);
//        sList.addNode(2);
//        sList.addNode(3);
//        sList.addNode(4);
//
//        //Displays the nodes present in the list
//        sList.callnode();
//
//        LinkedList<Integer> list = new LinkedList<>();
//
//
//        list.add(10);
//        list.add(22);
//        list.add(1);
//        list.add(12);
//        list.add(19);
//        list.add(21);
//        list.add(5);
//        list.add(9);
//        list.add(2);
//        list.size();
//
//        System.out.println(list);
//
//        callnode();
//    }
//}
