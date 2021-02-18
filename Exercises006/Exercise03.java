import java.util.Scanner;

public class Exercise03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String myStr = sc.nextLine();
        // myStr.charArt(0);
        char myStrArr[] = myStr.toCharArray();
        int N = myStr.length();
        boolean isPalindrome = true;

        for (int i = 0; i< Math.round(N/2); i++){
            if (myStrArr[i]!=myStrArr[N-1-i]){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println("This is a palindrome");
        else
            System.out.println("This is not a palindrome");            
    }
}