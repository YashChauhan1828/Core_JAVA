package String_methods;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		String name1 = "Yash";
		String name2 = "Chauhan";
		String name3 = name1.concat(name2);
		System.out.println("name3 : "+name3);
		
		String value1 = "My name is Yash Chauhan";
		String value2 = value1.replace("is", "was");
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
	
		String words[] = value1.split("\\s");
		System.out.println("words.length : "+words.length);
		for (int i = 0; i < words.length; i++) 
		{
			System.out.println("Words["+i+"] : "+words[i]);
		}
	}
}
