package IO;

import java.io.FileInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\ocjp21\\List.txt");
			int temp;
			while((temp = fin.read())!=-1)
			{
				char value = (char)temp;
				sb.append(value);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	System.out.println("String is : "+sb);
	}
}
