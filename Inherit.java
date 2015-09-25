// file name: Main.java
class Base 
{
	 void foo() 
	{ 
		System.out.println("Base");
	}
}

class Derived extends Base 
{
	public void foo()
	 {

		System.out.println("Child");
	 } // compiler error 
}

class Main {
	public static void main(String args[]) {
		Base d = new Derived();
		d.foo();
	}
}
