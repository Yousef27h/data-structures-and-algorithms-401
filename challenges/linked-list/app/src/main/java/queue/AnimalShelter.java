package queue;

import java.util.ArrayList;
import java.util.Locale;

public class AnimalShelter<T> {

    protected ArrayList<Animal> animalArray;

    public ArrayList<Animal> getAnimalArray() {
        return animalArray;
    }

    public AnimalShelter() {
        animalArray = new ArrayList<>();
    }

    /**
     * enqueue to add new animal to list
     * @param animal : an object instance of type Animal
     */
    public void enqueueAnimal(Animal animal){
       animalArray.add(animal);
    }

    // dequeue method to remove dog or cat from our list

    /**
     *
     * @param pref : preferred animal ( dog or cat )
     */
    public T dequeue(String pref){
        pref = pref.toLowerCase();
        int i =0;
        Animal animalVal;
        if (animalArray.isEmpty()){
            return null;
        }else{
            animalVal = animalArray.get(0);
        }
        if (pref == "dog"){
            while (animalVal.getClass() != Dog.class){
                i++;
                animalVal = animalArray.get(i);
            }

            animalArray.remove(animalVal);
        }else if(pref == "cat"){
            while (animalVal.getClass() != Cat.class){
                i++;
                animalVal = animalArray.get(i);
            }

            animalArray.remove(animalVal);
        }else {
            return null;
        }
        return (T) animalVal.getType();
    }


}
