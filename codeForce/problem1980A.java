import java.util.Scanner;
public class problem1980A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();

        for(int z=0; z<sample; z++){
            int n = sc.nextInt();
            byte m = sc.nextByte();
            String a = sc.next();
            char arr[] = {'A','B','C','D','E','F','G'};
            int ref[] = {0,0,0,0,0,0,0};
            int sum = 0;

            for(int j=0; j<n; j++){
                for(int i=0; i<7; i++){
                    if(arr[i]==a.charAt(j)){
                        ref[i]++;
                    }
                }
            }

            for(int k=0; k<7; k++){
                if(ref[k]<m){
                    sum = sum+(m-(ref[k]));
                }
            }

            System.out.println(sum);
        }
    }
}