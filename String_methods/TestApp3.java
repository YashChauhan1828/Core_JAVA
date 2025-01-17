package String_methods;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String name = "Royal Technosoft private Technosoft limited";
		int index = name.indexOf("Technosoft");
		System.out.println("Index : "+index);
		
		index = name.indexOf("Technosoft",10);
		System.out.println("Index : "+index);
		
		index = name.lastIndexOf("Technosoft");
		System.out.println("Index : "+index);
		
		boolean flag = name.contains("Technosoft");
		System.out.println("Flag : "+flag);
	
		flag = name.startsWith("Royal");
		System.out.println("Flag : "+flag);
		
		flag = name.endsWith("limited");
		System.out.println("Flag : "+flag);
	}
}
