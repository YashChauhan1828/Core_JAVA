package InnerClass;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		AbstractInnerClass A = new AbstractInnerClass() {
			
			@Override
			public void test1() {
				System.out.println("test1");
				
			}
		}; 
		
		A.test1();
	}
}
