import java.util.Scanner;
public class prime_between{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();
        for (int k = 0; k < sample; k++) {
            int number = sc.nextInt();
            int y=0;
            for(int j=2; j<=number; j++){
                int x=0;
                int i;
                for(i=2; i*i<=j; i++){
                    if(j%i==0){
                        x++;
                    }
                }
                if(x<1){
                    System.out.print(j+" ");
                    y++;
                }   
            }
            System.out.println("\nnumber of prime number = "+y);
        }
    }
}