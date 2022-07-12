package Beginners_Batch.Advance.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class find_the_distance_of_the_nearest_smallest_on_left_side {
    public static void main(String[] args) {
        int[] A= {4,6,10,11,7,8,3,5};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<A.length;i++){

            while(!stack.isEmpty() && stack.peek()>=A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                al.add(-1);
            }
            else{
                al.add(A[i]-stack.peek());
            }
            stack.push(A[i]);

        }

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

    }
}
