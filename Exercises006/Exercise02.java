import java.util.Scanner;

public class Exercise02{
    public static void main(String[] args){
        //print the values stored in the array in descending order
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        
        //for loop
        /*for (int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        */
        // while loop
        int i = arr.length-1;
        /*while (i>=0){
            System.out.println(arr[i]);
            i--;
        }
        */
        // do while loop
        do{
            System.out.println(arr[i]);
            i--;
        }while (i>=0);
    }
}