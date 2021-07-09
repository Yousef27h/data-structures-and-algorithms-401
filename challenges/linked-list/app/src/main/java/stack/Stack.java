package stack;

import java.util.EmptyStackException;

public class Stack<T> {

    private Node<T> top;

    public Stack(Node<T> top) {
        this.top = top;
    }

    public Stack() {

    }

    public Node<T> getTop() {
        return top;
    }

    // push new value on top of the stack
    public void push(T value) {
        Node<T> node = new Node<>(value);
        if (top == null) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
    }

    // pop the value of top of stack
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        } else {
            Node<T> temp = top;
            top = top.getNext();
            temp.setNext(null);
            return (T) temp.getValue();
        }
    }

    // get value of top of stack
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        } else {
            return (T) top.getValue();
        }
    }

    // check whether stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // convert stack into string form
    public String listString() {
        String message = new String("{ ");
        if (this.top == null) {
            return "There is no data in the stack!";
        } else {
            Node<T> current = this.top;
            message += current.getValue() + " } -> ";
            while (current.getNext() != null) {
                current = current.getNext();
                message += "{ " + String.valueOf(current.getValue()) + " } -> ";
            }
            message += "NULL";
        }
        return message;
    }
}
