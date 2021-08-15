/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtables;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // test method functionality
    @Test void getRepeatedWordTest(){
        Hashtable<String, String> wordsHashtable = new Hashtable<>();
        assertEquals("a", wordsHashtable.getRepeatedWord("Once upon a time, there was a brave princess who..."));
    }
    // test method functionality when the repeated word is capitalized
    @Test void getRepeatedWordTest2(){
        Hashtable<String, String> wordsHashtable = new Hashtable<>();
        assertEquals("it", wordsHashtable.getRepeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."));
    }
    // test method functionality when repeated word is followed by comma
    @Test void getRepeatedWordTest3(){
        Hashtable<String, String> wordsHashtable = new Hashtable<>();
        assertEquals("summer", wordsHashtable.getRepeatedWord( "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));
    }
}
