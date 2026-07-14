package application;

import java.util.Locale;
import java.util.Scanner;

import entities.productencaps;

public class encapsproduct {

    public static void main(String[] args) {

        // product.name = "name" -> não vai funcionar pq agora o campo name é privado.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        System.out.println();

        productencaps product = new productencaps(name, price, quantity);

        System.out.println("Product data: " + product);
        System.out.println();

        // Testando o setter: agora que o objeto já existe, dá pra alterar o nome
        product.setName("Computer");
        System.out.println("Name updated via setName: " + product.getName());
        System.out.println();
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

        System.out.print("Enter the number of products to be added in stock: ");

        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        sc.close();
    }
}