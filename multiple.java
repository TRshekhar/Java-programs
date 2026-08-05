import java.util.Scanner;
class multiple
{
	public static void main(String arg[])
	{
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ");
		int a=sc.nextInt();
		System.out.println("Table of a");
		while(i<=10)
		{
			int b=a*i;
			System.out.println(a+"x"+i+"="+b);
			i++;
		}
		System.out.println("I am done");
	}
}