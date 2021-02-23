import java.util.*;
import java.lang.Math;
public class Exercise14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double degreesX;
        System.out.print("Input the value in degrees: ");
        degreesX = sc.nextDouble();
        double radiansX = Math.toRadians(degreesX);
        System.out.println("\nThe result of the conversion of "+degreesX+" in degrees is "+radiansX+" in radians!");
    }
}