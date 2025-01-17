package String_methods;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		String name1 = "Yash";
		
		char name[] = name1.toCharArray();
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		byte b[] = name1.getBytes();
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println("b["+i+"] "+b[i]+"---"+name1.charAt(i)); //Returns ASCII value
		}
		
		int no1 = 20;
		int no2 = 30;
		String strNo1 = String.valueOf(no1);
		String strNo2 = String.valueOf(no2);
		
		System.out.println("Addition : " +(strNo1+strNo2));
		
		String Strno3 = "30";
		String Strno4 = "40";
		
		int no3 = Integer.parseInt(Strno3);
		int no4 = Integer.parseInt(Strno4);
		
		System.out.println("Addition : " +(no3 + no4));
	
		String name2 = "Royal";
		String name3 = new String("Royal").intern();
		
		System.out.println("name2 == name3 : "+(name2==name3));
	}
}
