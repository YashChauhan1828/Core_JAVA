package IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1 , "Yash" , 13);
		try
		(
				FileOutputStream fout = new FileOutputStream("Student.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
		)
		{
			out.writeObject(s1);
			System.out.println("Success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
