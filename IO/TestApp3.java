package IO;

import java.io.FileWriter;
import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		try
		{
			FileWriter fw = new FileWriter("name.txt");
			fw.write(name);
			fw.close();
			System.out.println("Sucessful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
