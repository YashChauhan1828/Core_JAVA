package IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[3];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		try
		(
				FileOutputStream fout = new FileOutputStream("StudentList.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
		)
		{
			out.writeObject(s);  
			System.out.println("Success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
