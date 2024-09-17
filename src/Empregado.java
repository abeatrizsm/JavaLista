public class Empregado {

    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String toString() {
        return "------------------------" +
                "\nNome: " + nome + " " + sobrenome +
                "\nSalário: " + String.format("%.2f", salarioMensal);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0) {
            salarioMensal = 0;
        }
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void fornecerAumento() {
        salarioMensal = salarioMensal * 1.1;
    }

}





