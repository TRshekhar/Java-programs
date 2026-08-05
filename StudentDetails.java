import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Student Roll Number:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter Student Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.println("Enter Student Percentage CGPA:");
        double percentageCGPA = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        System.out.println("Enter Student Contact Number:");
        String contactNumber = scanner.nextLine();
        
        // Print student details
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage CGPA: " + percentageCGPA);
        System.out.println("Contact Number: " + contactNumber);
        
        // Close scanner
        scanner.close();
    }
}
