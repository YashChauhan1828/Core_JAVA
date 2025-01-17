package Abstraction;

public interface A1 
{
	abstract void test1();
	public abstract void test2();
	static void test3()
	{
		System.out.println("A1 : test3()");
	}
	default void test4()
	{
		System.out.println("A2 : test4()");
		test5(); 
	}
	private void test5()
	{
		System.out.println("A3 : test5()");
	}
}
