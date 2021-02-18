import java.util.Scanner;
import java.util.Random;
public class Exercise08{
    public static void main(String[] args){
        // 8a
        /*int a = 10;
        int b = 20;
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
        System.out.println("      --------          ");
        int temp = a;
        a = b;
        b = temp;
        temp = a;
        System.out.println("Value of a efter switch = "+a);
        System.out.println("Value of b efter switch = "+b);
        */
        // 8b
        /*Scanner sc = new Scanner(System.in);
        double exchangeBrl, exchangeSek;
        System.out.println("How many Brazilian Real would you like to exchange?");
        System.out.println("---------");
        System.out.print("I would like to exchange: ");
        exchangeBrl = sc.nextDouble();
        System.out.println("Wait a minut! The exchange is being processed...");
        System.out.println("-----------/////---------------\n----------->------>------>--------\n--------^^!--------^_^----------");
        exchangeSek = exchangeBrl * 2.64;
        System.out.println("So, you will get "+exchangeSek+" SEK "+"from "+exchangeBrl+" BRL");
        */
        // 8c
        Random rd = new Random();
        int numA,numB;
        numA = rd.nextInt(100);
        numB = rd.nextInt(100);
        System.out.println("Random the first number: "+numA);
        System.out.println("Random the second number: "+numB);
        System.out.println();
        System.out.println("Summation between 2 number random = "+(numA+numB));
        System.out.println("Subtraction between 2 number random = "+(numA-numB));
        System.out.println("Multiplication between 2 number random = "+(numA*numB));
        try{
            System.out.println("Division between 2 number random = "+(numA/numB));
        }catch(Exception e){
            System.out.println("Can't diviser to zero!");
        }
    }
}