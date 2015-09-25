import java.util.Scanner;
class StringReplace
{
	static String t="*",str1,str2;
	public static void main(String... harsh)
	{

		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		//System.out.println(str1);
		System.out.println("\nenter a sub string");
		str2=sc.nextLine();
		//System.out.println(str2);
		int in=str1.indexOf(str2);
		if(in==-1)
		{
			System.out.println("word is not found");
			System.exit(0);

		}
		
		else
		{
		   for(int i=0;i<str2.length()-1;i++)
		   t+="*";

		   System.out.println("output\n" + str1.replace(str2,t));

	    }

	}
}		