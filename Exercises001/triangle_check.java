import java.util.Scanner;
public class triangle_check{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Input the length of the triangle side!");
        System.out.println();
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
        if ((a+b > c) && (a+c > b) && (b+c > a)){
            System.out.println("\n...>>>This is a triangle<<<...");
            if (a == b || b == c || c == a){
                System.out.println("............>>>This is also a isosceles triangle!");
            }
            if(a == b && b == c){
                System.out.println(".................>>>This is also a equilateral triangle");
            }
            if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)){
                System.out.println(".....................>>>This is also a right triangle");
            }
        }else
            System.out.println("\n...>>>This is not a triangle<<<...");
    }
}