import java.util.*;
/*The program where have 2 array of int[10], use Arrays.sort() and Arrays.toString()
 *to print the elements of the arrays
 */
public class Exercise01 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] inArr1 = new int[10];
		int[] inArr2 = new int[10];
		for (int i = 0; i < inArr1.length; i++) {
			inArr1[i] = rd.nextInt(21);
		}
		Arrays.sort(inArr1);
		System.out.println("The 1st random values is: \n"+Arrays.toString(inArr1));
		
		/*
		System.out.println("The random values is: ");
		for (int i = 0; i < inArr1.length; i++) {
			System.out.print(inArr1[i]+" ");
		}*/
		for (int j = 0; j < inArr2.length; j++) {
			inArr2[j] = rd.nextInt(21);
		}
		Arrays.sort(inArr2);
		System.out.println("The 2st random values is: \n"+Arrays.toString(inArr2));
		
	}

}
