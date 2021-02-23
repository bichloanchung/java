import java.util.Scanner;
public class playWNumber{
    public static void main(String[] args){
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Input a: ");
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("a should be a number!");
            return;
        }
               
        try{
            System.out.print("Input b: ");
            b = sc.nextInt();
        }catch(Exception e){
            System.out.println("b should be a number!");
            return;
        }
        
        System.out.println("----------------------");
        System.out.println("Result of a + b = "+(a+b));
        System.out.println("Result of a - b = "+(a-b));
        System.out.println("Result of a * b = "+(a*b));

        try{
            System.out.println("Result of a / b = "+(a/b));
            System.out.println("Result of a mod b = "+(a%b));
        }catch(ArithmeticException e){
            System.out.println("A divisor has to different with '0' !\n-----Please try again! ^^-------");
        }
    }
}
