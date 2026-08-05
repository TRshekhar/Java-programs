import java.util.Scanner;
class pattern_print{
    public static void main(String arg[])
    {
       while(true)
       {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your choice:\n");
            System.out.println("\t1 for   1234\n\t\t1234\n\t\t1234\n\t\t1234\n");
            System.out.println("\t2 for   1111\n\t\t2222\n\t\t3333\n\t\t4444\n");
            System.out.println("\t3 for   ####\n\t\t####\n\t\t####\n\t\t####\n");
            System.out.println("\t4 for   abcd\n\t\tabcd\n\t\tabcd\n\t\tabcd\n");
            System.out.println("\t5 for   ABCD\n\t\tABCD\n\t\tABCD\n\t\tABCD\n");
            System.out.println("\t6 for   AAAA\n\t\tBBBB\n\t\tCCCC\n\t\tDDDD\n");
            System.out.println("\t7 for   1   \n\t\t12  \n\t\t123 \n");
            System.out.println("\t8 for   123 \n\t\t12  \n\t\t1   \n");
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
                    // pattern with 1111
                    //              2222
                    //              3333
                    //              4444
                    for(int i=1; i<=4; i++)
                    {
                        System.out.print("\t");
                        for(int j=0; j<4; j++)
                        {
                            System.out.print(i);
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    // pattern with ####
                    //              ####
                    //              ####
                    //              ####

                    for(int i=0; i<4; i++)
                    {
                        System.out.print("\t");
                        for(int j=0; j<4; j++)
                        {
                            System.out.print("#");
                        }
                        System.out.println("");
                    }
                    break;

                case 4:
                    // pattern with abcd
                    //              abcd
                    //              abcd
                    //              abcd
                    for(int i=0; i<=4; i++)
                    {
                        System.out.print("\t");
                        for(int j=97; j<=100; j++)
                        {
                            int intValue = j;
                            char charValue = (char) intValue;
                            System.out.print(charValue);
                        }
                        System.out.println("");
                    }
                    break;
                
                case 5:
                    // pattern with ABCD
                    //              ABCD
                    //              ABCD
                    //              ABCD
                    for(int i=0; i<4; i++)
                    {
                        System.out.print("\t");
                        for(int j=65; j<=68; j++)
                        {
                            int intValue = j;
                            char charValue = (char) intValue;
                            System.out.print(charValue);
                        }
                        System.out.println("");
                    }
                    break;

                case 6:
                    // pattern with AAAA
                    //              BBBB
                    //              CCCC
                    //              DDDD
                    for(int i=65; i<=68; i++)
                    {
                        System.out.print("\t");
                        for(int j=0; j<4; j++)
                        {
                            int intValue = i;
                            char charValue = (char) intValue;
                            System.out.print(charValue);
                        }
                        System.out.println("");
                    }
                    break;
                
                case 7:
                    for(int i=1; i<4; i++)
                    {
                        System.out.print("\t");
                        for(int j=1; j<i+1; j++)
                        System.out.print(j);
                        System.out.println("");
                    }
                    break;

                case 8:
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