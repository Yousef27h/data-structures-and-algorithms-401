package trees.karyTree;

import java.util.LinkedList;
import java.util.Queue;

public class KaryTree<T> {

    private KNode<T> root;
    private int maxNrOfChildren;

    public KaryTree(KNode<T> root) {
        this.root = root;
        this.maxNrOfChildren = root.getMaxNrOfChildren();
    }

    public KaryTree() {
    }

    public void setRoot(KNode<T> root) {
        this.root = root;
    }

    public KNode<T> getRoot() {
        return root;
    }

    public int getMaxNrOfChildren() {
        return maxNrOfChildren;
    }

    public void addNode(KNode<T> KNode){

        if (this.root == null){
            this.setRoot(KNode);
        }else {
            Queue<KNode<T>> breadth = new LinkedList<>();
            breadth.add(this.getRoot());
            while (breadth.peek() != null){
                KNode<T> front = breadth.remove();
                if (front.getChildren()!=null){
                    for (KNode<T> child : front.getChildren()){
                        breadth.add(child);
                    }
                    if (front.getChildren().size() < front.getMaxNrOfChildren()){
                        front.addChild(KNode);
                        return;
                    }
                }else{
                    front.addChild(KNode);
                    return;
                }

            }
        }
    }

//    public Node<T> fizzBuzzTree2(Node<Integer> treeRoot1){
//        KaryTree<Integer> karyTree1 = new KaryTree<>(treeRoot1);
//        KaryTree<String> karyTree2 = new KaryTree<>();
//        if (treeRoot1.getKey() % 3 == 0){
//            karyTree2.setRoot(new Node("Fizz", karyTree1.getMaxNrOfChildren()));
//        }else if (treeRoot1.getKey() % 5 == 0){
//            karyTree2.setRoot(new Node("Buzz", karyTree1.getMaxNrOfChildren()));
//        }else if (treeRoot1.getKey() % 3 == 0 && treeRoot1.getKey() % 5 == 0){
//            karyTree2.setRoot(new Node("FizzBuzz", karyTree1.getMaxNrOfChildren()));
//        }else {
//            karyTree2.setRoot(new Node("FizzBuzz", karyTree1.getMaxNrOfChildren()));
//        }
//        traverse(karyTree1,karyTree2);
//    }
//    public void traverse(KaryTree<Integer> karyTree1, KaryTree<String> karyTree2){
//        Node<Integer> current = karyTree1.getRoot();
//
//        for (Node<T> child : front.getChildren()){
//            breadth.add(child);
//            child.getKey()
//        }
//    }

    public KaryTree<T> fizzBuzzTree(KNode<Integer> treeRoot1){

        KaryTree<T> karyTree2 = new KaryTree<>();



        Queue<KNode<Integer>> breadth = new LinkedList<>();
        breadth.add(treeRoot1);
        while (breadth.peek() != null){
            KNode<Integer> front = breadth.remove();
            if (front.getKey() % 3 == 0 && front.getKey() % 5 == 0){
                karyTree2.addNode(new KNode("FizzBuzz", treeRoot1.getMaxNrOfChildren()));
            }else if (front.getKey() % 5 == 0){
                karyTree2.addNode(new KNode("Buzz", treeRoot1.getMaxNrOfChildren()));
            }else if (front.getKey() % 3 == 0){
                karyTree2.addNode(new KNode("Fizz", treeRoot1.getMaxNrOfChildren()));
            }else {
                karyTree2.addNode(new KNode(Integer.toString(front.getKey()), treeRoot1.getMaxNrOfChildren()));
            }

            breadth.addAll(front.getChildren());
        }
        return karyTree2;
    }
}
