package Collection_framework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTestApp1 
{
	public static void main(String[] args) 
	{
		
		PriorityQueue<String> queobj = new PriorityQueue<String>();
		queobj.add("Yash");
		queobj.add("Raju");
		queobj.add("Shyam");
		queobj.add("Baburao");
		queobj.add("Kabira");
		
		Iterator<String> itr = queobj.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
		
		while(!queobj.isEmpty())
		{
			String name = queobj.poll();
			System.out.println(name);
		}
		
		queobj.stream().forEach(obj->System.out.println(obj));
	}
}
