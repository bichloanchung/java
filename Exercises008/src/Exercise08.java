import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		ArrayList<Integer> arrOfInt = new ArrayList<Integer>();
		Random rd = new Random();
		for (int i = 0; i < 50; i++) {
			arrOfInt.add(rd.nextInt(3));
		}
		System.out.println(arrOfInt.toString());
		int freq0 = Collections.frequency(arrOfInt, 0);
		int freq1 = Collections.frequency(arrOfInt, 1);
		int freq2 = Collections.frequency(arrOfInt, 2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Which number has the most frequency? (0/1/2) : ");
		int x = sc.nextInt();
		if (x == 0) {
			// check freq0 is maximum
			if (freq0 > freq1 && freq0 > freq2) {
				System.out.println("Congratulation...You wins a prize!");
			}else
				System.out.println("You get nothing...Try again :)");
		}
		if (x ==1) {
			// check freq1 is maximum
			if (freq1 > freq0 && freq1 > freq2) {
				System.out.println("Congratulation...You wins a prize!");
			}else
				System.out.println("You get nothing...Try again :)");
		}
		if (x ==2) {
			// check freq2 is maximum
			if (freq2 > freq1 && freq2 > freq0) {
				System.out.println("Congratulation...You wins a prize!");
			}else
				System.out.println("You get nothing...Try again :)");
		}
		System.out.println("Here is the result:");
		System.out.println("Frequency of 0: "+freq0);
		System.out.println("Frequency of 1: "+freq1);
		System.out.println("Frequency of 2: "+freq2);
		
	}

}
