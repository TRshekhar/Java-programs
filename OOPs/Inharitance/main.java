class Vehical{
    private int number_of_wheel = 0;
    private int number_of_sit;
    private String engine_name;
    private String model_name;
    private String chassis_number;

    Vehical(int number_of_wheel, int number_of_sit, String model_name){
        this.number_of_wheel = number_of_wheel;
        this.number_of_sit = number_of_sit;
        this.model_name = model_name;
    }

    //setter
    protected void set_number_of_wheel(int wheel){
        this.number_of_wheel = wheel;
    }

    protected void set_number_of_sit(int sit){
        this.number_of_sit = sit;
    }

    protected void set_engine_name(String engine_name){
        this.engine_name = engine_name;
    }

    protected void set_model_name(String model_name){
        this.model_name = model_name;
    }

    protected void set_chassis_number(String chassis_number){
        this.chassis_number = chassis_number;
    }

    //getter
    protected void get_details(){
        System.out.println("Number of wheels = "+number_of_wheel);
        System.out.println("Number of sit = "+number_of_sit);
        System.out.println("Model name = "+model_name);
        System.out.println("Chassis number = "+chassis_number);
        System.out.println("Engine name = "+engine_name);
    }

    protected int get_number_of_wheel(){
        return number_of_wheel;
    }

    protected int get_number_of_sit(){
        return number_of_sit;
    }

    protected String get_model_name(){
        return model_name;
    }

    protected String get_chassis_number(){
        return chassis_number;
    }

    protected String get_engine_name(){
        return engine_name;
    }
}

class Car extends Vehical{
    Car(String model_name){
        super(4, 5, model_name);
    }

    @Override
    protected void get_details(){
        System.out.println("Model name = "+get_model_name());
        System.out.println("Number of sit = "+get_number_of_sit());
        System.out.println("Engine = "+get_engine_name());
        System.out.println("Chassis number = "+get_chassis_number());
    }
}

class Bike extends Vehical{
    
    Bike(String model_name){
        super(2, 2, model_name);
    }

    @Override
    protected void get_details(){
        System.out.println("Model name = "+get_model_name());
        System.out.println("Only "+get_number_of_sit()+" number of people allowed");
        System.out.println("Engine = "+get_engine_name());
        System.out.println("Chassis number = "+get_chassis_number());
    }
}

class Person{
    private String name;
    private int age;
    private String profession;

    protected void set_name(String name){
        this.name = name;
    }

    protected void set_age(int age){
        this.age = age;
    }

    protected void set_profession(String profession){
        this.profession = profession;
    }

    protected String get_name(){
        return name;
    }

    protected int get_age(){
        return age;
    }
}

class Student extends Person{
    private int roll_number;
    private int Class;
    private String[] subjects = new String[10];


    Student(String name, int roll, int Class){
        set_name(name);
        set_profession("Student");
        this.roll_number = roll;
        this.Class = Class;
    }

    Student(String name, int roll, int Class, int age){
        set_name(name);
        set_profession("Student");
        set_age(age);
        this.roll_number = roll;
        this.Class = Class;
    }

    protected void add_subjects(String ...arr){
        int i=0;
        for(String a: arr){
            subjects[i] = a;
            i++;
        }
    }

    protected void set_roll_number(int roll){
        this.roll_number = roll;
    }

    protected void set_class(int Class){
        this.Class = Class;
    }

    protected void get_details(){
        System.out.println("Name -> "+get_name());
        System.out.println("Class -> "+Class);
        System.out.println("Roll number -> "+roll_number);
        System.out.println("Age -> "+get_age());

        for(int i=0; i<10; i++){
            if(subjects[i] != null) System.out.print(subjects[i]+", ");
        }
    }
}

public class main{
    public static void main(String[] args){
        Car BMW = new Car("BMWXM");
        Car Ford = new Car("Ford Mastang");

        Bike Splender = new Bike("Splender");
        Bike Java = new Bike("Java");

        // BMW.get_details();
        // System.out.println();
        // Ford.get_details();
        // System.out.println();
        // Splender.get_details();
        // System.out.println();
        // Java.get_details();

        Student om = new Student("Om Prakash", 43, 10, 22);
        om.add_subjects("DBMS", "OS", "CN", "Java", "Software engineering");

        om.get_details();
    }
}