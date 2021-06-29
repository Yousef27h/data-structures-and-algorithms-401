import java.lang.*;

class HelloWorld {
    public static void main(String[] args) {
        int[] arr ={-131, -82, 0, 27, 42, 68, 179};
        int var = 42;
        binary(arr,var);
    }
    public static void binary(int[] arr, int var){
        int l = 0;
        int r = arr.length-1;
        // System.out.println(r);
        // System.out.println((int) Math.floor(l+r/2));
        while(l <= r){
            int middle = (int) Math.floor(l+r/2);
            if (arr[middle] < var){
                l = middle + 1;
            }else if(arr[middle] > var){
                r = middle-1;
            }else{
                System.out.println(middle);
            }
        } 
    }
}