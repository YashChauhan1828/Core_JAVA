package Abstraction;

public class TestApp3 
{
	public static void main(String[] args) 
	{
	
		B1 b1 = new B1();
		A1 a1 = new B1();
		a1.test1();
		a1.test2();
		a1.test4();
		A1.test3(); 
		if(a1 instanceof B1)
		{
//				((B1) a1).test6();
				B1 b = 	(B1)a1;
				b.test6();
		}
		
//		b1.test1();
//		b1.test2();
//		A1.test3();
//		b1.test4();
	
	}
}
