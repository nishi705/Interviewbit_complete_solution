package Beginners_Batch.Advance.Stack;

import java.util.Stack;

public class sort_stack_using_merge_sort {
    public static void main(String[] args) {

        int[] A = {66, 96, 43, 28, 14, 1, 41, 76, 70, 81, 22, 11, 42, 78, 4, 88, 70, 43, 90, 6, 12};
        Stack<Integer> stack1 = new Stack<>();
        for(int i=0;i<A.length;i++){
            stack1.push(A[i]);
        }
        int n = stack1.size();
        callstack(stack1);


//        int [] ans = new int[stack1.size()];
//        for (int i =0; i<stack1.size();i++){
//            ans[i]= stack1.get(i);
//        }
//
//        for (int i=0;i<ans.length;i++){
//            System.out.println(ans[i]);
//        }


    }
   static void callstack(Stack<Integer> stack){
       Stack s1 = new Stack();
       Stack s2 = new Stack();

       while (stack.size() != 0) {
           if (stack.size() % 2 == 0) {
               s1.push(stack.pop());
           } else {
               s2.push(stack.pop());
           }
       }

       if (s1.size() > 1) {
           callstack(s1);
       }

       if (s2.size() > 1) {
           callstack(s2);
       }

       merge(s1, s2, stack);

       //merge(s1,s2);
    }

   static void merge(Stack<Integer> s1,Stack s2,Stack stack){

       Stack mergedStack = new Stack();
       while (!s1.isEmpty() && !s2.isEmpty()) {
           if ((Integer) s1.peek() < (Integer) s2.peek()) {
               mergedStack.push(s2.pop());
           } else {
               mergedStack.push(s1.pop());
           }
       }


       while (!s1.isEmpty()) {
           mergedStack.push(s1.pop());
       }

       while (!s2.isEmpty()) {
           mergedStack.push(s2.pop());
       }
       for(int i=0;i<mergedStack.size();i++){
           System.out.println(mergedStack.get(i));
       }

        reverse(stack);
    }
    static void reverse(Stack<Integer> stack){

        Stack<Integer> s = new Stack<>();

        while(stack.size()>0){
            s.push(stack.pop());
        }

       // return s;
    }
}
