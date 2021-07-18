/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import trees.binaryTree.BinarySearchTree;
import trees.binaryTree.BinaryTree;
import trees.data.Node;

public class App {

    public static void main(String[] args) {

//        BinaryTree<Integer> binaryTree = new BinaryTree<>();
//
//        binaryTree.setRoot(new Node<>(1));
//        binaryTree.getRoot().setLeftChild(new Node<>(2));
//        binaryTree.getRoot().setRightChild(new Node<>(3));
//        binaryTree.getRoot().getLeftChild().setLeftChild(new Node<>(4));
//        binaryTree.getRoot().getLeftChild().setRightChild(new Node<>(5));
//        binaryTree.getRoot().getRightChild().setRightChild(new Node<>(6));
//        System.out.println("In Order: "+ binaryTree.inOrder(binaryTree.getRoot()));
//        System.out.println("Pre Order: "+binaryTree.preOrder(binaryTree.getRoot()));
//        System.out.println("Post Order: "+binaryTree.postOrder(binaryTree.getRoot()));

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(4);
        binarySearchTree.add(3);
        binarySearchTree.add(2);
        binarySearchTree.add(1);
        System.out.println(binarySearchTree.inOrder(binarySearchTree.getRoot()));
        System.out.println(binarySearchTree.containValue(3));

    }
}
