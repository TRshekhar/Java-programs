import java.util.Scanner;
class guess_the_number{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Password: ");
        short pass = sc.nextShort();
        Short popo = 746;
        if(pass == popo)
        {
            int chance;
            do{
                //printing ========
                //         ========
                for(int j=0; j<2; j++)
                    for(int k=0; k<=10; k++)
                        System.out.println("=");
                
                //generating random number
                double y = Math.random()*100;
                int x = (int)y;
                int i = 1;
                chance=0;

                System.out.println("Try your luck by Guessing the number\n");

                while(true){
                    System.out.print("Enter the number:- ");
                    int number = sc.nextInt();
                    if(number < x)
                    System.out.println("Think greater");
                    else if(number > x)
                    System.out.println("Think Smaller");
                    else
                    {
                        System.out.println("You won");
                        int luck = 100/i;
                        System.out.println("Your Luck = "+luck+"%");
                        break;
                    }
                    i++;
                }
                System.out.println("\nEnter 1 for Play Again. OR 2 for exit");
                int a=0;
                int choice = 1;
                do{
                    System.out.print("Choice = ");
                    a = sc.nextInt();
                    switch(a){
                        case 1:
                            choice++;
                            break;
                        case 2:
                            choice++;
                            chance = 2;
                            break;
                        default:
                            System.out.println("\nEnter valid choice");
                    }
                }while(choice != 2);
            }while(chance != 2);
        }
        else {
            System.out.println("Wrong password");
            
        }
    }
}