package application;

import entities.salario;

import java.util.Scanner;

public class salarioprogram {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        salario sal = new salario();

        System.out.println("Digite o nome: ");
        sal.name = sc.nextLine();
        System.out.println("Digite o salário bruto: ");
        sal.salarioBruto = sc.nextDouble();
        System.out.println("Digite a taxa: ");
        sal.taxa = sc.nextDouble();

        System.out.println("Novo salário = " + sal.novoSalario());

        System.out.println("Digite um incremento: ");
        double porcentagem = sc.nextDouble();
        sal.salarioIncremento(porcentagem);
        System.out.println("Salário com incremento = " + sal);

    }
}
