package entities;

public class product {

    public String name;
    public double price;
    public int quantity;

    public product(String nome, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public product(String nome, double price) {
        this.name = name;
        this.price = price;
        //assim já inicia um ovo produto com a quantidade 0. por padrão, sempre vai ser zero. não precisaria da palavra this.
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