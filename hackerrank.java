import java.util.Scanner;
class hackerrank{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int n=in.nextInt();
        in.close();
        int result=0;
        for(int i=0; i<=n; i++)
        {
            int power = 1;
            for(int j = 0; j<i; j++)
            {
                power *= 2;
            }
            int multi = b*power + result;
            result = multi;
            int sum = 0;
            sum = a+result;
            System.out.print(sum+" ");
        }
    }
}