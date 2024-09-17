public class Invoice {
    private String identificador;
    private int quantidade;
    private double preco;

    public Invoice(String identificador, int quantidade, double preco) {
        this.identificador = identificador;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            quantidade = 0;
        }
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            preco = 0.0;
        }
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public double calcularFatura() {
        double fatura = preco * quantidade;
        return fatura;

    }

    public String toString() {
        return "_________________________________________" +
                "\nIdentificador: " + identificador +
                "\nQuantidade: " + quantidade +
                "\nPreço: " + preco +
                "\nValor total: " + String.format("%.2f", calcularFatura()) + 
                "\n_________________________________________";
    }
}

