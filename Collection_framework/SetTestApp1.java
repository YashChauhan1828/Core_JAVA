package Collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTestApp1 
{
	public static void main(String[] args) 
	{
//		HashSet<String> list = new HashSet<String>();
//		LinkedHashSet<String> list = new LinkedHashSet<String>();
		TreeSet<String> list = new TreeSet<String>();
		list.add("yash");
		list.add("raj");
		list.add("harish");
		list.add("zakir");
		list.add("esha");
		list.add("aakash");
		list.add("nirmit");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		list.stream().forEach(obj->System.out.println(obj));
	}
}
