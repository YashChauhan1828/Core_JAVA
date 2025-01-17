package Collection_framework;

public class Student 
{
	int rno;
	int std;
	String name;
	public Student()
	{
		
	}
	public Student(int rno  , String name , int std)
	{
		this.name=name;
		this.rno = rno;
		this.std = std;
	}
	public String toString()
	{
		return rno+" "+name+" "+std;
	}
}
