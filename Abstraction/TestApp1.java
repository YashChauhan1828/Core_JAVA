package Abstraction;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.Test1();
		obj.Test2();
		obj.Test5();
		
		A objA = new B();
		objA.Test1();
		objA.Test2();
		
		if(objA instanceof B)
		{	
			((B) objA).Test3();
		}
		 if(objA instanceof B)
		{
			B objB = (B)objA;
			objB.Test4();
		}
	}
}
