//disponibiliza mais de uma versão para uma mesma operação, assim podendo já iniciar o produto com 0 unidades, seguindo o padrão.

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.product;

public class sobrecargaproduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.println();

        product product = new product(name, price);

        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");

        int quantity = sc.nextInt();
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
