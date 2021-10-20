import java.util.Arrays;



public class Largest_no_in_array 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,100,40};
		Arrays.sort(a);
		int largestno=a[a.length-1];
		System.out.println("largest no is "+largestno);

	}

}
