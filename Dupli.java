/*import java.util.*;
class Dupli
{

	public static void removeDuplicateString2(final String input)
	{

    final Set<Character> set = new LinkedHashSet<>();
    for (int i = 0; i < input.length(); i++)
        set.add(input.charAt(i));
    final StringBuilder stringBuilder = new StringBuilder(set.size());
    for (final Character character : set)
        stringBuilder.append(character);
    System.out.println(stringBuilder);

    }

	public static void main(String... harsh)
	{

		removeDuplicateString2("harshhh ggangwarr");
    }
	
}


*/
import java.util.*;
class removeDuplicate
{
    public String remove(String inputString) 
    { 
        String result = ""; 
        Set<String> inputSet= new LinkedHashSet<String>(); //LinkedHashSet maintains the order in which elements are inserted
        for(int i=0;i<inputString.length();i++) 
        { 
            inputSet.add(String.valueOf(inputString.charAt(i))); 
        }    
        for(String a: inputSet) 
        { 
            result += a; 
        } 
            return result; 
    }
    public static void main(String java2carrer[])
    {
        removeDuplicate rd=new removeDuplicate();
        System.out.println(rd.remove("abdacdabcd"));
    }

}