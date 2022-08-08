package Task9;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>x=new ArrayList<String>();
		x.add("Audi");
		x.add("BMW");
		x.add("Benz");
		x.add("Range Rover");
		System.out.println("Before Updating"+x);
		x.set(2, "RollsRoyce");
		System.out.println("After Updating"+x);
	}

}
