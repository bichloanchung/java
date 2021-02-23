import java.util.Random;
/*
Create a java program that has a for loop of 10 iterations. The program should 
have a variable sum and every time a new iteration is performed, a random value, between 0 and 10, will be generated, 
printed and added to the existing value stored in the variable sum. In the end, you should print the 
total sum and the average value of the values.
*/
public class Exercise07{
    public static void main(String[] args){
        Random rdNumber = new Random();
        int sumN = 0;
        int avgN = 0;
        System.out.println("The random values : ");
        for (int i = 0; i < 10; i++){
            int x = rdNumber.nextInt(11);
            System.out.print(x + " ");
            sumN += x;
        }
        avgN = (sumN / 10);
        System.out.println("\n\nThe total sum of the value w Random: "+sumN);
        System.out.println("The average of the value w Random: "+avgN);
        
    }
}