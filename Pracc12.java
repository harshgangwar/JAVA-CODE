class Pracc12
{
	static int i,flag;
	static char ch;
	static void func(String s)
	{
		int[] arr=new int[s.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			flag=0;
			 ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch==arr[j])
				{
					flag++;
					arr[j]='\u0000';
				}
			}
			
		
		if(flag>0)
			System.out.println(ch+"="+flag);
	}
}
	public static void main(String... harsh)
	{
		func("HHarsh gangwar");
		
	}
}