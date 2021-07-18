/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;
import trees.binaryTree.BinaryTree;
import trees.data.Node;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Can successfully instantiate an empty tree
    @Test void emptyTest(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        assertEquals(null, binaryTree.getRoot());
    }
    //Can successfully instantiate a tree with a single root node
    @Test void singleRootTest(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(1));
        assertEquals(1, binaryTree.getRoot().getKey());
    }
    //Can successfully add a left child and right child to a single root node
    @Test void  addChildTest(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(1));
        binaryTree.getRoot().setLeftChild(new Node<>(2));
        binaryTree.getRoot().setRightChild(new Node<>(3));
        assertEquals(2, binaryTree.getRoot().getLeftChild().getKey());
        assertEquals(3, binaryTree.getRoot().getRightChild().getKey());
    }
    //Can successfully return a collection from a preorder traversal
    @Test void preOrderTest(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(1));
        binaryTree.getRoot().setLeftChild(new Node<>(2));
        binaryTree.getRoot().setRightChild(new Node<>(3));
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        assertEquals(arr, binaryTree.preOrder(binaryTree.getRoot()));
    }
    //Can successfully return a collection from a postorder traversal
    @Test void postOrderTest(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(1));
        binaryTree.getRoot().setLeftChild(new Node<>(2));
        binaryTree.getRoot().setRightChild(new Node<>(3));
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(1);
        assertEquals(arr, binaryTree.postOrder(binaryTree.getRoot()));
    }
    //Can successfully return a collection from an inorder traversal
    @Test void inOrderTest(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(1));
        binaryTree.getRoot().setLeftChild(new Node<>(2));
        binaryTree.getRoot().setRightChild(new Node<>(3));
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        assertEquals(arr, binaryTree.inOrder(binaryTree.getRoot()));
    }
}
