
import java.util.Scanner;

public class only_pluses_1992A {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sample = sc.nextInt();
            while (sample > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if (!(a == b && b == c && a==c)) {
                    int arr[] = new int[3];
                    arr[0] = a;
                    arr[1] = b;
                    arr[2] = c;
                    int gratest = (a >= b) ? ((a >= c) ? (a) : (c)) : ((b >= c) ? (b) : (c));
                    int[] arr1 = new int[2];
                    arr1[0] = -1;
                    arr1[1] = -1;
                    int j = 0;
                    for (int i = 0; i < 3; i++) {
                        if (arr[i] < gratest) {
                            arr1[j] = arr[i];
                            j++;
                        }
                    }
                    arr1[1] = (arr1[1] < 0) ? (gratest) : (arr1[1]);
                    int small = (arr1[0] <= arr1[1]) ? (arr1[0]) : (arr1[1]);
                    int big = (arr1[0] <= arr1[1]) ? (arr1[1]) : (arr1[0]);
                    System.out.println(arr1[0]+","+arr1[1]);
                    int temp = 0;
                    small += 5;
                    for (int i = 0; i <= 5; i++) {
                        if (small * big > temp) {
                            temp = small * big;
                        } else {
                            break;
                        }
                        small--;
                        big++;
                    }
                    System.out.println(temp * gratest);
                }else{
                    a+=5;
                    int temp=0;
                    for (int i = 0; i < 5; i++) {
                        if(a*b*c>temp){
                            temp=a*b*c;
                        }else{
                            break;
                        }
                        a-=2;
                        b++;
                        c++;
                    }
                    System.out.println(temp);

                }
                sample--;
            }
        }
    }
}
