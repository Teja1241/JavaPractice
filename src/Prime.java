import java.util.Scanner;

public class Prime
{
	  static int a;
  boolean test()
	{
	 Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		a=sc.nextInt();
		boolean status=true;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				status=false;
			
			}
		}
		return status;
	}
	//int a,b,c;
public static void main(String args[])
{
Prime p=new Prime();

	if(p.test())
	{
		System.out.println( a +"is a prime");
	}
	else
		System.out.println(a + "is not a prime");
}
	
}