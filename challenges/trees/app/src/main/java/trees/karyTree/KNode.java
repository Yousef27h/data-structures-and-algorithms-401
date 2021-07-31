package trees.karyTree;

import java.util.ArrayList;

public class KNode<T> {

    private ArrayList<KNode<T>> children;
    private T key;
    private int maxNrOfChildren;

    public KNode(T key, int maxNrOfChildren) {
        this.key = key;
        this.maxNrOfChildren = maxNrOfChildren;
        this.children = new ArrayList<>();
    }

    public ArrayList<KNode<T>> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<KNode<T>> children) {
        this.children = children;
    }

    public void addChild(KNode<T> child) {
        this.children.add(child);
    }

    public int getMaxNrOfChildren() {
        return maxNrOfChildren;
    }

    public T getKey() {
        return key;
    }
}
