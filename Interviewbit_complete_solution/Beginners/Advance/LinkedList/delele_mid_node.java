package Beginners_Batch.Advance.LinkedList;







public class delele_mid_node {
    static class Node{
        int data;
        Node next;

        Node(){

        }
    }

    //create utility functio
    static Node newNode(int data){
        Node temp = new Node();
         temp.data = data;
         temp.next = null;
         return temp;
    }
   static void deletemid(Node  head){
         Node temp = head;
        int x = countnode(head);




/*
10
13
22
19
13
 */
        int mid = x/2;
       //System.out.println(mid);

        while(mid --> 1){
           //System.out.println(mid);
            temp = temp.next;
            mid--;
        }
        temp.next = temp.next.next;

    }
    static int countnode(Node head){
        Node temp = head;
        int count =0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head = newNode(10);
        head.next = newNode(13);
        head.next.next = newNode(22);
        head.next.next.next = newNode(19);
        head.next.next.next.next = newNode(2);
        head.next.next.next.next.next = newNode(13);

       deletemid(head);
        System.out.println();

        Node temp = head;
        while(temp!=null){
           System.out.println(temp.data);
            temp = temp.next;
        }


    }
}
