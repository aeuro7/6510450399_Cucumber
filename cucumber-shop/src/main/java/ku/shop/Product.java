package ku.shop;

public class Product {
    private double price;
    private String name;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void cutStock(int quantity) {
        stock -= quantity;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void cutStock2(int quantity) throws NotEnoughStock {
        if (getStock() >= quantity){
            cutStock(quantity);
        }
        else {
            throw new NotEnoughStock("Not enough stock available for this item.");
        }
    }

}
