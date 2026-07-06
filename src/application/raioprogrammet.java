package application;

import entities.raio;

import java.util.Locale;
import java.util.Scanner;

import static application.raioprogram.volume;
import static entities.raio.pi;

public class raioprogrammet {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        raio calc = new raio();

        System.out.println("Entre com o valor do Raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferenciamet(raio);
        double v = calc.volumememet(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", pi);

        sc.close();
    }

}