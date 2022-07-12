package Beginners_Batch.Advance.Stack;

import java.util.Stack;

public class Given_an_array_of_integers_A_value_o_a_array_max_min {
    public static void main(String[] args) {
        //1.Brute force with n^3
        //2.Contribution technique
        /*
        for the contribution technique
        first count all the subarray in which A[i] is maximum i.e x;
        second count all the subarray int which A[i] is minimum i.e y;
        ans = (A[i]*x - A[i]*y)
         */
        int[] A= {2,13,8,4,1,5,3,2,7};
        Stack<Integer> stack =new Stack<>();
        //try to get first greatest element on the right side
        //try to get  first greatest element on the left side
        //NSL next smaller element of left side
        int[] nsl = new int[A.length];
        for(int i=0;i<A.length;i++){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }if(stack.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        //NSR next smaller element on right side
        int[] nsr = new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }if(stack.isEmpty()){
                nsr[i] = A.length;
            }else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        //NGL next greatest element on the left side
        int[] ngl = new int[A.length];
        for(int i=0;i<A.length;i++){
            while(!stack.isEmpty() && A[stack.peek()]<=A[i]){
                stack.pop();
            }if(stack.isEmpty()){
                ngl[i] = -1;
            }else{
                ngl[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        //NGR next greates element on the right side
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
        int ans =0;
        for(int i=0;i<A.length;i++){
            int x = (i-ngl[i])*(ngr[i]-i)*A[i];
            int y =(i-nsl[i])*(nsl[i]-i)*A[i];
            ans += x-y;
        }
        System.out.println(ans);

    }
}
