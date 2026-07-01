package application;

import entities.produto;
import entities.retangulo;

import java.util.Scanner;

public class retanguloprogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        retangulo ret = new retangulo();

        System.out.println("Entre com os dados do triângulo:");
        System.out.println("Largura: ");
        ret.largura = sc.nextDouble();
        System.out.println("Altura: ");
        ret.altura = sc.nextDouble();

        System.out.println("Área do Retângulo: " + ret.areaRetangulo());
        System.out.println("Diagonal do Retângulo: " + ret.diagonalRetangulo());
        System.out.println("Perímetro do Retângulo: " + ret.perimetroRetangulo());
    }
}
