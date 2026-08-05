import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Sample class that implements Serializable
class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() method for better output
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectIO {
    public static void main(String[] args) {
        Student student = new Student("Om", 21);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {

            // Writing object to the file
            oos.writeObject(student);
            System.out.println("Object written to file successfully.");

            // Reading object from the file
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println(deserializedStudent + " - Object read from file successfully.");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
