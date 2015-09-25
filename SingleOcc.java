import java.util.Scanner;
class SingleOcc
{
	static String fuc(String s1)
	{
		String nw="";
		int flag;
		 for(int i=0;i<s1.length();i++)
		 {	
		 	flag=0;
		 	for(int j=i+1;j<s1.length()-1;j++)
		 	{
		 		if(s1.charAt(i)!=s1.charAt(j))
		 		{
		 			flag++;
		 		}
		 		
		 	else if(s1.charAt(i)==s1.charAt(j))
		 		{
		 			char c2=s1.charAt(j);
		 			s1.replace(c2,"");
		 		}

		 	}
		 	if(flag>0)
		 	{
		 		  char c=s1.charAt(i);
		 			nw=nw.concat(""+c);
		 	}

		 }

		return nw;
	}
	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String r=fuc(s);
		System.out.println(r);
	}
	
	
}
