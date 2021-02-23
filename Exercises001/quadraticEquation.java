import java.util.Scanner;
import java.lang.Math;
public class quadraticEquation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Input 3 values of a,b,c");
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
        if (a == 0){
            if (b == 0){
                System.out.println("Equation hasn't solution!");
            }else{
                System.out.println("This is a linear equation and has one solution: "+"x = "+(-c/b));

            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1, x2;
        if (delta > 0){
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Equation has 2 solutions: \n"+"x1 = "+x1+"\n"+"x2 = "+x2+"\n");
        }else if (delta == 0){
            x1 = (-b / 2*a);
            System.out.println("Equation has double soulution: \n "+"x1 = x2 = "+x1);
        }else{
                System.out.println("Equation hasn't solution!");
            
        }
    }
}