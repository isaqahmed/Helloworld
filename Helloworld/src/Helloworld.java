
public class Helloworld 
{

	public static void main(String[] args) {
		System.out.println("Hello World!");
		for(int i = 1; i < 10; i++)
		 System.out.print(fabinocci(i));
		
		int a = 10, b =25;
		System.out.println("\nGCD of "+a+", "+b+" is "+gcd(a,b));
		
		System.out.println("End of main");
	}

	private static int gcd(int a, int b) 
	{
		if( b == 0 )
			return a;
		
		return gcd(b, a%b);
	}

	private static int fabinocci(int n)
	{
		if( n <= 2 )
			return 1;
		else
			return fabinocci(n - 1) + fabinocci(n- 2);
	}
	
	
}
