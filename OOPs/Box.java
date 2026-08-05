class Dimensions{
    private int length;
    private int breadth;
    private int height;
    private float radius;
    private final float pie = 3.14f;
    private int shape_finder=0;

    Dimensions(int l, int b, int h){
        this.length = l;
        this.breadth = b;
        this.height = h;
        this.shape_finder = 1;
    }

    Dimensions(int r, int h, String cylinder) {
        this.radius = r;
        this.height = h;
        this.shape_finder = 2;
    }

    Dimensions(int l, int b){
        this.length = l;
        this.breadth = b;
        this.shape_finder = 3;
    }

    Dimensions(int l, String cube) {
        this.length =l;
        shape_finder = 4;
    }

    Dimensions(int r) {
        this.radius = r;
        shape_finder = 5;
    }

    protected void area(){
        if(shape_finder == 3){
            System.out.println("Area = "+ length*breadth);
        }else if(shape_finder == 5){
            System.out.println("Area of circle = "+ pie*radius*radius);
        }else{
            System.out.println("Method not allowed");
        }
    }

    protected void perimeter(){
        if(shape_finder == 3){
            System.out.println("Perimater = "+ length+length+breadth+breadth);
        }else{
            System.out.println("Method not allowed");
        }
    }

    protected void total_surface_area(){
        if(shape_finder == 1){
            int result = (length*breadth + breadth*height + height*length)*2;
            System.out.println("Total surface area = "+ result);
        }else if(shape_finder == 2){
            System.out.println("Total surface area of Cylinder = "+ 2*radius*pie*height);
        }else if(shape_finder == 4){
            System.out.println("Total surface area of Cube = "+ 6*length*length);
        }else{
            System.out.println("Method not allowed");
        }
    }

    protected void volume(){
        if(shape_finder == 1){
            int result = length*breadth*height;
            System.out.println("Volume = "+ result);
        }else if(shape_finder == 2){
            System.out.println("Volume of Cylinder = "+ radius*radius*pie*height);
        }else if(shape_finder == 4){
            System.out.println("Volume of Cube = "+ length*length*length);
        }else if(shape_finder == 5){
            System.out.println("Volume of Sphere = "+ 4/3*radius*radius*radius*pie);
        }else{
            System.out.println("Method not allowed");
        }
    }

    protected void circumference(){
        if(shape_finder == 5){
            System.out.println("Circumference of circle: "+2*pie*radius);
        }else{
            System.out.println("Method not allowed");
        }
    }
}

public class Box{
    public static void main(String[] args) {
        Dimensions cube = new Dimensions(4, "cube");
        Dimensions cuboid = new Dimensions(4, 5, 6);
        Dimensions rectangle = new Dimensions(6, 7);
        Dimensions square = new Dimensions(3, 3);
        Dimensions circle = new Dimensions(5);
        Dimensions cylinder = new Dimensions(3, 12, "cylinder");

        System.out.println("Cube");
        cube.area();
        cube.perimeter();
        cube.volume();
        cube.total_surface_area();
        cube.circumference();
        System.out.println("");

        System.out.println("cuboid");
        cuboid.area();
        cuboid.perimeter();
        cuboid.volume();
        cuboid.total_surface_area();
        cuboid.circumference();
        System.out.println("");
        
        System.out.println("rectangle");
        rectangle.area();
        rectangle.perimeter();
        rectangle.volume();
        rectangle.total_surface_area();
        rectangle.circumference();
        System.out.println("");

        System.out.println("square");
        square.area();
        square.perimeter();
        square.volume();
        square.total_surface_area();
        square.circumference();
        System.out.println("");

        System.out.println("circle");
        circle.area();
        circle.perimeter();
        circle.volume();
        circle.total_surface_area();
        circle.circumference();
        System.out.println("");

        System.out.println("Cylinder");
        cylinder.area();
        cylinder.perimeter();
        cylinder.volume();
        cylinder.total_surface_area();
        cylinder.circumference();
        System.out.println("");
    }
}