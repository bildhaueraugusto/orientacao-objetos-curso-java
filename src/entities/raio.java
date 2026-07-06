package entities;

public class raio {

    public static final double pi = 3.14159;

    public double circunferenciamet(double raio) {
        return 2 * pi * raio;
    }

    public double volumememet(double raio) {
        return 4 * pi * raio * raio * raio / 3;
    }
}
