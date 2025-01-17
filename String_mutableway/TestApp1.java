package String_mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		StringBuilder sb = new StringBuilder("Yash");
		StringBuilder sb = new StringBuilder("Yash");
		
		System.out.println("sb : "+sb+"---"+sb.hashCode());
		
		sb.append(" Chauhan");
		
		System.out.println("sb : "+sb+"---"+sb.hashCode());
		
		sb.reverse();
		
		System.out.println("sb : "+sb+"---"+sb.hashCode());
	}
}
