import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        double num1, num2;
        
        do {

		    System.out.print("\nEnter first number:");
            num1 = scanner.nextDouble();
            System.out.print("\nEnter second number:");
            num2 = scanner.nextDouble();

            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1: 
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if(num2 != 0)
                        System.out.println("Result: " + (num1 / num2));
                    else
                        System.out.println("Cannot divide by zero!");
                    break;
		        case 5:
                    if(num2 != 0)
                        System.out.println("Result: " + (num1 % num2));
                    else
                        System.out.println("Cannot divide by zero!");
                    break;
                case 6:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        } while(choice != 6);
        
        // Close scanner
        scanner.close();
    }
}
