import java.util.Scanner;
public class little_nikita{
    static Scanner sc = new Scanner(System.in) ;
    public static void main(String[] args){
        int sample_cases = sc.nextInt();
        for(int i=0; i<sample_cases; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n>=m){
                if(n%2==m%2){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                System.out.println("No");
            }
        }
    }
}