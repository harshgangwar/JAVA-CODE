class Construtor
{
	int i;

	private Construtor(int i)
	{
		this.i=i;
	}

	public static void main(String... harsh)
	{
		Construtor c=new Construtor(20);
		System.out.println(c.i);
		Construtor c2=new Construtor(80);
		System.out.println(c2.i);

	}
}
class Base extends Construtor
{
	Base()
	{
	super(50);
	}

}