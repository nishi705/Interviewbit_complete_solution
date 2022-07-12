package Beginners_Batch.Advance.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        //if A[i]->recent height < H dont consider and maximum we can go till that point only.
        //we can do like
        //get the nearest smaller element on left sode and nearset smaller value on right side
        int[] A = {90, 58, 69, 70, 82, 100, 13, 57, 47, 18};
        //NSL on left side
        int[] nsl = new int[A.length];
        int[] nsr = new int[A.length];

        Stack<Integer> stack = new Stack();
        for(int i=0; i<A.length; i++){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsl[i] = -1;

            }
            else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=A.length-1; i>=0; i--){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsr[i] = A.length;
            }
            else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
        int sum = 0;
        for(int i=0; i<A.length; i++){
            sum = Math.max(A[i]*Math.abs(nsr[i]-nsl[i]-1),sum);
        }
        System.out.println(sum);
    }
}
