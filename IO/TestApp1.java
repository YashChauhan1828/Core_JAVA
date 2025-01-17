package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		
		byte b[] = name.getBytes();
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("List.txt");
			fout.write(b);
			fout.close();
			System.out.println("Sucessful"); 
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
