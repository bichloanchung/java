import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		ArrayList<Integer> arrOfInt = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		//System.out.println(arrOfInt.toString());
		Collections.shuffle(arrOfInt);
		int pos5 = arrOfInt.indexOf(5);
		Scanner sc = new Scanner(System.in);
		int posG = pos5 -1;
		System.out.println("Where is the index of 5 (between 0-9)? \nYou have 3 times to guess.");
		
		for (int iTrial = 0; iTrial < 3; iTrial++) {
			System.out.println("Trial "+(iTrial+1));
			System.out.print("I think :  ");
			posG = sc.nextInt();
			if (posG == pos5 ) {
				break;
			}else {
				if (iTrial < 2)
					System.out.println("Wrong ... Please try again!");
			}
		}
		
		if (posG == pos5) {
			System.out.println("You get a prize! Congratulation!");
		}else
			System.out.println("You don't get a prize...");
		
		System.out.println("Here is the result ^^");	
		System.out.println(arrOfInt.toString());
	}

}
