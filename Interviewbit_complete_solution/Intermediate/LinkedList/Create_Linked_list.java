package LinkedList;


class Node{

    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }

}

public class Create_Linked_list {
    public static Node head = null;
    public static void main(String[] args) {
        Create_Linked_list c = new Create_Linked_list();
        c.head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);

        c.head.next = first;
        first.next = second;

        printlist(head);

    }

    private static void printlist(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }


}
