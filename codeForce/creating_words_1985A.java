
import java.util.Scanner;

public class creating_words_1985A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte sample = sc.nextByte();
        for(int i=0; i<sample; i++){
            String a = sc.next();
            String b = sc.next();
            System.out.println(b.charAt(0)+a.substring(1)+" "+a.charAt(0)+b.substring(1));
        }
    }
}