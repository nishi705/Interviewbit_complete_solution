package Maths;

public class Majority_element {
    public static void main(String[] args) {
        int[] A ={2,1,1};

        int n = A.length;
        int freq = 0;
        int me = A[0];
        for(int i=0;i<A.length;i++){

            if(A[i] == me){
                freq++;
            }
            else if(freq ==0){
                me = A[i];
                freq = 1;
            }
            else{
                freq--;
            }
           // System.out.println(me);
        }
        System.out.println(me);

        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i] == me){
                count++;
            }
        }
        if(count > n/2){
            System.out.println(me);
        }else {
            System.out.println(-1);
        }
    }

}
