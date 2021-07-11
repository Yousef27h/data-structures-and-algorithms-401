package queue;

import stack.Stack;

public class PseudoQueue<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(T value){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(value);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public T dequeue(){
        if (stack1.isEmpty()){
            return (T) "Pseudo Queue is empty!";
        }
        T topVal = stack1.peek();
        stack1.pop();
        return topVal;
    }

    public String getPseudo(){
        return stack1.listString();
    }
    public T peek(){
        return stack1.peek();
    }

}
