import java.util.Scanner;
class class_pratical{
    public static void main(String arg[])
    {
       while(true)
       {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your choice:\n");
            System.out.println("\t1 for   1234\n\t\t1234\n\t\t1234\n\t\t1234\n");
            System.out.println("\t2 for   1   \n\t\t12  \n\t\t123 \n");
            System.out.println("\t3 for   123 \n\t\t12  \n\t\t1   \n");
            System.out.print("Enter choise = ");
            int x = sc.nextInt();
            System.out.println("\nPattern = ");

            switch(x)
            {
                case 1:
                    // pattern with 1234
                    //              1234
                    //              1234
                    //              1234
                    for(int i=1; i<=4; i++)
                    {
                        System.out.print("\t");
                        for(int j=1; j<=4; j++)
                        {
                            System.out.print(j);
                        }
                        System.out.println("");
                    }
                    break;
                
                
                case 2:
                    for(int i=1; i<4; i++)
                    {
                        System.out.print("\t");
                        for(int j=1; j<i+1; j++)
                        System.out.print(j);
                        System.out.println("");
                    }
                    break;

                case 3:
                    for(int i=4; i>0; i--)
                    {
                        System.out.print("\t");
                        for(int j=1; j<i; j++)
                        System.out.print(j);
                        System.out.println("");
                    }
                    break;
                            
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("");
       }
    }
}