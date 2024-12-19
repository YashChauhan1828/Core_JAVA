package OOPs;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		
		//s -- reference variable are created in Stack 
		// address<---object
		// Student -- Object -- Run(Instance -- Instance Variable)
		
		System.out.println("s-->"+ s);
		s.rno = 1;
		s.marks = 77;
		s.name = "Yash";
		s.std=12;
		
		System.out.print(s.marks+"\n "+s.rno+"\n "+s.std+"\n "+s.name);
	}
}
