import java.util.*;
import java.lang.*;
public class Exercise15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radiansY;
        System.out.print("Input the value in radians: ");
        radiansY = sc.nextDouble();
        double degreesY = Math.toDegrees(radiansY);
        System.out.println("The result of the conversion of "+radiansY+" in radians is "+degreesY+" in degrees!");
    }
}