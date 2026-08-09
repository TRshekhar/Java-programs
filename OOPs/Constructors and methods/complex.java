class Number{
    float real_number1, real_number2;
    float imaginary_number1, imaginary_number2;

    Number(String num1, String num2){
        String[] parts1 = num1.split("\\+");
        String[] parts2 = num2.split("\\+");

        // Parse real parts
        this.real_number1 = Float.parseFloat(parts1[0].trim());
        this.real_number2 = Float.parseFloat(parts2[0].trim());

        // Remove the 'i' character and parse imaginary parts
        this.imaginary_number1 = Float.parseFloat(parts1[1].replace("i", "").trim());
        this.imaginary_number2 = Float.parseFloat(parts2[1].replace("i", "").trim());
    }

    protected String add(){
        float real_num = real_number1 + real_number2;
        float imaginary_num = imaginary_number1 + imaginary_number2;

        String num = real_num+" + "+imaginary_num+"i";

        return num;
    }
}

public class complex{
    public static void main(String[] args){
        Number c_num = new Number("23+4i", "22+6i");
        System.out.println("sum ="+ c_num.add());
    }
}