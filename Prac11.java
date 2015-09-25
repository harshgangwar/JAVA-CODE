class Prac11
{
	static int prac(String s)
	{
			 int flag=0;
			 try
			 {
				for(int i=0;;i++)
				{
					
						s.charAt(i);
							flag++;
					
				}
			 }	
			 catch(Exception e)
			 {
			 	return flag;
			 }
			
	}
	public static void main(String... harsh)
	{
		int r=prac("harsh   gangwar");
		System.out.println(r);
	}
}