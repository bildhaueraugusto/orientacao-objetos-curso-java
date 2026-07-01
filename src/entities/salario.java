package entities;

public class salario {

    public String name;
    public double salarioBruto;
    public double taxa;
    public int incremento;

    public double novoSalario() {
        return salarioBruto - taxa;
    }

    public void salarioIncremento(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String toString () {
        return name + ", $" + String.format("%.2f", novoSalario());
    }
}
