package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		
		try
		(
				FileInputStream fin = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\ocjp21\\Student.txt"); 
				ObjectInputStream in = new ObjectInputStream(fin);
		)
		{
			Student s1 = (Student)in.readObject();
			s1.display(); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
