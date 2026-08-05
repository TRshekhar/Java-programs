import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class htmlfilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        while(testCases-- > 0) {
            String line = sc.nextLine();
            String p = "<(.+)>([^<]+)</\\1>";
            Pattern pattern = Pattern.compile(p);
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String a1 = matcher.group(1);
                String a2 = matcher.group(2);
                System.out.println(a2);
            } else {
                System.out.println("none");
            }
        }
    }
}
