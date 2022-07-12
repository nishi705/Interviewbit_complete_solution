package Beginners_Batch.Advance.Stack;

import java.util.ArrayList;
import java.util.Stack;
//In place of array element if i will insert array index
//then A[stack.peek()] will give the peek element
//we will pop out all those element having value greater
//since we are stroring index so at the end we will get index;

public class Find_the_Index_of_nearest_smaaler_element {
    public static void main(String[] args) {
        int[] A= {4,6,10,11,7,8,3,5};
                Stack<Integer> stack = new Stack<>();
               ArrayList<Integer> al = new ArrayList<>();

               for(int i=0;i<A.length;i++){

                   while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                       stack.pop();
                   }
                   if(stack.isEmpty()){
                       al.add(-1);
                   }
                   else{
                       al.add(stack.peek());
                   }
                   stack.push(i);

               }

               for(int i=0;i<al.size();i++){
                   System.out.println(al.get(i));
               }

    }
}
