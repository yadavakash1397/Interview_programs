
public class Pyramid
{
//	12345
//	1234
//	123
//	12
//	1
	
	public static void main(String[] args) 
	{
		int maxdata=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=maxdata;j++)
			{
				System.out.print(j);
			}
			maxdata--;
			System.out.println();
		}
		
	}

}
