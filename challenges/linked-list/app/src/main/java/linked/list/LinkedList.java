package linked.list;


import data.Node;

public class LinkedList {

    private Node head;

    // insert new node at the start of linked list
    public void insert(int data){
            Node node = new Node(data);
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    // check for a node value if exists
    public boolean includes (int data){
        if (head != null) {
            Node current = head;
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
            message += current.getData()+" } -> ";
            while(current.getNext() != null){
                current = current.getNext();
                message += "{ " +String.valueOf(current.getData()) + " } -> ";
            }
            message += "NULL";
        }
        return message;
//        if(head == null){
//            System.out.println("{NULL}");
//        }
//        Node current = head;
//        while (current != null){
//            if (current.getNext() != null) {
//                System.out.print("{ " + current.getData() + " } " + "-> ");
//                current = current.getNext();
//            }else {
//                System.out.print("{ " + current.getData() + " } -> NULL");
//                current = current.getNext();
//            }
//        }
//        return "";
    }

    // append new node to linked list
    public void append(int n){
        Node newNode = new Node(n);
        if ( head == null){
            head = newNode ;
        }else{
            Node current  = head;
            while (current.getNext()!= null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // insert a node(n) before input value(v)
    public void insertBefore(int v, int n){
        Node newNode = new Node(n);
        Node current = head;
        while (current.getNext().getData() != v){
            current = current.getNext();
        }
        Node nextNode = current.getNext();
        current.setNext(newNode);
        newNode.setNext(nextNode);
    }

    // insert a node (n) after input value (v)
    public void insertAfter(int v, int n){
        Node current = head;
        Node newNode = new Node(n);
        while (current.getData() != v){
            current = current.getNext();
        }
        Node vNode = current;
        Node afterNew = vNode.getNext();
        newNode.setNext(afterNew);
        vNode.setNext(newNode);
    }
}
