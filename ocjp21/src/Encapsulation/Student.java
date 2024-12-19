package Encapsulation;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private double marks;

// Ways to store data in object
	
//1) Constructor way
	
//	1)Default Constructor:
	
	public Student()
	{
		System.out.println("Start : Default Constructor");
		rno =1;
		name="Yash";
		std=12;
		marks=99.0;
		System.out.println("Exit : Default Constructor");
	}
	
//	2) Paramayerized Constructor
	
	public Student(int rno , String name , int std , double marks)
	{
		System.out.println("Start: Parameterzied Constructor");
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	
//	3) copy Constructor:
	
	public Student(Student s)
	{
		System.out.println("Start:Copy Constrctor");
		rno=s.rno;
		name=s.name;
		std=s.std;
		marks=s.marks;
	}
	
// 2)Method WAY:	
	
//public--->Setter and getter

//Setter
	
	public void setRno(int rno)
	{
		this.rno = rno;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setStd(int std)
	{
		this.std = std;
	}
	public void setMarks(int marks)
	{
		this.marks= marks;
	}
	
// Getter
	
	public int getRno()
	{
		return rno;
	}
	public String getName()
	{
		return name;
	}
	public int getStd()
	{
		return std;
	}
	public double getMarks()
	{
		return marks;
	}
}
