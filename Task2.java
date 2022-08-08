package Task9;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>a=new ArrayList<String>();
a.add("Red");
a.add("Blue");
a.add("Green");
a.add("Yellow");
System.out.println("Before adding"+a);
a.add(0,"White");
a.add(2,"Black");
System.out.println("After Adding"+a);
	}

}
