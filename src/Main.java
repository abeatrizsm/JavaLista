import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner prompt = new Scanner(System.in);

        Conta conta1 = new Conta("987.654.321-03", "041", 19000.50, (byte)1);
        Conta conta2 = new Conta("912.345.678-90", "312", 129000.99, (byte)2);

        
        System.out.println(conta1);
        System.out.println(conta2);
        conta1.deposito(300);
        conta2.saque(6000);
        conta2.transferencia(conta1, 200);
        System.out.println(conta1);
        System.out.println(conta2);
        

























        // --------------- Pessoa -------------------------
        // Pessoa pessoa1 = new Pessoa();
        // System.out.println("Insira seu nome: ");
        // pessoa1.nome = prompt.next();
        // System.out.println("Insira o ano em que você nasceu");
        // pessoa1.anoDeNascimento = prompt.nextShort();
        // System.out.println("Insira seu peso: ");
        // pessoa1.peso = prompt.nextFloat();
        // System.out.println("Insira sua altura: ");
        // pessoa1.altura = prompt.nextFloat();

        // pessoa1.mostra();
        prompt.close();
    }
}
