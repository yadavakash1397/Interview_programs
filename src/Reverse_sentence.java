import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Reverse_sentence 
{  //Country My Is India
	
	
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("India");
		list.add("Is");
		list.add("My");
		list.add("Country");
		ListIterator<String> lit = list.listIterator();
		
		
		TreeSet<String> tr=new TreeSet<String>(list);
		
		System.out.println(tr);
		Iterator<String> it = tr.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
			
			
		}
	}

}
