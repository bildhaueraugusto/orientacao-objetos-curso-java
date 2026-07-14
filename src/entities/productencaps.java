package entities;

public class productencaps {

    private String name;
    private double price;
    private int quantity;

    public productencaps(String nome, double price, int quantity) {
        this.name = nome;
        this.price = price;
        this.quantity = quantity;
    }

    public productencaps(String nome, double price) {
        this.name = nome;
        this.price = price;
        // quantity fica 0 por padrão (valor default de int), então não precisa setar aqui.
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}