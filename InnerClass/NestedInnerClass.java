package InnerClass;

public class NestedInnerClass 
{
	private static int no = 100;
	static class B
	{
		void show()
		{
			System.out.println("No : "+no);
		}
	}
	public static void main(String[] args) 
	{
		NestedInnerClass.B obj = new NestedInnerClass.B();
		obj.show();
	}
}
