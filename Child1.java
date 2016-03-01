 class Base1
{
	public void dis()
	{
		System.out.println("base class");
	}
}
 class Child1 extends Base1
{
	public void dis()
	{
		System.out.println("child class");
	}

	public static void main(String... h)
	{
		Base1 b=new Base1();
		b.dis();
		Child1 c = new Child1();
		c.dis();
		Base1 b1=new Child1();
		b1.dis();
		Child1 c1=(Child1)b1;
		c1.dis();
	}
}