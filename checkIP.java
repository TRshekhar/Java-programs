import java.util.Scanner;
public class checkIP{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();
        while(sample>0){
            String ip = sc.next();
            String ipPattern = "^(((0|1)?\\d{1,2}|2[0-4]\\d|25[0-5])\\.){3}((0|1)?\\d{1,2}|2[0-4]\\d|25[0-5])$";
            System.out.println(ip.matches(ipPattern));
            sample--;
        }
    }
}