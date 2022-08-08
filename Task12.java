package Task9;

import java.util.LinkedList;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> a = new LinkedList <String> ();
		a.add("Red");
		a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("Original linked list: ");
		System.out.println("Let add the Yellow color after the Red Color: " + a);
		a.add(1, "Yellow");
		System.out.println("The linked list:" + a);
	}

}
