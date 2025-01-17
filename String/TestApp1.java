package String;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		String Equality By ObjectLitereal
		String name1 = "Yash";
		String name2 = "Yash";
		String name3 = "Chauhan";
		String name4 = "Chauhan";
		String name5 = "Yash";
		name1 = "Dharmendra";
		name2 = "Chauhan";
		
//		name3 = name5; 
		
		System.out.println("name1 : name2 "+(name1==name2));
		System.out.println("name2 : name3 "+(name2==name3));
		System.out.println("name3 : name4 "+(name3==name4));
		System.out.println("name4 : name5 "+(name4==name5));
		System.out.println("name1 : name5 "+(name1==name5));
		
//		String Equality By new Keyword
		
		String name6 = new String("Raju");
		String name7 = new String("Bheem");
		name6 = "Bheem";
//		name6 = name7;
		System.out.println("name6 : name7 "+(name6==name7));
	
//		String Equality By ObjectLitereal by 
		System.out.println("name1 : name2 "+(name1.equals(name2)));
		System.out.println("name2 : name3 "+(name2.equals(name3)));
		System.out.println("name3 : name4 "+(name3.equals(name4)));
		System.out.println("name4 : name5 "+(name4.equals(name5)));
		System.out.println("name1 : name5 "+(name1.equals(name5)));

	
	}
}
