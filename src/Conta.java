public class Conta {
    String cpf;
    String numeroRepresentativo;
    double saldo; 
    byte tipo;

    public double bonificacao(){
        double bonus = 0;
        if (tipo == 1) {
            bonus = saldo * 0.05; 
        }
        else if (tipo == 2) {
            bonus = saldo * 0.1;
        }
        return bonus;
    }

    public void saque(double valor){
        saldo -= valor;
    }

    public void deposito(double valor){
        saldo += valor;
    }
    public void transferencia(Conta outraConta, double valor){
        
        if (saldo<valor) {
            System.out.println("Saldo insuficiente.");  
        }
        else{
        this.saldo -= valor;
        outraConta.saldo += valor;
        }
    }

    public String toString(){
        return "O CPF do correntista é: " +  cpf +
               "\nNúmero representativo do banco: " + numeroRepresentativo + 
               "\nSaldo: " + saldo;
    }

    public Conta(String cpf, String numeroRepresentativo, double saldo, byte tipo){
        this.cpf = cpf;
        this.numeroRepresentativo = numeroRepresentativo;
        this.saldo = saldo;
        this.tipo = tipo;  
    }
}
