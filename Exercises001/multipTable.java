import java.util.Scanner;
public class multipTable{
    public static void main(String[] args){
        int x,t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number:\t");
        x = sc.nextInt();
        System.out.println();
        t = 0;
        for (int i=1; i<=10; i++){
            t=x*i;
            System.out.println(x+" * "+i+" = "+t);
        }
        
     } 
}