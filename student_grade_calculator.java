
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class student_grade_calculator{

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean valid = true;
            while (valid) {
                System.out.print("Enter number of subject = ");
                try {
                    int number_of_subject = sc.nextInt();
                    ArrayList<Integer> subject = new ArrayList<>(number_of_subject);
                    System.out.println("Enter the marks of ");
                    for (int i = 0; i < number_of_subject; i++) {
                        try {
                            System.out.print("Subject " + (i + 1) + " = ");
                            int marks = sc.nextInt();
                            subject.add(marks);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input! Please Enter an Integer");
                            sc.next();
                            i -= 1;
                        }
                    }

                    // calculation of grade
                    int totalMarks = 0;
                    for (int i = 0; i < number_of_subject; i++) {
                        totalMarks += subject.get(i);
                    }

                    float avgPercentage = (float) totalMarks / (float) number_of_subject;

                    String grade;
                    if (avgPercentage <= 100 && avgPercentage > 90) {
                        grade = "A+";
                    } else if (avgPercentage <= 90 && avgPercentage > 80) {
                        grade = "A";
                    } else if (avgPercentage <= 80 && avgPercentage > 70) {
                        grade = "B+";
                    } else if (avgPercentage <= 70 && avgPercentage > 60) {
                        grade = "B";
                    } else if (avgPercentage <= 60 && avgPercentage > 50) {
                        grade = "C+";
                    } else if (avgPercentage <= 50 && avgPercentage > 40) {
                        grade = "C";
                    } else {
                        grade = "Fail";
                    }

                    System.out.print("Total marks = " + totalMarks);
                    System.out.print(", Average Percentage = " + avgPercentage + "%");
                    System.out.println(", Grade = " + grade);
                    valid = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input! Please Enter an Integer");
                    sc.next();
                }
            }
        }
    }
}
