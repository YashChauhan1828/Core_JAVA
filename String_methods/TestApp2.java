package String_methods;

public class TestApp2 
{
	public static void main(String[] args) {
		
	
		String name1 = "Yash";
		String name2 = "Yash";
		String name3 = "YASH";
	
		System.out.println( "name1.equals(name2) : " +name1.equals(name2));
		System.out.println( "name1.equals(name3) : " +name1.equals(name3));
		System.out.println( "name1.equalsIgnoreCase(name3) : " +name1.equalsIgnoreCase(name3));
	
		int flag = name1.compareTo(name2);
		System.out.println("flag : " + flag);
		flag = name1.compareTo(name3);
		System.out.println("flag : " + flag);
		
		flag = name1.compareToIgnoreCase(name3);
		System.out.println("flag : " + flag);
	}
}
