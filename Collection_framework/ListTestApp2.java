package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListTestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1 , "Yash" , 12);
		Student s2 = new Student(2 , "Rohit" , 12);
		Student s3 = new Student(3 , "Shyam" , 12);
		Student s4 = new Student(4 , "Dhruv" , 12);
		Student s5 = new Student(5 , "Aanand" , 12);
//	Generics---->Typesafe
		ArrayList<Student> listobj = new ArrayList<Student>();

		listobj.add(s1);
		listobj.add(s2);
		listobj.add(s3);
		listobj.add(s4);
		listobj.add(s5);
		
		listobj.remove(4);
		
//		Iterator<Student> itr = listobj.iterator();
//		while(itr.hasNext())
//		{
//			Object obj = itr.next();
//			System.out.println(obj);
//		}
	
		ListIterator<Student> itr = listobj.listIterator();
		while(itr.hasNext())
		{
			Student s = itr.next();
			System.out.println(s);
		}
		System.out.println("=========================");
		while(itr.hasPrevious())
		{
			Student s = itr.previous();
			System.out.println(s);
		}
	}
}
