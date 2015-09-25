import java.util.*;
public class CollectionDemo
{
	public static void main(String... harsh)
	{


		List<Emp> al=new LinkedList<Emp>();
		Emp e1=new Emp(1001,"harsh",23);
		Emp e2=new Emp(1002,"gangwar",25);
		Emp e3=new Emp(1003,"faffa",56);
		al.add(e1);
		al.add(e2);
		al.add(e3);

		System.out.println("\nusing Iterator");
		Iterator i=al.iterator();
		while(i.hasNext())
		{

			Emp ee=(Emp)i.next();
			System.out.println(ee.id +" " + ee.name + " " + ee.age + " ");
		}
      System.out.println(" \nusing foreach loop");

      for(Emp obj:al)
       System.out.println(obj.id + " "+obj.name+" "+obj.age);//.id + " " + obj.name +" " + obj.age + " ");


	}
}

class Emp
{
	int id;
	String name;
	int age;
	Emp(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;

	}
	



}