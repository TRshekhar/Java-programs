
import java.util.Scanner;
class factorial
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt(), fac=1;
		for(int i=1; i<=a; i++)
		{
			fac = fac*i;
		}
		System.out.print("factorial of "+a+" = "+fac);
	}
}