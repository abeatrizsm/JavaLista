public class PessoaE {
    private String nome;
    private String cpf;
    private short anoDeNascimento;
    private float altura;

    public String toString(){
        return "Dados ---------------------- " +
               "\n > Nome: " + nome +
               "\n > CPF: " + cpf +
               "\n > Ano de nascimento: " + anoDeNascimento +
               "\n > Altura: " + altura + "\n" +
               "---------------------------- ";
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setAno(short anoDeNascimento){
        this.anoDeNascimento = anoDeNascimento;
    }
    public short getAno(){
        return anoDeNascimento;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }

    public byte calcularIdade(){
        byte idade = (byte)(2024 - anoDeNascimento);
        return idade;
    }
}
