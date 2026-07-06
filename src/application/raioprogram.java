package application;

import java.util.Locale;
import java.util.Scanner;

public class raioprogram {

    public static final double PI = 3.14159; // utilizamos o FINAL pois o valor de pi nunca vai ser trocado, sempre vai se manter igual
    //constante = sempre com letra maiuscula.

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do Raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);

        sc.close();
    }

    public static double circunferencia(double raio) {
        return 2 * PI * raio;
    }
    public static double volume(double raio) {
        return 4 * PI * raio * raio * raio / 3;
    }

}
