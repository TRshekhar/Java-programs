import java.util.Scanner;
class function{
    public static int pow(int x ,int y)
        {
            int power = 1;
            if(y==0)
            {
                return 1;
            }
            else
            {
                for(int i =1; i<=y; i++)
                {
                    power *= x;
                }
                return power;
            }
        }
}
class test {
    public static void main(String args[]) {
        int power=1;
        for(int j = 0; j<3; j++)
        {
            power *= 2;
        }
        System.out.print(power);
    }
}
