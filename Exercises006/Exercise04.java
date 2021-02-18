import java.util.Scanner;
public class Exercise04{
    public static void main(String[] args){
        String arrStr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input with 1 space between 2 numbers: ");
        arrStr = sc.nextLine();
        System.out.println("String is: "+arrStr);
        String[] arrValue = arrStr.split(" ");
        /*for (int i = 0; i< arrValue.length; i++){
            System.out.println(arrValue[i]);
        }*/
        int[] intArr = new int[arrValue.length];
        for (int j = 0; j < intArr.length; j++){
            intArr[j] = Integer.parseInt(arrValue[j]);
        }
        for (int i = 0; i< arrValue.length; i++){
            System.out.print(intArr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < intArr.length-1; i++){
            if (intArr[i] == 0){
                intArr[i] = intArr[i+1];
            }
        }
        if (intArr[intArr.length-1] == 0){
            intArr[intArr.length-1] = intArr[0];
        }

        for (int i = 0; i< arrValue.length; i++){
            System.out.print(intArr[i]+" ");
        }
        System.out.println();

    }
}