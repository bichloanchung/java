import java.util.Random;
/*
Create a java program with a do-while loop.
The program should iterate 10 times and print a randomly generated 
integers numbers between 0 and 10. Use the class Random.
*/
public class Exercise06{
    public static void main(String[] args){
        Random rdNumber = new Random();
       // int radoIng = radoNb.nextInt(11);
       // System.out.println("Single value "+radoIng);
        int i = 0;
        do {
            int x = rdNumber.nextInt(11);
            System.out.println(x);
            i++;
        }while (i < 10);
    }

}