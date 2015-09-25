import java.util.Scanner;
class Ass4
{
	static int arr[]=new int[52];
	static int t,d,te;
		static char ch;
	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();

		for(int i=0;i<in.length();i++)
		{
			//flag=0;
			ch=in.charAt(i);
			if(ch>=65&&ch<=90)
			{
		//	t=ch;
			d=ch-65;
			
			}
			else if(ch>=97&&ch<=122)
			{
				d=ch-97+26;
			}
			arr[d]++;
		}		
		for(int j=0;j<52;j++)
		{
			if(arr[j]!=0)
			{
				if(ch>=65&&ch<=90)
				 te=65+j;
			else if(ch>=97&&ch<=122)
				te=97+j-26;
				System.out.println((char)te + "    " + arr[j] );
			}
		}
	}
}