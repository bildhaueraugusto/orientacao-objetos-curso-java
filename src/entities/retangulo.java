package entities;

public class retangulo {

    public double altura;
    public double largura;

    public double areaRetangulo() {

        return altura * largura;
    }

    public double perimetroRetangulo() {

        return (altura * 2) + (largura * 2);
    }

    public double diagonalRetangulo() {

        double dia = (altura * altura) + (largura * largura);
        return Math.sqrt(dia);
    }
}
