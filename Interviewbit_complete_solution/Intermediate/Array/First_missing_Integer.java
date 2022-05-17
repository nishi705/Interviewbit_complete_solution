package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class First_missing_Integer {
    //Second approach
    public int firstMissingPositive(int[] A) {
        for(int i=0;i<A.length;i++)
        {
            while(A[i]>=1 && A[i]<=A.length && A[i] != A[A[i]-1])
            {
                int temp;
                temp =  A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = temp;
            }
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=i+1)
                return i+1;
        }
        return A.length+1;

    }
    public static void main(String[] args) {

        ArrayList<Integer> AL = (ArrayList<Integer>) Arrays.asList(3, 4, -1, 1);


        for(int i=0;i<AL.size();i++){
            if(AL.get(i)>0 && AL.get(i)<=AL.size()){
         int pos = AL.get(i);
         if(AL.get(pos)!= AL.get(i)) {
             Collections.swap(AL, pos, i);
             i--;
         }
         }
        }

        for(int i=0;i<AL.size();i++){
            if(AL.get(i) != i+1){
                System.out.println(i+1);
            }
            else{
                System.out.println(AL.size()+1);
            }
        }

    }
}
