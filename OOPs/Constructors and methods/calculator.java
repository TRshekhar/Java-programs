public class calculator{
    private float num1, num2;

    public calculator(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    protected void add(){
        float result = num1+num2;
        System.out.println("Sum of "+num1+" "+num2+" = "+result);
    }
    protected void subtract(){
        float result = num1-num2;
        System.out.println("Subtraction of "+num1+" "+num2+" = "+result);
    }
    protected void multiply(){
        float result = num1*num2;
        System.out.println("Multiply of "+num1+" "+num2+" = "+result);
    }
    protected void divide(){
        float result = num1/num2;
        System.out.println("Divide of "+num1+" "+num2+" = "+result);
    }
}