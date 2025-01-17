package IO;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable
{
	private int Srno;
	private String name;
	private transient int rno;
	
	public Student(int Srno , String name , int rno )
	{
		this.Srno = Srno;
		this.name = name;
		this.rno = rno;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Srno : ");
		Srno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
	}
	public void display()
	{
		System.out.println(Srno+" "+name+" "+rno);
	}
}
