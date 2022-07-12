package Beginners_Batch.Advance.Stack;

import java.util.Arrays;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        int[] A = {992387, 932142, 971117, 934674, 988917, 967890, 948508, 970347};
        Stack<Integer> stack = new Stack<>();
        int[] nsl = new int[A.length];
        int N = A.length;
        int[] ans = new int[N];
        int[] ngr = new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            while(!stack.isEmpty() && A[stack.peek()]<=A[i]){
                stack.pop();
            }if(stack.isEmpty()){
                ngr[i] = A.length;
            }else{
                ngr[i] = stack.peek();
            }
            stack.push(i);
        }
        for(int i=0;i<nsl.length;i++){
            System.out.println(ngr[i]);
        }
    }
}
