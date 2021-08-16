package hashtables;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Hashtable<K,V> {

    private ArrayList<HashNode<K,V>> bucketsArray;
    private int bucketsNum;
    private int hashNodesNum;

    /**
     * Constructor to instantiate new hashtable with specific buckets and hashNode number
     */
    public Hashtable() {
        bucketsArray = new ArrayList<>();
        bucketsNum = 25;
        hashNodesNum = 0;

        for (int i =0 ;i<bucketsNum;i++){
            bucketsArray.add(null);
        }
    }

    /**
     * Gets the hash value of given key
     * @param key
     * @return integer represent hash value of key
     */
    public int getHash(K key){
        return Objects.hashCode(key);
    }

    /**
     * Finds the index of input key value
     * @param key
     * @return integer index
     */
    public int getIndex(K key){
        int hashCode = getHash(key);
        int index = hashCode % bucketsNum;
        index = index < 0 ? index * -1 : index;
        return index;
    }

    /**
     * Finds the value assigned to input key
     * @param key
     * @return value of generic type V
     */
    public V findValue(K key){
        int hashCode = getHash(key);

        int index = getIndex(key);
        HashNode<K,V> head = bucketsArray.get(index);

        while (head!=null){
            if (head.getKey().equals(key) && head.getHashCode()==hashCode){
                return head.getValue();
            }
            head = head.getNext();
        }
        return null;
    }

    public void add(K key, V value){
        int hashcode = getHash(key);
        int index = getIndex(key);
        HashNode<K,V> head = bucketsArray.get(index);

        while (head!=null){
            if (head.getKey().equals(key) && head.getHashCode()==hashcode){
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }

        head = bucketsArray.get(index);
        hashNodesNum++;
        HashNode<K,V> newNode = new HashNode<>(key,value,getHash(key));
        newNode.setNext(head);
        bucketsArray.set(index,newNode);

        if (1.0* hashNodesNum/bucketsNum >= 0.7){
            ArrayList<HashNode<K,V>> temp = bucketsArray;
            bucketsArray = new ArrayList<>();
            bucketsNum = 2 * bucketsNum;
            hashNodesNum = 0;
            for (int i=0; i<bucketsNum;i++){
                bucketsArray.add(null);
            }

            for (HashNode<K,V>  headNode:temp) {
                while (headNode != null){
                    add(headNode.getKey(),headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }

    public V remove(K key){
        int hashCode = getHash(key);
        int index = getIndex(key);

        HashNode<K,V> head = bucketsArray.get(index);
        HashNode<K,V> prev = null;
        while (head!=null){
            if (head.getKey().equals(key) && head.getHashCode()==hashCode){
                break;
            }
            prev = head;
            head=head.getNext();
        }

        if (head==null){
            return null;
        }

        hashNodesNum--;
        if (prev!=null){
            prev.setNext(head.getNext());
        }else {
            bucketsArray.set(index, head.getNext());
        }

        return head.getValue();
    }

    public String getRepeatedWord(String sentence){
        String[] arrayOfWords = splitString(sentence);
        for (String word:
             arrayOfWords) {
            word = word.toLowerCase(Locale.ROOT);
            if (word.isEmpty()) continue;
            int index =getStringIndex(word);
            int hashCode = hashString(word);
            HashNode<K,V> head = bucketsArray.get(index);
            while (head != null){
                if (head.getKey().equals(word) && head.getHashCode()==hashCode){
                    return word;
                }
                head = head.getNext();
            }
            head = bucketsArray.get(index);
            HashNode<K,V> newNode = new HashNode<>((K)word,(V) word, hashCode);
            newNode.setNext(head);
            bucketsArray.set(index, newNode);
        }
        return "There is no repeated word!";
    }

    public int hashString(String word){
        int totalSum = 0;
        for (int i=0; i<word.length();i++){
            totalSum += (int) word.charAt(i);
        }
        return totalSum;
    }

    public int getStringIndex(String word){
        int hashCode = hashString(word);
        int index = hashCode % bucketsNum;
        index = index < 0 ? index*-1 : index;
        return index;
    }
    public String[] splitString(String sentence){
        sentence = sentence.replaceAll("[^a-zA-Z0-9]", " ");
        return sentence.split(" ");
    }
}
