package trees.data;

public class Node<T> {
    private T key;
    private Node<T> rightChild;
    private Node<T> leftChild;

    public Node(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }
}
