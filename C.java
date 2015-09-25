abstract class A
{
	public void f1()
	{

		System.out.println("hrash");
	}
	abstract public void f2();
}

abstract class B extends A
{
	

}
class C extends B
{

	public void f2()
	{
		System.out.println("override");
	}

	public static void main(String... harsh)
	{

			C obj=new C();
			obj.f1();
			obj.f2();

	}


}