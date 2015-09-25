class Prac12
{
	static String[][] wordFreqCounter(String s)
    {
       String x[]=sortedWordArray(s);
      // System.out.println(noOfUniqueWords(s)+" unwrd");
       String z[][]=new String[noOfUniqueWords(s)][2];
       //sort(x);
       //disp(x);
       String curValue=x[0];
       int inz=0;
       int inx=0;
       int freq=0;
       
       for(inx=0;inx<x.length;inx++)
       {
           
           if(x[inx].equals(curValue))
           {
               freq++;
               z[inz][0]=curValue;
               z[inz][1]=""+freq;
           }
           else
           {
               curValue=x[inx];
               freq=1;
               inz++;
               //System.out.println(inz);
               z[inz][0]=curValue;
               z[inz][1]=""+freq;
           }
       }
       
       return z;           
    }
    


















	/*
	static void prac(String s)
	{
		int[] arr=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=charAt(i);
			
		}

	}
	*/
	public static void main(String... harsh)
	{
		//int r=prac("HHarsh gangawr");\
		int r=wordFreqCounter("HHarsh gangwar");
		System.out.println(r);
	}
}