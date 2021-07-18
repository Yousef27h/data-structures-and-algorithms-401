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


}
