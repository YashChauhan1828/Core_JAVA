package IO;

import java.io.FileReader;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try
		{
			FileReader fr = new FileReader("C:\\Users\\dell\\eclipse-workspace\\ocjp21\\name.txt");
			int temp;
			
			while((temp = fr.read())!=-1)
			{
				char value = (char)temp;
				sb.append(value);
			}
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("String : "+sb);
	}
}
