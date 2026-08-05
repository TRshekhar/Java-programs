import java.util.Scanner;
public class Phone_Desktop {

    public static void main(String[] args) {
        int sample;

        Scanner sc = new Scanner(System.in);
        sample = sc.nextInt();

        for (int i = 0; i < sample; i++) {
            int x;
            int y;
            int modolus_of_y;
            int screen_for_y;
            int empty_space;
            int required_space_for_x;
            int modolus_of_x;
            int qutient_of_x;
            int screen_for_x = 0;
            int total_no_of_screen;

            x = sc.nextInt();
            y = sc.nextInt();

            modolus_of_y = y % 2;
            screen_for_y = (y / 2) + modolus_of_y;

            if (y % 2 == 0) {
                empty_space = (15 - 8) * (y / 2);
            } else {
                empty_space = (15 - 8) * (y / 2) + 11;
            }

            if (x > empty_space){
                required_space_for_x = ((x) - (empty_space));
                modolus_of_x = (required_space_for_x) % (15);
                qutient_of_x = ((required_space_for_x) / (15));

                if (modolus_of_x == 0) {
                    screen_for_x = qutient_of_x;
                } else {
                    screen_for_x = qutient_of_x + 1;
                }
            }
            total_no_of_screen = screen_for_y + screen_for_x;
            System.out.println(total_no_of_screen);
        }
    }
}
