package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listobj = new ArrayList();
		
		listobj.add(true);
		listobj.add(12);
		listobj.add('y');
		listobj.add("Yash");
		listobj.add(12.43f);
		listobj.add(1213452424L);
		listobj.add(1212.331);
		Student s = new Student(1 , "Yash" , 12);
		listobj.add(s);
		
		System.out.println("listobj.size() : "+listobj.size());
		
		for (int i = 0; i < listobj.size(); i++) 
		{
			System.out.println("listobj.get("+i+") : "+listobj.get(i));
		}
		
		System.out.println("Through for each method");
		
		for(Object obj : listobj)
		{
			System.out.println(obj);
		}
		
		System.out.println("Through Iterator method");
		 
		 Iterator itr = listobj.iterator();
		 while(itr.hasNext())
		 {
			 Object obj = itr.next();
			System.out.println(obj);   
		 }
		 
		 System.out.println("Through Stream API method");
		 
		 listobj.stream().forEach(obj->System.out.println(obj));
	}
}
