public class Test 
{
public static void main(String[] args)
{ 
String str = "HHarsh gangwar";
int i,j,k;
char[] ch = str.toCharArray();
int len=ch.length;
for ( i = 0; i < len; i++) {
int counter = 0;
char c=str.charAt(i);
for ( j = 0; j < len; j++) {
if (c==ch[j]){
ch++;
counter[j]='\u0000';
}
}
if(counter>0)System.out.println(c+"="+counter);

}
}
}


