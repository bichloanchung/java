import java.util.*;
/*
Create a java program. Your program should print the result of the factorial of 
a randomly picked integer number between 0 and 10.
The number should be generated by the class Random. You should also use a for loop.
(Hint1: 0! = 1. Hint2: 1! = 1. Hint3: factorial of n; n! = 1*2*…*n-1*n. )
*/
public class Exercise13{
    public static void main(String[] args){
        Random rd = new Random();
        int x = rd.nextInt(11);
        int X_factorial = 1;
        for (int i = 0; i < x; i++){
            X_factorial = X_factorial * (x-i);
            //System.out.println(x-i);
        }
        System.out.println("The factorial of "+x+" is: "+X_factorial);
    }
}
