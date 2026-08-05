import java.util.Scanner;
public class Suffling_song{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        byte n = sc.nextByte();
        String songs[][] = new songs[n][2];
        for(int i=0; i<n; i++){
            songs[i][i]=sc.next();
            songs[i][i+1] = sc.next();
        }
    }
}