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
}
