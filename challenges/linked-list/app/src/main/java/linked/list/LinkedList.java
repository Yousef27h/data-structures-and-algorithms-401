package linked.list;


import data.Node;

public class LinkedList {

    private Node head;

    public void insert(int data){
            Node node = new Node(data);
            if (this.head == null ){
                this.head = node;
            }else{
                Node current = this.head;
                node.setNext(current);
                this.head = node;
            }
    }

    public boolean includes (int data){
        if (this.head == null){
            return false;
        }else{
            Node current = this.head;
            while(current.getNext() != null){
                if (current.getData() != data) {
                    current = current.getNext();
                }else{
                    return true;
                }
            }
            return false;
        }
    }

    public String listString(){
        String message = new String("");
        if (this.head == null){
            return "There is no data in the list!";
        }else{
            Node current = this.head;
            while(current.getNext() != null){
                message += String.valueOf(current.getData());
            }
        }
        return message;
    }
}
