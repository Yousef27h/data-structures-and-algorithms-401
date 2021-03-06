/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import queue.*;
import stack.BalanceBrackets;
import stack.MaxStack;
import stack.Stack;

import java.util.EmptyStackException;

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
    /*
    Code Challenge 08
     */
    LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();
    LinkedList zipList = new LinkedList();

    // where both list1 & list2 have same size
    @Test void zippedListTest() {
        list1.insert(3);
        list1.insert(2);
        list1.insert(1);
        list2.insert(0);
        list2.insert(9);
        list2.insert(8);
        assertEquals(zipList.zipLists(list1, list2).listString(),"{ 1 } -> { 8 } -> { 2 } -> { 9 } -> { 3 } -> { 0 } -> NULL");
    }
    // Where list1 & list2 have different sizes
    @Test void zippedListTest2() {
        list1.insert(5);
        list1.insert(4);
        list1.insert(3);
        list1.insert(2);
        list1.insert(1);
        list2.insert(0);
        list2.insert(9);
        list2.insert(8);
        assertEquals(zipList.zipLists(list1, list2).listString(),"{ 1 } -> { 8 } -> { 2 } -> { 9 } -> { 3 } -> { 0 } -> { 4 } -> { 5 } -> NULL");
    }

    // Where one of the lists is empty
    @Test void zippedListTest3() {
        list1.insert(5);
        assertEquals(zipList.zipLists(list1, list2).listString(),"{ 5 } -> NULL");
    }

}
class stackTest{
    /*
    Tests for Stack class
     */
    // initialize empty stack
    Stack stack = new Stack();
    // Can successfully push onto a stack
    @Test void  pushStackTest(){
        stack.push(3);
        assertEquals(3,stack.getTop().getValue());
    }

    // Can successfully push multiple values onto a stack
    @Test void multiplePushTest(){
        stack.push(3);
        stack.push(4);
        assertEquals("{ 4 } -> { 3 } -> NULL",stack.listString());
    }

    // Can successfully pop off the stack
    @Test void popTest(){
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.pop());
    }

    // Can successfully empty a stack after multiple pops
    @Test void emptyTest(){
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    // Can successfully peek the next item on the stack
    @Test void peekTest(){
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.peek());
    }

    // Can successfully instantiate an empty stack
    @Test void instantEmptyTest(){
        assertEquals(true, stack.isEmpty());
    }

    // Calling pop or peek on empty stack raises exception
    @Test void exceptionTest(){
        Throwable exception = assertThrows(EmptyStackException.class, () -> stack.pop());
    }
}

class queueTest{
    /*
    Tests for Queue class
     */

    // create new queue object instance
    Queue queue = new Queue();

    // Can successfully enqueue into a queue
    @Test void enqueueTest(){
        queue.enqueue(3);
        assertEquals(3,queue.getFront().getValue());
    }

    // Can successfully enqueue multiple values into a queue
    @Test void multipleEnqueueTest(){
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        assertEquals("{ 3 } -> { 4 } -> { 5 } -> NULL",queue.listString());
    }

    // Can successfully dequeue out of a queue the expected value
    @Test void dequeueTest(){
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        assertEquals(3,queue.dequeue());
    }

    // Can successfully peek into a queue, seeing the expected value
    @Test void peekTest(){
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        assertEquals(3,queue.peek());
    }

    // Can successfully empty a queue after multiple dequeues
    @Test void emptyTest(){
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals("There is no data in the stack!",queue.listString());
    }

    // Can successfully instantiate an empty queue
    @Test void instantiateTest(){
        assertEquals("There is no data in the stack!",queue.listString());
    }

    // Calling dequeue or peek on empty queue raises exception
    @Test void exceptionTest(){
        Throwable exception = assertThrows(EmptyStackException.class, () -> queue.peek());
    }
}

class pseudoQueueTest{
    // initialize new pseudo queue with arbitrary values enqueued
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    @BeforeEach void init(){
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
    }
    // test enqueue method
    @Test void enqueueTest(){ assertEquals(1,pseudoQueue.peek() );}
    // test dequeue method
    @Test void dequeueTest(){
        pseudoQueue.dequeue();
        assertEquals(2, pseudoQueue.peek());
    }
    // test dequeue an empty queue
    @Test void emptyTest(){
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        pseudoQueue.dequeue(); // now queue is empty
        assertEquals("Pseudo Queue is empty!", pseudoQueue.dequeue());
    }

}

class animalShelterTest{
    // create new object instance and add elements
    AnimalShelter<Animal> animalShelter = new AnimalShelter<>();
    Cat cat1 = new Cat("cat");
    Cat cat2 = new Cat("cat");
    Dog dog1 = new Dog("DOG");
    Dog dog2 = new Dog("dog");

    @BeforeEach
    void test(){
        animalShelter.enqueueAnimal(cat1);
        animalShelter.enqueueAnimal(cat2);
        animalShelter.enqueueAnimal(dog1);
        animalShelter.enqueueAnimal(dog2);
    }
    // test if elements has been added
    @Test void enqueueTest(){
        assertEquals(4, animalShelter.getAnimalArray().size());
    }
    // test dequeue method
    @Test void dequeueTest(){
        animalShelter.dequeue("cat");
        assertEquals(3, animalShelter.getAnimalArray().size());
    }
    // test dequeue for empty list
    @Test void dequeueEmptyTest(){
        animalShelter.dequeue("cat");
        animalShelter.dequeue("cat");
        animalShelter.dequeue("dog");
        animalShelter.dequeue("dog");
        assertEquals(null, animalShelter.dequeue("cat"));
    }
    // enqueue values other than cat or dog
    @Test void valueTest(){
        Animal lion = new Animal("lion");
        animalShelter.enqueueAnimal(lion);
        assertEquals(null, animalShelter.dequeue("lion"));
    }
}

class balanceBracketsTest{
    BalanceBrackets balanceBrackets = new BalanceBrackets();
    // test  with one open and closing brackets
    @Test void oneTest(){
        assertTrue(balanceBrackets.validateBracket("{}"));
    }
    // test with only opening bracket
    @Test void openTest(){
        assertFalse(balanceBrackets.validateBracket("{"));
    }
    // test with words within backets
    @Test void wordsTest(){
        assertTrue(balanceBrackets.validateBracket("{}{Code}[Fellows](())"));
    }
    // error closing doesn???t match opening .
    @Test void matchTest(){
        assertFalse(balanceBrackets.validateBracket("[}"));
    }
}
class maxStackTest{

    @Test void oneValueTest(){
        MaxStack maxStack = new MaxStack(2);
        assertEquals(2,maxStack.getMax());
    }
    @Test void negativeValueTest(){
        MaxStack maxStack = new MaxStack(-1);
        assertEquals(-1,maxStack.getMax());
    }
    @Test void multipleValueTest(){
        MaxStack maxStack2 = new MaxStack(-1);
        maxStack2.push(0);
        maxStack2.push(2);
        maxStack2.push(1);
        assertEquals(2,maxStack2.getMax());
    }
}