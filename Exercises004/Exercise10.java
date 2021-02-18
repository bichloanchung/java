import java.util.Scanner;
public class Exercise10{
    public static void main(String[] args){
        // A store is offering 13% of the price for all its product
        Scanner sc = new Scanner(System.in);
        int orgPrice;
        System.out.print("The original price of this product is : ");
        orgPrice = sc.nextInt();
        System.out.println();
        System.out.println("The new price after offered is : "+(orgPrice*0.87));
    }
}