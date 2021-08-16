/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtables;
import binaryTree.binaryTree.BinaryTree;
import trees.data.Node;

import java.util.regex.*;

public class App {


    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>();
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>();
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        binaryTree1.setRoot(new Node<Integer>(0));
        binaryTree2.setRoot(new Node<Integer>(0));
        binaryTree1.getRoot().setLeftChild(new Node<Integer>(1));
        binaryTree1.getRoot().setRightChild(new Node<Integer>(2));
        binaryTree2.getRoot().setRightChild(new Node<Integer>(2));
        binaryTree2.getRoot().setLeftChild(new Node<Integer>(3));


        System.out.println(hashtable.getIntersection(binaryTree1,binaryTree2));
//        System.out.println();
    }
}