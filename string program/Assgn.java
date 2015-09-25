import java.util.Scanner;
public class Assgn
{
	static int flag,flag1;
	static int wordCount(String h)
	{
		for(int i=0;i<h.length();i++)
		{
			if(h.charAt(i)== ' ')
			{
				flag++;
			}

		}
		return flag-1;
	}

	static int charCount(String h)
	{
		for(int i=0;i<h.length();i++)
		{
			if(h.chaAt(i)!= ' ')
			{
				flag1++;
			}

		}
		return flag1;
	}

	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		int re=wordCount(in);
		int re1=charCount(in);
		System.out.println("result is " + re);
		System.out.println("result is " + re1);
	}
}