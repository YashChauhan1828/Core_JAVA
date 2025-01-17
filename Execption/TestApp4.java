package Execption;

import java.io.IOException;
import java.util.Scanner;

public class TestApp4 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Not Eligible for voting.Enter age greater than 18");
		}
		else
		{
			System.out.println("Eligible for voting");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try
		{
		isValidForVote(age);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Execution block after try..catch ");
	}
}
