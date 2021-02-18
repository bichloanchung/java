import java.util.Scanner;
public class Exercise07{
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are user? ");
        System.out.print("The user are: ");
        age = sc.nextInt();
        if (age >= 18){
            System.out.println("The user is not a minor!");
        }else
            System.out.println("The user is a minor!");

    }
}