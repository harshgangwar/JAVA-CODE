class Base
{

       void f1()
		{
		    System.out.println("base class function");
		}

	public static void main(String... harsh)
	{

		Base b=new Child();
		b.f1();

		System.out.println("base class");
		
	}
}

class Child extends Base
{
	void f1()
		{
		    System.out.println("child class function");
		}
}