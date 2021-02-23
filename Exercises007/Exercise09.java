import java.util.Scanner;
import java.lang.Math;
/*
Create a java program in which you instantiate an integer variable called exponent. 
The program should print the value of 2^n, where n is the exponent. 
(Hint: use Math.pow())
*/
public class Exercise09{
    public static void main(String[] args){
        // exponent
        Scanner sc = new Scanner(System.in);
        int x = 2;
        int n;
        System.out.print("When x = 2 \nInput the exponent, n = ");
        n = sc.nextInt();
        System.out.println("\nResult of 2 powers "+n+" = "+Math.pow(x,n));
    }
}