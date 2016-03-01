import java.util.*;
class Dristi
{
     
	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n;
		int sum=0,t=0;
		while(n!=0)
		{
		t=n%10;
		n/=10;
		sum+=t;
		}
		if(n1%sum==0)
		System.out.println("yes it's divisible");
		else 
			System.out.println("Not divisible");
	}

}