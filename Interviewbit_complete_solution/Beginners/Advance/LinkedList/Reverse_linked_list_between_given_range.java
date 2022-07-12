package Beginners_Batch.Advance.LinkedList;

public class Reverse_linked_list_between_given_range {

  static class Node{
        int data;
        Node next;
    }
    //utility method
    static Node newNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }
    static Node reverselist(Node A, int B,int C){
        Node temp = A;
        int count =0;
        while(count<B){
            temp = temp.next;
            count++;
        }

        Node next = null;
        Node prev = null;

        while(count < C){
            next =temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            count++;
        }
       return prev;
    }

    public static void main(String[] args) {
        Node head = newNode(10);
        head.next = newNode(20);
        head.next.next = newNode(3);
        head.next.next.next= newNode(15);
        head.next.next.next.next= newNode(2);
        int A = 2;
        int B = 4;
        reverselist(head,A,B);

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }



    }

}
