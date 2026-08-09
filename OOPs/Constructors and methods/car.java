class brand{
    private String brand_name;
    private String model;
    private long price;

    brand(){
        brand_name = null;
        model = null;
        price = 0;
    }

    brand(String brand, String model, long price){
        this.brand_name = brand;
        this.model = model;
        this.price = price;
    }

    void set_brand(String b){
        brand_name = b;
    }

    void set_model(String m){
        model = m;
    }

    void set_price(long p){
        price = p;
    }

    void get_car_details(){
        System.out.println("Brand Name: " + brand_name);
        System.out.println("Model Name: " + model);
        System.out.println("Price Name: " + price);
        System.out.println("");
    }
}

public class car{
    public static void main(String[] args) {
        brand BMW = new brand("BMW", "x2", 50000000);
        BMW.get_car_details();
        BMW.set_price(50);
        BMW.get_car_details();
    }
}