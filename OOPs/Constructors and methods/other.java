public class other{
    private static void swap(int a, int b){
        System.out.println("a = "+b+" b = "+a);
    }

    private static void isprime(int n){
        boolean prime = true;
        for(int i=2; i<n*n; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }
        if(prime) System.out.println(n+" is a prime number");
        else System.out.println(n+" is not a prime number");
    }

    private static void Fibonacci_series(int num){
        int second_last = 0;
        int last = 1;
        if(num <= 0) System.out.println("Invalid input");
        else if(num == 1) System.out.println(second_last);
        else if(num == 2) System.out.println(second_last+" "+last);
        else{
            System.out.print(second_last+" "+last+" ");
            for(int i=0; i<num-2; i++){
                int next = second_last + last;
                System.out.print(next+" ");
                second_last = last;
                last = next;
            }        
        }
    }

    public static void main(String[] args){
        swap(23, 24);
        isprime(512);
        Fibonacci_series(10);
    }
}