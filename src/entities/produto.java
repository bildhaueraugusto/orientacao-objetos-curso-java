package entities;

public class produto {

    public String name;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque() {
        double val = preco * quantidade;
        return val;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade; // usamos o this. para dizer que estamos usando o atributo original, se não quiser utilizar o this, mudar o nome da variável que está em parenteses no método
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return name
                + ", preço: $"
                + String.format("%.2f", preco) //assim para ficar com duas casa depois da vírgula, primeiro quantas casa quer deixar e depois a variável
                + ", "
                + quantidade
                + " unidades, total: $"
                + valorTotalEstoque();
    }

}
