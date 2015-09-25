import java.util.Scanner;
class Test
{
	static int flag;
	static int tokens[]=new int[26];
	public static void main(String... harsh)
	{

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>=1)
		{
		String in=sc.nextLine();
		String[] tokens=in.split(" ");
		for(int i=0;i<tokens.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<tokens.length;j++)
				if(tokens[j]<tokens[index])
				index=j;
			int smallerNo=tokens[index];
			tokens[index]=tokens[i];
			tokens[i]=smallerNo;
		}


		n--;	
		}

	}





}