import java.util.Scanner;
/*
Create a java program that requests a name from the user and prints its length.
(Hint: use the method length() ).
*/
public class exercise01{
    public static void main(String[] args){
        String naMe;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        naMe = sc.nextLine();
        System.out.println("Your name is: "+naMe);
        System.out.println("Your name lenght is "+naMe.length());
    }
}