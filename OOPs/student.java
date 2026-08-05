import java.util.HashMap;
import java.util.Map;
class Grade{
    private float science;
    private float mathematics;
    private float hindi;
    private float computer;
    private float english;
    private float social_science;

    protected Grade(float science, float mathematics, float hindi, float computer, float english, float social_science){
        this.science = science;
        this.mathematics = mathematics;
        this.hindi = hindi;
        this.computer = computer;
        this.english = english;
        this.social_science = social_science;
    }

    protected void set_science(float science){this.science = science;}

    protected void set_mathematics(float mathematics){this.mathematics = mathematics;}

    protected void set_hindi(float hindi){this.hindi = hindi;}

    protected void set_computer(float computer){this.computer = computer;}

    protected void set_english(float english){this.english = english;}

    protected void set_social_science(float social_science){this.social_science = social_science;}

    protected Map<String, Float> get_numbers() {
        Map<String, Float> grades = new HashMap<>();
        grades.put("science", science);
        grades.put("mathematics", mathematics);
        grades.put("hindi", hindi);
        grades.put("computer", computer);
        grades.put("english", english);
        grades.put("social_science", social_science);
        return grades;
    }

    private String get_grade(float num){
        if(num >=90) return "A+";
        else if(num >= 80 && num < 90) return "A";
        else if(num >= 70 && num < 80) return "B+";
        else if(num >= 60 && num < 70) return "B";
        else if(num >= 50 && num < 60) return "C+";
        else if(num >= 40 && num < 50) return "C";
        else if(num >= 30 && num < 40) return "D+";
        else if(num >= 20 && num < 30) return "D";
        else if(num >= 10 && num < 20) return "E+";
        else return "E";
    }

    protected String get_science(){ return get_grade(science); }

    protected String get_mathematics(){ return get_grade(mathematics); }

    protected String get_hindi(){ return get_grade(hindi); }

    protected String get_computer(){ return get_grade(computer); }

    protected String get_english(){ return get_grade(english); }

    protected String get_social_science(){ return get_grade(social_science); }

    protected String total_grade(){ return get_grade((hindi+science+mathematics+computer+english+social_science)/6); }
}

class Student_details extends Grade{
    private String name;
    private int semester;
    private int roll_number;
    private float marks;

    Student_details(String name ,int semester, int roll, float marks){
        super(0, 0, 0, 0, 0, 0);
        this.name = name;
        this.semester = semester;
        this.roll_number = roll;
        this.marks = marks;
    }
    void getDetails(){
        System.out.println("Name: "+ this.name);
        System.out.println("Roll number: "+roll_number);
        System.out.println("Marks: "+marks);
        System.out.println();
    }
}

public class student{
    public static void main(String[] args){
        Student_details c1 = new Student_details("om",7, 43, 100);
        Student_details c2 = new Student_details("Daksh", 7, 19, 101.9f);
        Student_details c3 = new Student_details("Madhukar", 7, 43, 500.05f);
        c1.getDetails();
        c2.getDetails();
        c3.getDetails();
        System.out.println(c1.get_computer());
        System.out.println(c1.total_grade());
    }
}