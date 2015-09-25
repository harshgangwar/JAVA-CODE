import java.util.Scanner;
public class Second
{
	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		for(int i=0;i<no1;i++)
		{
			int no2=sc.nextInt();
			int no3=sc.nextInt();
			int sum=solveSec(no2,no3);
			System.out.println(sum);
		}
	}
	static int solveSec(int a,int b)
	{
		return a+b;
	}
}