package binaryTree.binaryTree;

import trees.data.Node;

public class BinarySearchTree<T> extends BinaryTree<T> {

    public void add(int value){
        if (root == null){
            root = (Node<T>) new Node<Integer>(value);
        }else{
            Node<T> current = root;
            traverse((Node<Integer>) current, value);
        }
    }

    public void traverse(Node<Integer> current, int key){
        if (key > current.getKey()){
            if (current.getRightChild() == null){
                current.setRightChild(new Node<>(key));
                return;
            }
            current = current.getRightChild();
        }else {
            if (current.getLeftChild() == null){
                current.setLeftChild(new Node<>(key));
                return;
            }
            current = current.getLeftChild();
        }
        traverse(current, key);
    }

    public boolean containValue(int value){
        return inOrder(root).contains(value);
    }

}
