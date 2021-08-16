package binaryTree.binaryTree;

import org.checkerframework.checker.units.qual.A;
import trees.data.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
    protected Node<T> root;
    private ArrayList<T> preArr = new ArrayList<>();
    private ArrayList<T> inArr = new ArrayList<>();
    private ArrayList<T> postArr = new ArrayList<>();
    int leavesSum1 = 0;
    int leavesSum2 = 0;

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

    /**
     * Creates an array with elements ordered using breadth first traverse
     * @param binaryTree
     * @return array list with elements ordered
     */
    public ArrayList<T> breadthFirst(BinaryTree<T> binaryTree){
          Queue<Node> breadth = new LinkedList<>();

        ArrayList<T> arrayList = new ArrayList<>();
        if (binaryTree.getRoot() == null) throw new NullPointerException();
        breadth.add(binaryTree.getRoot());

         while (breadth.peek() != null){
            Node<T> frontNode = breadth.remove();
            arrayList.add(frontNode.getKey());
            if (frontNode.getLeftChild() != null){
                breadth.add(frontNode.getLeftChild());
            }
            if (frontNode.getRightChild() != null){
                breadth.add(frontNode.getRightChild());
            }
        }
        return arrayList;
    }

//    public  int sumOfOddNums( Node<Integer> root){
//    if ( root == null) return sum;
//
//        sumOfOddNums(root.getLeftChild());
//        if (root.getKey() %2 !=0)
//            sum+= root.getKey();
//        sumOfOddNums(root.getRightChild());
//        return sum;
//    }

    /**
     * comapre two binary trees and return boolean whether they have same number of leaves or not.
     * @param root1
     * @param root2
     * @return boolean
     */
    public boolean compareLeaves(Node root1, Node root2){
        if (root1 == null || root2 == null) throw new NullPointerException();
        return countLeaves(root1, leavesSum1) == countLeaves(root2, leavesSum2);
    }

    /**
     * counts the number of leaves that a tree has.
     * @param current
     * @param sum
     * @return integer
     */
    public int countLeaves(Node current, int sum){
        if (current == null) return sum;

        if (current.getRightChild()==null && current.getLeftChild()==null){
            sum += 1;
        }
        sum = countLeaves(current.getLeftChild(), sum);
        sum = countLeaves(current.getRightChild(), sum);

        return sum;
    }
}
