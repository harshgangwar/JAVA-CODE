

//// ERROR //////

import java.util.Scanner;
class Prac13
{
		static String singleOcc(String s)
		{
			 String nw="";

			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				char c1;
				for(int j=i+1;j<s.length()-1;j++)
				{
					if(s.charAt(j)==c)
					{
						c1=s.charAt(j);
						nw=nw.concat(""+c1);
						c1='\u0000';
						s.charAt(j)=c1;
					}
				}
			}
			return nw;
		}
	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String r=singleOcc(s1);
		System.out.println(r);
	}
}