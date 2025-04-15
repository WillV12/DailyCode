// SuperStore Exercise: Access Modifiers & Object Modeling Focus

// TODO: Define a class called Product with:
class Product{
    // - A protected String field called name
    protected String name;
    // - A protected double field called price
    protected double price;
    // - A private final int productId
    private final int productId;
    // - A public static int nextId to help generate unique IDs
    public static int nextID = 1;
    // - A constructor that sets name, price, and assigns a unique ID
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.productId = nextID;
        nextID++;
    }

    public Product(String name, double price, int productId){
        this.name = name;
        this.price = price;
        this.productId = productId;
    }
    // - Public getters for all fields
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getProductId(){
        return this.productId;
    }


    // - Override toString() to return formatted product details
    @Override
    public String toString(){
        return "Name: " + this.name + "\nPrice: $" + this.price + "\nProduct ID: " + this.productId;
    }

    // - Override equals(Object o) to compare name and productId
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o instanceof Product){
            Product thing = (Product) o;
            if ((thing.name == this.name) && (thing.getProductId() == this.productId)){
                return true;
            } else{
                return false;
            }
        }

        return false;
    }
}


// TODO: Define a subclass Electronics that extends Product
class Electronics extends Product{
    // - Add a private String field called brand
    private String brand;
    // - Add a private boolean field called hasBattery
    private boolean hasBattery;

    // - Constructor takes all fields and uses super for shared ones
    public Electronics(String name, double price, String brand, boolean hasBattery) {
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;
    }
    
    // - Override toString() to include brand and battery status
    @Override
    public String toString(){
        return super.toString() + "\nBrand: " + this.brand + "\nHas Battery: " + this.hasBattery;
    }

}


// TODO: Define a subclass Grocery that extends Product
class Grocery extends Product{
    // - Add a private double field called weight (in kg)
    private double weight;
    // - Add a private boolean field called isPerishable
    private boolean isPerishable;
    // - Constructor takes all fields and uses super for shared ones
    public Grocery(String name, double price, double weight, boolean isPerishable){
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }

    // - Override toString() to include weight and perishability
    @Override
    public String toString(){
        return super.toString() + "\nWeight: " + this.weight + "\nIs Perishable: " + this.isPerishable;
    }
}


// TODO: Define a final class Toy that extends Product
final class Toy extends Product{
    // - Add a private int field called minAge
    private int minAge;
    // - Constructor takes all fields and uses super for shared ones
    public Toy(String name, double price, int minAge){
        super(name, price);
        this.minAge = minAge;
    }
    // - Override toString() to include minAge
    @Override
    public String toString(){
        return super.toString() + "\nMinimum Age: " + this.minAge;
    }

}


// TODO: Define class SuperStoreTest with a main method
public class SuperStoreTest{
    public static void main(String[] args) {
        // - Create at least one instance of each subclass
        Electronics phone = new Electronics("IPhone 10", 1000, "Apple", true);
        Grocery pear = new Grocery("Pear", .30, .15, true);
        Toy lawnDart = new Toy("Lawn Dart", 14.00, 5);
        
        // - Store them in a Product[] array
        Product[] products = {phone, pear, lawnDart};
        // - Loop through and print each item
        for (Object item: products){
            System.out.println(item.toString());
            System.out.println("\n");

        }
        // - Call equals() to compare two products with the same ID and name
        System.out.println("\n=== Result of calling .equals() for two products of the same name and ID");
        Product a1 = new Product("Test", 12.00, 100);
        Product a2 = new Product("Test", 2.50, 100);
        
        System.out.println("a1.equals(a2): " + a1.equals(a2));
        System.out.println("a1.equals(a1): " + a1.equals(a1));
        System.out.println("a1.equals(phone): " + a1.equals(phone));
    }
}


// Additional TODOs:
// 1. Try to extend Toy — what happens and why?
// I tried extending Toy and got an error. This was due to Toy being final meaning it cannot be extended.

// 2. Make a class Coupon with a final discountRate and apply it to a Product

class Coupon{
    // 3. Add a method to Electronics called warrantyInfo() and mark it final
    // 4. Use access modifiers appropriately and explain your choices in comments
}
