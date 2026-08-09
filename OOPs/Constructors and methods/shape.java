class Rectangle{
    private final int width;
    private final int height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    void area(){
        System.out.println("Area of rectangel: " + width*height);
    }

    void perimeter(){
        System.out.println("Perimeter of rectangle: " + 2*(width + height));
    }
}

class Circle{
    private final int radius;
    private final float pie = 3.14f;
    private final String obj_name;

    Circle(int r, String obj){
        radius = r;
        obj_name = obj;
    }

    void circum(){
        System.out.println("Circumference of "+ obj_name +": " + 2*pie*radius);
    }
    void area(){
        System.out.println("Area of "+ obj_name +": " + pie*radius*radius);
    }
}

public class shape{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(2,5);
        Circle c1 = new Circle(3, "c1");
        rect1.area();
        rect1.perimeter();
        System.out.println();
        c1.circum();
        c1.area();
    }
}