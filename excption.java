
import java.util.Scanner;

public class excption extends Exception {

    public static void main(String[] args) {
        int marks[] = new int[]{1, 2, 3};
        Scanner sc = new Scanner(System.in);
        byte sample = sc.nextByte();

        for (byte i = 0; i < sample; i++) {
            try {
                System.out.print("Enter the index of an array: ");
                int arr = sc.nextInt();

                System.out.print("Enter the index of a number: ");
                int num = sc.nextInt();

                System.out.println("The result after array-value/number = " + marks[arr] / num);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Envalid index entered");
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
