import java.util.Scanner;
public class specific_no_at_any_place{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        System.out.print("Enter the place of number = ");
        byte index = sc.nextByte();
        String input = Integer.toString(num);
        System.out.println(input.charAt(index-1));
    }
}