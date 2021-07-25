package trees.binaryTree;

import org.checkerframework.checker.units.qual.A;
import trees.data.Node;

import java.util.ArrayList;

public class BinaryTree<T> {
    protected Node<T> root;
    private ArrayList<T> preArr = new ArrayList<>();
    private ArrayList<T> inArr = new ArrayList<>();
    private ArrayList<T> postArr = new ArrayList<>();

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public ArrayList<T> preOrder(Node<T> node){
        if (node != null) {
            preArr.add(node.getKey());
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
        return preArr;
    }

    public ArrayList<T> inOrder(Node<T> node){
        if (node != null){
            inOrder(node.getLeftChild());
            inArr.add(node.getKey());
            inOrder(node.getRightChild());
        }
        return inArr;
    }

    public ArrayList<T> postOrder(Node<T> node){
        if (node != null){
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            postArr.add(node.getKey());
        }
        return postArr;
    }

    /**
     * Finds the maximum value stored in the tree. Assuming that the values stored in the Binary Tree will be numeric.
     * @return maximum number in tree
     */
    public int maxValue(){
        int maxVal = Integer.MIN_VALUE;
        Node<Integer> current = (Node<Integer>) root;
        return traverseMax(current, maxVal);
    }

    /**
     * Traverse through tree to find maximum number assuming all elements are integers.
     * @param node
     * @param maxVal
     * @return maximum number in the tree
     */
    public int traverseMax(Node<Integer> node, int maxVal) {
        if (node == null){
            return maxVal;
        }
        if (node.getKey() > maxVal) {
            maxVal = node.getKey();
        }
        maxVal = traverseMax(node.getLeftChild(), maxVal);
        maxVal = traverseMax(node.getRightChild(), maxVal);
        return maxVal;
    }
}
