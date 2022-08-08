package Task9;

import java.util.LinkedList;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     LinkedList<String> a = new LinkedList<String>();
	            a.add("Red");
	            a.add("Green");
	            a.add("Black");
	            a.add("Pink");
	            a.add("orange");
	     System.out.println("Original linked list:" + a);  
	      Object first_element = a.getFirst();
	      System.out.println("First Element is: "+first_element);
	      Object last_element = a.getLast();
	      System.out.println("Last Element is: "+last_element);

	}

}
