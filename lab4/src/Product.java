package lab4;
/**
 *
 * @author Maria
 */
public class Product {
    private String name;
    private double price;
    private String manufacture;
    
    public Product(String name, double price, String manufacture) {
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getManufacture() {
        return manufacture;
    } 
    @Override
    public String toString() {
        return "Название: " + name + " Цена: " + price + " Производитель: " + manufacture;
    }
}
