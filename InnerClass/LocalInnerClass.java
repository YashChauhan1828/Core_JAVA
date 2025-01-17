package InnerClass;

public class LocalInnerClass 
{
	private int no = 100;
	
	 void display()
	{
		class B 
		{
			void show()
			{
				System.out.println("No : "+no);
			}
		}
		B objb = new B();
		objb.show();
	}
	public static void main(String[] args) 
	{
		LocalInnerClass A = new LocalInnerClass();
		A.display();
		
	}
}
