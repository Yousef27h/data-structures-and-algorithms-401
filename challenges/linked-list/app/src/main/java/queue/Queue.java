package queue;

import java.util.EmptyStackException;

public class Queue<T> {

    private Node<T> front;
    private Node<T> back;

    public Node<T> getFront() {
        return front;
    }

    public Node<T> getBack() {
        return back;
    }

    public Queue() {
    }

    public void enqueue(T value) {
        Node<T> node = new Node<T>(value);
        if (front == null) {
            front = node;
            back = node;
        } else {
            back.setNext(node);
            back = node;
        }
    }

    public T dequeue() {
        if (front == null) {
            throw new EmptyStackException();
        } else {
            Node<T> temp = front;
            front = front.getNext();
            temp.setNext(null);
            return (T) temp.getValue();
        }
    }

    public T peek() {
        if (front == null) {
            throw new EmptyStackException();
        } else {
            return (T) front.getValue();
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public String listString() {
        String message = new String("{ ");
        if (this.front == null) {
            return "There is no data in the stack!";
        } else {
            Node<T> current = this.front;
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
