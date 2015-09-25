import java.util.Scanner;
public class Ass3
{
	static int count=0;
	static char ch;
	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		//int len=in.length();
		for(int i=0;i<in.length()-1;i++)
		{
			count=0;
			for(int j=i+1;j<in.length();j++)
			{
				if(in.charAt(i)==in.charAt(j))
				{
					if(in.charAt(i)!='*')
					{
					ch=in.charAt(i);
					in=in.substring(0,i)+ "*" +in.substring(i+1);
					count++;
				}
				}
			}
			System.out.println(ch + " " + count);
		}

   

	}


}