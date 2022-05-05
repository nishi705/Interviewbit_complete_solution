package Stack_and_queue;

import java.util.Stack;

public class min_stack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();


    public void push(int x) {
        stack.push(x);
        if(minstack.isEmpty() || minstack.peek()>=x){
            minstack.push(x);
        }

    }

    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int x = stack.peek();
        if(stack.peek().equals(minstack.peek())){
            minstack.pop();
        }
        stack.pop();

    }

    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();


    }

    public int getMin() {
        if(minstack.isEmpty()){
            return -1;
        }
        return minstack.peek();


    }

}
