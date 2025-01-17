package Encapsulation;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s0 = new Student();
		Student s1 = new Student(2,"raj",12,90.0);
		Student s2 = new Student(s1);
		System.out.println(s0.getRno()+ " "+s0.getName()+" " +s0.getMarks()+" " +s0.getStd()+" ");
		System.out.println(s1.getRno()+ " "+s1.getName()+" " +s1.getMarks()+" " +s1.getStd()+" ");
		System.out.println(s2.getRno()+ " "+s2.getName()+" " +s2.getMarks()+" " +s2.getStd()+" ");
	}
}
