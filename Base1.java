public class Base1
{
	public void dis()
	{
		System.out.println("base class");
	}
}
public class Child extends Base1
{
	public void dis()
	{
		System.out.println("child class");
	}

	public static void main(String... h)
	{
		Base1 b=new Base1();
		b.dis();
		Child c = new Child();
		c.dis();
		Base1 b1=new Child();
		b1.dis();
		Child c1=(Child)b;
		c1.dis();
	}
}