package entities;

public class aluno {

    public String nome;
    public double n1, n2, n3;

    public double notaFinal() {

        double nf = n1 + n2 + n3;
        return nf;

    }

    public String resultado() {

        double nf = n1 + n2 + n3;

        if(nf >= 60) {

            return ("Pass!");

        }
        else {

            double miss = 60 - nf;
            return ("Failed! Missing " + miss + " points.");

        }
    }
}
