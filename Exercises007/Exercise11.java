import java.util.Random;
/*
Create a java program. Your program should have an array of integers a for loop of 30 iterations.
At each iteration store a random integer between 0 and 10 within the array of integers. Use a 
for loop for printing the values stored in the array. 
Finally, print how many 5 exist within the array
*/
public class Exercise11{
    public static void main(String[] args){
        Random rd = new Random();
        int[] intArr = new int[30];
        int sumX = 0;
        for (int i = 0; i < 30; i++){
            intArr[i] = rd.nextInt(11);
            //intArr[i]=x;
            //System.out.println(x);

        }
        System.out.println("Input array is: ");
        for (int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i]+" ");
        }

        for (int i = 0; i < intArr.length; i++){
            if (intArr[i] == 5){
                sumX += 1; 
            }
        }

        System.out.println("\nThe number 5 exist "+sumX+" times");
    }
}