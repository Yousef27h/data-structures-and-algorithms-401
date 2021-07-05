/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void listStringTest() {
        LinkedList test = new LinkedList();
        assertNotNull(test.toString(), "{NULL}");
    }

    @Test void listStringTest2(){
        LinkedList test2 = new LinkedList();
        test2.insert(1);
        test2.insert(2);
        test2.insert(3);
        test2.insert(4);
        test2.insert(5);
        assertEquals(test2.listString(),"{ 5 } -> { 4 } -> { 3 } -> { 2 } -> { 1 } -> NULL");
    }

    @Test void listStringTest3(){
        LinkedList test2 = new LinkedList();
        test2.insert(1);
        test2.insert(2);
        test2.insert(3);
        test2.insert(4);
        test2.insert(5);
        test2.append(6);
        test2.insertBefore(6,0);
        test2.insertBefore(6,1);
        test2.insertAfter(3,11);
        assertEquals(test2.listString(),"{ 5 } -> { 4 } -> { 3 } -> { 11 } -> { 2 } -> { 1 } -> { 0 } -> { 1 } -> { 6 } -> NULL");
    }


    /*
    Code Challenge: Class 07
     */

    LinkedList kthNumTest = new LinkedList();

    // Where k is greater than the length of the linked list
    @Test void kthNumberTest(){
        kthNumTest.insert(1);
        kthNumTest.insert(2);
        kthNumTest.insert(3);
        kthNumTest.insert(4);
        kthNumTest.insert(5);
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> kthNumTest.getKthFromEnd(6));
    }
    // Where k and the length of the list are the same
    @Test void kthNumberTest2(){
        kthNumTest.insert(1);
        kthNumTest.insert(2);
        kthNumTest.insert(3);
        kthNumTest.insert(4);
        kthNumTest.insert(5);
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> kthNumTest.getKthFromEnd(5));
    }
    // Where k is not a positive integer
    @Test void kthNumberTest3() {
        kthNumTest.insert(1);
        kthNumTest.insert(2);
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> kthNumTest.getKthFromEnd(-1));
    }
    // Where the linked list is of a size 1
    @Test void kthNumberTest4() {
        kthNumTest.insert(1);
        assertEquals(kthNumTest.getKthFromEnd(0),"The number that's located at 0 from tail is: 1");
    }
    // 'Happy Path' where k is not at the end, but somewhere in the middle of the linked list
    @Test void kthNumberTest5() {
        kthNumTest.insert(1);
        kthNumTest.insert(2);
        kthNumTest.insert(3);
        kthNumTest.insert(4);
        kthNumTest.insert(5);
        assertEquals(kthNumTest.getKthFromEnd(3),"The number that's located at 3 from tail is: 4");
    }
}
