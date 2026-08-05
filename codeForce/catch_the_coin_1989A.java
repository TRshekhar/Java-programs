import java.util.Scanner;
public class catch_the_coin_1989A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();
        while(sample>0){
            int x= sc.nextInt();
            int y=sc.nextInt();
            if(y>=-1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            sample--;
        }
    }
}