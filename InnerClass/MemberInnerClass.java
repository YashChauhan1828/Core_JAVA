package InnerClass;

public class MemberInnerClass 
{
	private int no =10;
	
	class B
	{
		public void show()
		{
			System.out.println("No : "+no);
		}
	}
	public static void main(String[] args) 
	{
		MemberInnerClass mi = new MemberInnerClass();
		MemberInnerClass.B objb = mi.new B();
		objb.show();
	}
}
