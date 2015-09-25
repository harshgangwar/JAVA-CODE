
import java.io.*;
class Code
{
   public static void main(String args[])throws IOException
   {

       //Scanner sc=new Scanner(System.in);
       BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(sc.readLine());
       //System.out.println("Enter String");
       while(n>0)
       {
           String str=sc.readLine();
           int test=Integer.parseInt(sc.readLine());
           str=str.toLowerCase();
           String arr[]=str.split(" ");
           int flag=0,count=1,pos=0;
           String word,temp="";
           for(int x=0;x<arr.length-2&&count<=test;x++,count++)
           {
               word=arr[x];
               if(flag==0)
               {
                   for(int y=x+2;y<arr.length;y=y+2)
                   {
                       if(word.compareTo(arr[y])>0)
                       {
                           word=arr[y];
                           pos=y;
                          
                       }
                   }
                    // change from here 
                           temp=arr[x];
                           arr[x]=word;
                           arr[pos]=temp;
                           flag=1;
               }
               else if(flag==1)
               {
                   for(int y=x+2;y<arr.length;y=y+2)
                   {
                      
                       if(word.compareTo(arr[y])>0)
                       {
                           word=arr[y];
                           pos=y;
                       }
                   }

                   temp=arr[x];
                   arr[x]=word;
                   arr[pos]=temp;
                   flag=0;
               }
           }
           for(int x=0;x<arr.length;x++)
           {
               System.out.print(arr[x]+" ");
           }
          
           n--;
       }
   }
}                                                                                               