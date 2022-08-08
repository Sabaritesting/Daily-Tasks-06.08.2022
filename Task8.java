package Task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>x=new ArrayList<String>();
x.add("Audi");
x.add("BMw");
x.add("Benz");
x.add("Ferrai");
System.out.println("List A"+x);
List<String>z=new ArrayList<String>();
z.add("KTM");
z.add("Gixer");
z.add("Hearley Davidson");
z.add("Himalayan Enfield");
System.out.println("List B"+z);
Collections.copy(z, x);
System.out.println("After Changing "+x);
	}

}
