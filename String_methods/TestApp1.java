package String_methods;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name = "Yash";
		System.out.println("name.length() : " + name.length());
		System.out.println("name.charAt(0) : " + name.charAt(0));
		for(int i=0;i<name.length();i++)
		{
			System.out.println("name.charAt("+i+") : " + name.charAt(i));
		}
		String name2 = "Royal Technosoft ";
		System.out.println("name2.toLowerCase() " + name2.toLowerCase());
		System.out.println("name2.toUpperCase() " + name2.toUpperCase());
		System.out.println("name2.substring(6) " + name2.substring(6));
		System.out.println("name2.substring(6,16) " + name2.substring(6,16));
		
		String name3 = " Chauhan ";
		String name4 = " ";
		String name5 = "";
		name3 = name3.trim();
//		name4 = name4.trim();
		System.out.println(" name3.trim() : " +name3.length());
		System.out.println(" name4.trim() : " +name4.length());
		System.out.println(" name3.isEmpty() : " +name3.isEmpty());
		System.out.println(" name4.isEmpty() : " +name4.isEmpty());
		System.out.println(" name5.isEmpty() : " +name5.isEmpty());
		System.out.println(" name3.isBlank() : " +name3.isBlank());
		System.out.println(" name4.isBlank() : " +name4.isBlank());
		System.out.println(" name5.isBlank() : " +name5.isBlank());
	}
}
