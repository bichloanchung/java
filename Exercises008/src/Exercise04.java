import java.util.*;
public class Exercise04 {

	public static void main(String[] args) {
		ArrayList<Integer> arrOfInt = new ArrayList<Integer>();
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
			arrOfInt.add(rd.nextInt(20)+1);
		}
		System.out.println("The values are : \n"+arrOfInt.toString());
		
		int sumX = 0;
		for (int i = 0; i < arrOfInt.size(); i++) {
			if (arrOfInt.get(i) == 5) {
				sumX +=1;
			}
		}
		if (sumX >0) {
			System.out.println("Array has number 5 with "+sumX+" times");
		}else {
			System.out.println("Arrays hasn't number 5...");
		}
	}

}
