
public class Helloworld 
{

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(55*2);
		for(int i = 1; i < 10; i++)
		System.out.println(fabinonci(i));
	}

	private static int fabinonci(int n)
	{
		if( n <= 2 )
			return 1;
		else
			return fabinonci(n - 1) + fabinonci(n- 2);
	}
}
