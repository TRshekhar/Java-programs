import java.util.Scanner;
class factor
{
	public static void main(String arg[])
	{
		int i,j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("This program will give you factor of a number\n");
		while(true)
		{
			System.out.print("Enter the number = ");
			int a = sc.nextInt();
			System.out.print("factor = ");
			for(i=1; i<=a; i++)
			{
				if(a%i==0)
				{
					System.out.print(i+" ");
				}
			}
			System.out.print("\n\n");
		}
	}
}