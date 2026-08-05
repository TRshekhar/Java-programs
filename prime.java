import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();
        for(int j=0; j<sample; j++){
            int number = sc.nextInt();
            int x=0;
            for(int i=2; i*i<=number; i++){
                if(number%i==0){
                    x++;
                }
            }
            if(x>=1){
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Prime");
            }
        }
    }
}