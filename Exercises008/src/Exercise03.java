import java.util.*;
public class Exercise03 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayOfIntegers = new ArrayList<Integer>();
		Random rd = new Random();
		for (int i = 0; i < 15; i++) {
			arrayOfIntegers.add(rd.nextInt(10)+1);
		}
		System.out.println(arrayOfIntegers.toString());
		
		int id1 = arrayOfIntegers.indexOf(1);
		int id2 = arrayOfIntegers.indexOf(2);
		if (id1 == -1) {
			System.out.println("There is not number 1 in array!");
		}else {
			System.out.println("The 1st number 1 find in index "+id1);
			if (id1 < id2) {
				System.out.println("There is a 1 before a 2. The position of 2 is "+id2);
			}else {
				System.out.println("There is not number 2 after number 1!");
			}
		}
		/* the syntax used for find out the position of a 1 by usual way 
		 * for (int i = 0; i < arrayOfIntegers.size(); i++) {
			if (arrayOfIntegers.get(i) == 1) {
				System.out.println("The 1st number 1 finds in index "+i);
				break;
			}
		}*/
		/* the syntax used for find out number 2 after number 1
		 * if (id1 != -1) {
			for (int i = id1; i < arrayOfIntegers.size(); i++) {
				if (arrayOfIntegers.get(i) == 2) {
					id2 = i;
					break;
				}
			}
			
			if (id2 > -1) {
				System.out.println("The 1st number 2 find in index "+id2);
			}else {
				System.out.println("There is not number 2 after number 1");
			}
		}*/
	}
}
	
