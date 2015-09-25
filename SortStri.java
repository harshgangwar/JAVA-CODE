import java.util.*;
class SortStri
{
	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		char ch[]=in.toCharArray();
		Arrays.sort(ch);
		String s=new String(ch);
		System.out.println(s);
	}

}