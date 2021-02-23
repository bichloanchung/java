import java.util.*;
public class Exercise05 {

	public static void main(String[] args) {
		Random rd = new Random();
		ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			ArrayList1.add(rd.nextInt(20)+1);
		}
		
		ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			ArrayList2.add(rd.nextInt(20)+21);
		}
		
		System.out.print("ArrayList1 = ");
		for (int i = 0; i < ArrayList1.size(); i++) {
			System.out.print(ArrayList1.get(i)+",");
		}
		
		System.out.print("\nArrayList2 = ");
		for (int i = 0; i < ArrayList2.size(); i++) {
			System.out.print(ArrayList2.get(i)+",");
		}
		
		ArrayList1.addAll(ArrayList2);
		System.out.print("\nFinalArray = ");
		for (int i = 0; i < ArrayList1.size(); i++) {
			System.out.print(ArrayList1.get(i)+",");
		}
	}
}
