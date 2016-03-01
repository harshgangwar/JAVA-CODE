import java.util.Scanner;
class Squeeze
{
	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		
		for(int i=0;i<in.length();i++)
		{
				if(in.charAt(i)!=' ')
				   System.out.print(in.charAt(i));

		}
		   System.out.println("  ");
    }
}