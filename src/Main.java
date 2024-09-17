import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner prompt = new Scanner(System.in);

        PessoaE pessoa1 = new PessoaE();
        pessoa1.setNome("Ana Beatriz");
        pessoa1.setCpf("012.345.678-96");
        pessoa1.setAno((short)2006);
        pessoa1.setAltura(1.50f);

        System.out.println(pessoa1);
        System.out.println("A idade de " + pessoa1.getNome() + " é igual a " + pessoa1.calcularIdade() + " anos.");

        











        //------------ Produtos----------------------------

        // System.out.println("Insira o número de produtos:");
        // int n = prompt.nextInt();
        // Produto produtos[] = new Produto[n];

        // for (int i = 0; i < n; i++) {
        //     Produto produto = new Produto();
        //     System.out.println("Insira o código do produto: ");
        //     produto.codigo = prompt.next();
        //     System.out.println("Insira o peso do produto: ");
        //     produto.peso = prompt.nextFloat();
        //     System.out.println("Insira o valor do produto: ");
        //     produto.valor = prompt.nextDouble();

        //     produtos[i] = produto; 
        // }
        
        // n = n-1;


        // System.out.println("O número de produtos que tem peso maior que 10kg e valor menor que R$50,00, é igual a: " + produtos[n].contar(produtos));
        // System.out.println("A média do peso dos produtos é igual a: " + produtos[n].mediaDosPesos(produtos));
        // System.out.println("O produto mais leve é: ");
        // produtos[n].produtoLeve(produtos);
        // System.out.println("O produto mais caro é: ");
        // produtos[n].produtoCaro(produtos);
        // System.out.println("A media dos valores cujo peso do produto é maior que 10 é igual a: " + produtos[n].mediaValores(produtos));

        // --------------------- conta --------------------------------

        // Conta conta1 = new Conta("987.654.321-03", "041", 19000.50, (byte)1);
        // Conta conta2 = new Conta("912.345.678-90", "312", 129000.99, (byte)2);

        // System.out.println(conta1);
        // System.out.println(conta2);
        // conta1.deposito(300);
        // conta2.saque(6000);
        // conta2.transferencia(conta1, 200);
        // System.out.println(conta1);
        // System.out.println(conta2);

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
