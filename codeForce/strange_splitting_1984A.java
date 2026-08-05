//Topic --> constructive algorithm
import java.util.Scanner;
public class strange_splitting_1984A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();
        for (int i = 0; i < sample; i++) {
            int n = sc.nextInt();
            String str = sc.nextLine();

            int arr[] = new int[n];

            for(int j=0; j<n; j++){
                arr[j]=str.charAt(j);
            }
            for (Object elem : arr) {
                System.out.println(elem);
            }
        }
    }
}