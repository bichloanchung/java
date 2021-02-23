import java.util.Scanner;
public class n_factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int sumF = 1;
        System.out.print("Input n = ");
        n = sc.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++){
            sumF = sumF * (n-i);
            //System.out.println(n-i);
        }
        System.out.println("The factorial of "+n+" is:\n "+n+"! = "+sumF);
    }

}