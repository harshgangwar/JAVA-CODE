import java.util.Scanner;
class WrdConut
{
	static int flag;
	public static void main(String... harsh)
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		String arr[]=in.split(" ");
		for(int i=0;i<arr.length-1;i++)
		{
			flag=1;
			if(arr[i]!="*")
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]!="*")
				{
				if(arr[i].compareTo(arr[j])==0)
				  {
			        flag++;  arr[j]="*";
				  }
			    }
			} 			
				if(arr[i]!="*")
				System.out.println("freq of word " + arr[i] + "  = " + flag );	
		}
		if(arr[arr.length-1]!="*")
		System.out.println("freq of word " + arr[arr.length-1] + " = " + flag);
	}
}