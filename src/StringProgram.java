import java.util.HashMap;

public class StringProgram 
{
	public static void main(String[] args) 
	{
		String s="abcabcde";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		//a=2
//		b=1
//		c=1
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1 );
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
			
			
		}
		System.out.println(hm);
		
		
		
		
		
		
		
		
		
		
	}

}
