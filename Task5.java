package Task9;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>x=new ArrayList<String>();
		x.add("Audi");
		x.add("BMW");
		x.add("KTM");
		x.add("Benz");
		x.add("Ferrai");
		System.out.println("Before Deleting"+x);
		x.remove(2);
		System.out.println("After Deleting"+x);
	}

}
