package application;

import entities.dolar;

import java.util.Scanner;

public class dolarprogram {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        dolar dol = new dolar();

        System.out.println("Qual a cotação do Dolar: ");
        dol.precoDolar = sc.nextDouble();
        System.out.println("Quantos dolares quer converter: ");
        dol.valorReal = sc.nextDouble();

        System.out.println("Valor em real: " + dol.valorDolar());
    }
}
