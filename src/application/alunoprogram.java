package application;

import entities.aluno;

import java.util.Scanner;

public class alunoprogram {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        aluno al = new aluno();

        System.out.println("Digite a primeira nota: ");
        al.n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        al.n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        al.n3 = sc.nextDouble();

        System.out.println("Nota final = " + al.notaFinal());
        System.out.println("Situação do aluno = " + al.resultado());
    }
}
