package application;

import entities.produto;

import java.util.Locale;
import java.util.Scanner;

public class produtoprogram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        produto pro = new produto();

        System.out.println("Entre com os dados do produto:");
        System.out.print("Name: ");
        pro.name = sc.nextLine();
        System.out.print("Preço: ");
        pro.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        pro.quantidade = sc.nextInt();

        System.out.println(pro.name + ", " + pro.preco + ", " + pro.quantidade + ".");
        //ver a diferença de saída dos dois, o segundo sai td como string, pq foi solicitado na entidade produto
        System.out.println("Dados do Produto: " + pro);

        System.out.println("Entre com o número de produtos para ser adicionado ao estoque: ");
        int quantidade = sc.nextInt();
        pro.adicionarProdutos(quantidade);
        System.out.println("Dados do Atualizados: " + pro);

        System.out.println();

        System.out.println("Entre com o número de produtos para ser removido ao estoque: ");
        int quantidadeneg = sc.nextInt();
        pro.removerProdutos(quantidadeneg);
        System.out.println("Dados do Atualizados: " + pro);



        sc.close();
    }
}
