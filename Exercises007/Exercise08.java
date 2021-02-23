import java.lang.Math;
/*
Create a java program in which you instantiate a double value 10.0 and prints the division of 
the value of the variable by 0.84 and also the rounded value of this variable divided by 0.84.
(Hint: use the method Math.round())
*/
public class Exercise08{
    public static void main(String[] args){
        double x = 10.0;
        double y = 10.0 / 0.84;
        double y1 = Math.round(10.0/0.84);
        System.out.println("x = "+x);
        System.out.println("The value of "+x+" / 0.84 = "+y);
        System.out.println("The rounded value of "+x+" / 0.84 = "+y1);
    }
}