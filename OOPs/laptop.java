class brand{
    private final String brand;
    private String RAM;
    private String processor;
    private long price;

    public brand(String brand, String ram, String processor, long price) {
        this.brand = brand;
        this.RAM = ram;
        this.processor = processor;
        this.price = price;
    }

    void set_RAM(String ram){
        this.RAM = ram;
    }
    void set_processor(String processor){
        this.processor = processor;
    }
    void set_price(long price){
        this.price = price;
    }

    void get_RAM(){
        System.out.println("RAM in "+brand+"is "+RAM);
    }

    void get_prcessor(){
        System.out.println("Processor in "+brand+"is "+processor);
    }
    void get_price(){
        System.out.println("Price of "+brand+"laptop is "+price);
    }

    void get_details(){
        System.out.println("Brand: "+brand);
        System.out.println("RAM: "+RAM);
        System.out.println("Processor: "+processor);
        System.out.println("Price: "+ price);
    }
}

public class laptop{
    public static void main(String[] args) {
        brand hp = new brand("hp", "DDR4 4gb", "i3", 55000);
        brand Dell = new brand("Dell", "DDR4 4gb", "i7", 75000);

        hp.get_details();
        hp.set_price(49000);
        System.out.println("");
        hp.get_details();
        System.out.println("");
        Dell.get_details();
    }
}