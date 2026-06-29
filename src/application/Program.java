package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as medidas do triângulo A: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com as medidas do triângulo B: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX- xB) * (pX - xC));

        pX = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(pX * (pX - yA) * (pX - yB) * (pX - yC));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);
        System.out.println();

        if (areaX > areaY) {
            System.out.println("Área maior triângulo: " + areaX);
        }
        else {
            System.out.println("Área maior triângulo: " + areaY);

        }

        sc.close();
    }
}
