 
 class SortWord
 {
     public static void main(String... harsh)
    {
        int i;
        String x[]={"harsh","gangwar","is","a","good","boy"};
        for(i=0;i<x.length;i++)
        {
            for(j=(i+1);j<x.length;j++)
            {
                if(compare(x[j],x[i])<0)
                {
                   String t=x[j];
                   x[j]=x[i];
                   x[i]=t;
                }
            }
        }
        for(int j=0;j<x.length;j++)
        System.out.println(x[j]);
    
    }
}