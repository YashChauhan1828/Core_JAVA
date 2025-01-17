package Collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ListTestApp3 
{
	public static void main(String[] args) 
	{
//		ArrayList<String> list = new ArrayList<String>(); useful for insert and display
//		LinkedList<String> list = new LinkedList<String>(); useful for frequent operations of insert , update , delete
		Vector<String> list = new Vector<String>(); // useful when multithreading is applied 
		list.add("Rajesh");
		list.add("Yash");
		list.add("Guru");
		list.add("Jethalal");
		list.add("Satish");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
