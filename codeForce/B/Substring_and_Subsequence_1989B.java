import java.util.Scanner;

public class Substring_and_Subsequence_1989B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();
        while(sample>0){
            String a = sc.next();
            String b = sc.next();
            String c = "";
            String e = "";

            for(int i=0; i<a.length(); i++){
                for(int j=0; j<b.length(); j++){
                    if(b.charAt(j)==(a.charAt(i))){
                        String d = String.valueOf(b.charAt(j));
                        c = c+d;
                        break;
                    }
                }
            }
        
            for(int i=0; i<b.length(); i++){
                for(int j=0; j<a.length(); j++){
                    if(a.charAt(j)==(b.charAt(i))){
                        String d = String.valueOf(a.charAt(j));
                        e = e+d;
                        break;
                    }
                }
            }

            if(c.length()<e.length()){
                System.out.println(a.length()+b.length()-c.length());
            }
            else{
                System.out.println(a.length()+b.length()-e.length());
            }
            sample--;
        }
    }
}