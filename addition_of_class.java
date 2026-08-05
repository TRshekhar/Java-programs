import java.util.Scanner;

// class a{
//     int num1;
// }
// class b{
//     int num2;
// }
// class addition_of_class{
//     public static void main( String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         a A = new a();
//         b B = new b();

//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         A.num1 = n1;
//         B.num2 = n2;

//         int c= A.num1+B.num2;
//         System.out.println("sum = "+c);

//     }
// }

class Add1{
    static void add()
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.println("The sum of numbers is:"+c);
    }
}

class addition_of_class{
    public static void main(String[] args)
    {
        Add1.add();
    }
}