import java.util.Scanner;

public class Large_Addition_1984B {

    static boolean large(long n) {
        long x = 0;
        long y = 0;
        while (n > 1) {
            if ((n % 10 >= 5) && (n % 10 <= 9)) {
                x++;
                n /= 10;
            } else {
                ++y;
                break;
            }
            ++y;
        }
        return x == y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();
        for (int i = 0; i < sample; i++) {
            long num = sc.nextLong();
            String b = String.valueOf(num);
            long a = b.length();
            long c = (long) Math.pow(10, (a - 1));
            long num0 = num / 2;
            long num1 = num - num / 2;
            if (num / c == 1) {
                boolean provide = true;
                while (provide) {
                    if (Long.toString(num0).length() == Long.toString(num1).length()) {
                        if (large(num0) && large(num1)) {
                            System.out.println("Yes");
                            provide=false;
                            break;
                        }
                        if (num0 > num1) {
                            num0++;
                            num1--;
                        } else {
                            num0--;
                            num1++;
                        }
                    } else {
                        System.out.print("No");
                        provide=false;
                        break;
                    }
                }
            } else {
                System.out.println("No");
            }
        }
    }
}