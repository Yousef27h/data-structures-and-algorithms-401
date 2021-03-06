/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion.sort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] arr1 = {8,4,23,42,16,15};
        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {20,18,12,8,5,-2};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {5,12,7,5,5,7};
        insertionSort(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {2,3,5,7,13,11};
        insertionSort(arr4);
        System.out.println(Arrays.toString(arr4));
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i<arr.length; i++){
            int j = i-1;
            int temp = arr[i];

            while (j>=0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }
}
