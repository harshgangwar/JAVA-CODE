import java.util.Scanner;
class Prac14
{

	static String changeCase(String s)
	{
		String nw="";
		for(int i=0;i<s.length();i++)
		{
			int c=(int) s.charAt(i);
			if(90>=c && 65<=c)
			{
				//c+=32;
				nw=nw.concat(""+(char)(c+=32));	
			}
			else 
			{
				//c-=32;
				nw=nw.concat(""+(char)(c-=32));			}
		}
		return nw;
	}

	


	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String r=changeCase(s1);
		System.out.println(r);

	}
}