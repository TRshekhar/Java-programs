
import java.util.Scanner;

public class Diviser_game_1994A{
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            int sample = sc.nextInt();
            while(sample>0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int arr[][] = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        arr[i][j]=sc.nextInt();
                    }
                }

                int brr[][] = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if(i==0){
                            if(j==0){
                            brr[n-1][m-1]=arr[i][j];
                            }else{
                            brr[n-1][j-1]=arr[i][j];
                            }
                        }else if(j==0){
                            brr[i-1][m-1]=arr[i][j];
                        }
                        else{
                            brr[i-1][j-1]=arr[i][j];
                        }
                    }
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(brr[i][j]+" ");
                    }
                    System.out.println("");
                }
                sample--;
            }
        }
    }
}