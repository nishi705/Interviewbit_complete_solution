package LinkedList;

public class Linked_List {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public static Node head = null;
    public static void insert_node(int position, int value) {
        Node newNode = new Node(value);
        newNode.next = null;
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }
            if(temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    public static void delete_node(int position) {
        if (position == 1 && head != null) {
           // Node nodeToDelete = head;
            head = head.next;
            //nodeToDelete = null;
        } else {
            Node temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }
            if(temp != null && temp.next != null) {
                Node nodeToDelete = temp.next;
                temp.next = temp.next.next;
                nodeToDelete = null;
            }
        }
    }
    public static void print_ll() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data);
            tnode = tnode.next;
            if(tnode!=null){
                System.out.print(" ");
            }
        }
    }

}
