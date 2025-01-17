package String;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String name1 = "Royal";
		System.out.println("Name 1 :"+name1+" HashCode "+name1.hashCode());
		name1 = "Technosoft";
		System.out.println("Name 1 :"+name1+" HashCode "+name1.hashCode());
		name1.concat("pvt ltd");
		System.out.println("Name 1 :"+name1+" HashCode "+name1.hashCode());
		name1 = name1.concat(" pvt ltd ");
		System.out.println("Name 1 :"+name1+"HashCode "+name1.hashCode());
	}
}
