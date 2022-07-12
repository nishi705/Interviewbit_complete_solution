package Beginners_Batch.Advance.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Nearest_Smaller_Element {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<A.size();i++){
            while(!stack.isEmpty() && stack.peek()>=A.get(i)){
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(-1);

            }
            else{
                list.add(stack.peek());
            }
            stack.push(A.get(i));
        }
        return list;
    }
}
