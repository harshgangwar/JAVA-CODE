class Pracc15
{
	static int i;
	static char ch;
	static String func(String s)
	{
		String nw="";
		char[] arr=new char[s.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			 ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{

				if(ch==arr[j])
				{
					
					arr[j]='\u0000';
				}
			}
			
		}
		try
		{
		for(i=0;i<s.length();i++)
		{
			char chr;
			if(arr[i]!='\u0000')
			{
				chr=arr[i];
				nw=nw.concat(""+chr);
			}
			
		}
		}
		catch(Exception e)
		{
			System.out.println("heyyyyyyyyyy");
		}
		return nw;
	}

	public static void main(String... harsh)
	{
		String r=func("HHarsh gangwar");
		System.out.println(r);
		
	}
}