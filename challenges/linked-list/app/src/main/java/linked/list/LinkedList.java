package linked.list;


import data.Node;

public class LinkedList<T> {

    private Node head;

    // insert new node at the start of linked list
    public void insert(int data){
            Node node = new Node(data);
        if (this.head != null) {
            Node current = this.head;
            node.setNext(current);
        }
        this.head = node;
    }

    // check for a node value if exists
    public boolean includes (int data){
        if (this.head != null) {
            Node current = this.head;
            while (current.getNext() != null) {
                if (current.getData() != data) {
                    current = current.getNext();

                } else {
                    return true;
                }
            }
        }
        return false;
    }

    // convert linked list node values to string
    public String listString(){
        String message = new String("{ ");
        if (this.head == null){
            return "There is no data in the list!";
        }else{
            Node current = this.head;
            message += current.getData()+" } -> { ";
            while(current.getNext() != null){
                current = current.getNext();
                message += String.valueOf(current.getData()) + " } -> { ";
            }
            message += " } -> NULL";
        }
        return message;
    }

}
