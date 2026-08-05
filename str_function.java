import java.util.Scanner;
class str_function{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.println("Length of first string: "+str1.length());
        System.out.println("Length of second string: "+str2.length());
        System.out.println("To upper case of first string: "+str1.toupper());
        System.out.println("To upper case of second string: "+str2.tolower());

    }
}