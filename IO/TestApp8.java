package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		try
		(
				FileInputStream fin = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\ocjp21\\StudentList.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
		)
		
		{
			Student s[] = (Student[])oin.readObject();
			
			for (int i = 0; i < s.length; i++) 
			{
				s[i].display();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
