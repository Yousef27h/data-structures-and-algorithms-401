/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

public class App {
    private static final LinkedList list1 = new LinkedList();
    private static final LinkedList list2 = new LinkedList();


    public static void main(String[] args) {
//        list1.insert(5);
//        list1.insert(4);
        list1.insert(3);
        list1.insert(2);
        list1.insert(1);
        list2.insert(0);
        list2.insert(9);
        list2.insert(8);
//        list2.insert(7);
//        list2.insert(6);
//        System.out.println("Is number 2 exist in our linked list? " + list1.includes(2));
//
//        list1.append(6);
//        list1.insertBefore(6,0);
//        list1.insertBefore(6,1);
//        list1.insertAfter(3,11);
        LinkedList zipList = new LinkedList();
        System.out.println(list1.listString());
        System.out.println(list2.listString());
        System.out.println(zipList.zipLists(list1, list2).listString());
//        System.out.println(list1.getKthFromEnd(1));
    }
}
