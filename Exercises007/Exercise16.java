import java.util.*;
public class Exercise16{
    public static void main(String[] args){
        Random rd = new Random();
        int ageUser1;
        int ageUser2;
        
        ageUser1 = rd.nextInt(51);
        ageUser2 = rd.nextInt(51);
        System.out.println("The age of user 1 is: "+ageUser1);
        System.out.println("The age of user 2 is: "+ageUser2);

        int ageMax = Math.max(ageUser1,ageUser2); 
        if (ageMax == ageUser1){
            System.out.println("The user 1 is the oldest!");
        }else{
            System.out.println("The user 2 is the oldest!");
        }
        if (ageUser1 == ageUser2){
            System.out.println("They are the same age!");

        }

        
    }
}