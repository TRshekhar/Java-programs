class sum_of_even_odd_till_30{
    public static void main( String[] args){
        int even = 0, odd = 0;
        for(int i=1; i<30; i++)
        {
            if(i%2==0)
            {
                even = even + i;
            }
            else if(i%2==1)
            {
                odd = odd+i;
            }
        }
        System.out.println("Sum of odd number between 1 to 30 = "+odd);
        System.out.println("Sum of even number between 1 to 30 = "+even);
    }
}