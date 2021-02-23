import java.util.ArrayList;
import java.util.Arrays;

public class Exercise06 {

	public static void main(String[] args) {
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Tenent mordicus. Plane idem, inquit, et maxima quidem, qua fieri nulla maior potest. Hoc est non dividere, sed frangere. Duo Reges: constructio interrete. Propter nos enim illam, non propter eam nosmet ipsos diligimus. Conferam tecum, quam cuique verso rem subicias; Naturales divitias dixit parabiles esse, quod parvo esset natura contenta. Nulla erit controversia.";
		//String str = "i feel very happy to do this exercise";
		ArrayList<Character> arrChar = new ArrayList<Character>();
		System.out.println("Here is the character of the string!");
		for (int i=0; i<str.length(); i++) {
			arrChar.add(str.charAt(i));
			//System.out.println(str.charAt(i));
		}
		System.out.println(arrChar);

		ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a','e','o','u','i','A','O','E','U','I'));
		//System.out.println(vowels);

		int sumV = 0;
	
		for (int i = 0; i < arrChar.size(); i++) {
			char x = arrChar.get(i);
			if (vowels.contains(x)) {
				sumV++;
			}
		}
		System.out.println("Total vowels in array is : "+sumV);

	}

}
