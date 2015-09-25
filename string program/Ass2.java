import java.util.Scanner;
public class Ass2
{

public static void main(String... harsh)
{
	
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		 char ch[]= new char[in.length()];
		 char ch1[]= new char[in.length()];
		for(int i=0;i<in.length();i++)
			ch[i]=in.charAt(i);
			int j=0;
			for(int i=ch.length-1;i>=0;i--)
			{
				System.out.print(ch[i]);
				ch1[j]=ch[i];
				j++;
			}
		
		String neww=new String(ch1);
		if(neww.equals(in))
        System.out.println("palindrome");
    	else
    		System.out.println(" not palindrome");
}


}