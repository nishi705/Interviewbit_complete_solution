package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class First_missing_Integer {
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
