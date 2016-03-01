import java.util.*;
class Codegrnd1
{
       static int i1=0;
       static int n,sum,m;
   public static void main(String... harsh)
   {
         int[][] id=new int[35][10000];
         int[] mark=new int[35];
     
        Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
        while(i1<n)
        {
            for(int j=0;j<=1;j++)
            id[i1][j]=sc.nextInt();

             i1++;
            
        }
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n;k++)
            {
                 if(id[i][1]==id[k][0]  && id[k][0]!=0 && id[i][0]!=0)
                 {
                   
                    mark[m]=i;
                    m++;
                 }
                    if(id[i][1]==id[i][1]+id[k][1]  && id[k][0]!=0 && id[i][0]!=0)
                          {
                               
                               mark[m]=i;
                               m++;
                          }  
            }
           
        }

        for(int i=0;i<n;i++)
        {
           
                if(mark[i]==0)
                    System.out.println(id[i][0]);

            
        }

   }



}