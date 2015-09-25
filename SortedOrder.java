import java.util.Scanner;
class SortedOrder
{
	static String fun(String s)
	{
		String nw="";
		for(int i=0;i<s.length()-1;i++)
		{
			int c1=(int) s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				int c2=(int) s.charAt(j);
				if(c1>c2)
				{
					int temp=c2;
					c2=c1;
					c1=temp;
					//s.charAt(i)=(char)c2;
					//s.charAt(j)=(char)c1;


			}
		}
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			nw=nw.concat(""+ch1);
		}
		return nw;
	}

	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		String r=fun(in);
		System.out.println(r);
	}
}