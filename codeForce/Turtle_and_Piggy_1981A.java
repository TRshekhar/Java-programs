import java.util.Scanner;
public class Turtle_and_Piggy_1981A{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sample = sc.nextInt();
        for(int i=0; i<sample; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x,y=2,score=0;
            if(r%2==0){
                x=r;
            }
            else{
                x=(r-1);
            }
            while(x>=y){
                y*=2;
                ++score;
            }
            System.out.println(score);
        }
    }
}