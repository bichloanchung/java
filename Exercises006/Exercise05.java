import java.util.Scanner;
import java.util.Random;
public class Exercise05{
    public static void main(String[] args){
        int[] arrN = {12, 13, 14, 15, 16};
        boolean ascending =  true;
        for (int i = 0; i < arrN.length-1; i++){
            if ((arrN[i] > arrN[i+1])){
                    ascending = false;
                    break;
            }  
        }
        System.out.println(ascending);
         
    }
}