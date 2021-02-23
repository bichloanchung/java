/*
 * example in class
 */
import java.util.*;
public class Exercise02 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Rafael");
		nameList.add("Julian");
		nameList.add("Maria");
		nameList.add("Anders");
		nameList.add("Rafael");
		System.out.println(nameList.toString());
		System.out.println(nameList.size());
		System.out.println(nameList.lastIndexOf("Rafael"));
		System.out.println(nameList.contains("Maria"));
		System.out.println(nameList.remove("Maria"));
		System.out.println(nameList.contains("Maria"));
		System.out.println(nameList.set(3, "Linda"));
		System.out.println(nameList.indexOf("Anders"));
		System.out.println(nameList.size());
		System.out.println(nameList.get(3));
		nameList.clear();
		System.out.println(nameList.size());
	}

}
