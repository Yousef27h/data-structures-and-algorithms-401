package queue;

public class App {
    public static void main(String[] args) {
//        Queue queue = new Queue();
//
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        System.out.println(queue.getBack().getValue());
//        System.out.println(queue.listString());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.peek());
//        System.out.println(queue.isEmpty());
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(2);
        System.out.println(pseudoQueue.getPseudo());
        pseudoQueue.dequeue();
        System.out.println(pseudoQueue.getPseudo());

    }
}
