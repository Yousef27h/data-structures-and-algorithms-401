package stack;

public class MaxStack {

    private Node<Integer> top;
    private int maxVal;

    public MaxStack(int value) {
        top = new Node<>(value);
        maxVal = value;
    }

    public void push(int value) {
        Node<Integer> inputNode = new Node<>(value);
        top.setNext(inputNode);
        top = top.getNext();
        if (maxVal < top.getValue()) {
            maxVal = top.getValue();
        }
    }

    public int getMax() {
        return maxVal;
    }
}
