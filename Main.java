public class Base 
{
	public void display()
	{
		System.out.println("DIsplay from Base");
	}
	public  void printff()
	{
		System.out.println("printfff from Base");
	}
	
}

public class Child extends Base
{
	public void display()
	{
		System.out.println("DIsplay from Child");
	}
	public void printff()
	{
		System.out.println("printfff from Child");
	}
	
}

Class Main
{
	public static void main(String... harsh)
	{


	//	Base b=new Base();
	//	b.display();
	//	b.printff();

	//	Child c=new Child();
	//	c.display();
	//	c.printff();
		
		Base b1=new Child();
		b1.display();
		b1.printff();

	/*	Child c1=(Child)b1;
		c1.display();
		c1.printff();
	*/

	}
}