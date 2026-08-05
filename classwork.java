class students{
    String name="om prakash";
    int age = 19;
    float cgpa = 8.05f;
    String contact = "9060146570";
}
class classwork
{
    public static void main(String args[])
    {

        students myObject = new students();

        System.out.println("Students detail");
        System.out.println("Name = "+myObject.name);
        System.out.println("Age = "+myObject.age);
        System.out.println("CGPA = "+myObject.cgpa);
        System.out.println("Contact Number = "+myObject.contact);
    }
}