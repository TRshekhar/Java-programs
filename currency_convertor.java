import java.util.Scanner;
public class currency_convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = 1;
        while (repeat!=0) {
            double doller = 80;
            System.out.print("Enter 0 for Doller into rupees or 1 for Rupees to Doller: ");
            int x = sc.nextInt();
            switch (x) {
                case 0 -> {
                    System.out.println("Doller->Rupees");
                    System.out.print("Enter the amount: ");
                    int input = sc.nextInt();
                    double value = input * doller;
                    System.out.println("$" + input + " = " + value + " rupee");
                }
                case 1 -> {
                    System.out.println("Rupees->Doller");
                    System.out.print("Enter the amount: ");
                    int input = sc.nextInt();
                    double value = input / doller;
                    System.out.println(input + " = $" + value);
                }
            }
            System.out.print("Enter any number to continue or '0' to exit(): ");
            repeat=sc.nextInt();
        }
    }
}
