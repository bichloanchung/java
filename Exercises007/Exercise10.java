import java.util.Scanner;
import java.lang.Math;
/*
Create a java program where you calculate the area of a circle. 
Your program should instantiate a double variable called radius and 
then print the area of the circle. 
(Hint1: The formula to calculate the area of a circle is: A=π〖.r〗^2 . 
Hint2: Use Math.PI. Hint3: Use Math.pow())
*/
public class Exercise10{
    public static void main(String[] args){
        //calculate the area of a circle
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.print("Input the radius of a circle, r = ");
        r = sc.nextDouble();
        double circle_A = Math.PI * Math.pow(r,2);
        System.out.println("\nThe area of the circle is: "+circle_A);
    }
}