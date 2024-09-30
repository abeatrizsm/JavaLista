import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
         Scanner prompt = new Scanner(System.in);

        //---------------------- Imóvel ---------------------------------------------------------------------

        //  Imovel imovel = new Imovel((byte)2 , "Marilene", 25.00, true, (short)1902, 1900500);         
        //  Imovel imovel2 = new Imovel((byte)1, "Claudia", 100.00, false, (short)1989, 500000);         
        //  Imovel imovel3 = new Imovel((byte)2, "Ana", 75.00, true, (short)2006, 150000);         

        
        // System.out.println(imovel);
        // System.out.println("Valor do IPTU:" + imovel.calcularIptu());
        // System.out.println("Idade do imóvel: " + imovel.idadeImovel());
        // System.out.println("Valor de venda: " + imovel.valorDeVenda());

        //---------------------- Turma ---------------------------------------------------------------------
        
        // String alunos[] = {"Ana", "Beatriz", "Luisa"};
        // int idade[] = {19,20,30};
        // float medias[] = {8, 10, 5.5f};

        // Turma turma = new Turma(alunos,idade,medias);

        // System.out.println("Aluno mais novo: " + turma.maisNovo());
        // System.out.println("Numero de aprovados: " + turma.aprovados());
        // System.out.println("Idade do mais velho: " + turma.idadeMaisVelho());

        //---------------------- Data ---------------------------------------------------------------------
        
        //   Data data = new Data(23,1,2006);
        //   Data data2 = new Data(23,1,2006);
        //   Data data3 = new Data(23,1,2005);

        //   System.out.println(data);
        //   System.out.println(data.datasIguais(data2));
        //   System.out.println(data2.datasIguais(data3));  
        //   System.out.println(data3.vemAntes(data));        

        //---------------------- Ponto2D ---------------------------------------------------------------------

        //  Ponto2D ponto1 = new Ponto2D(5,6);
        //  Ponto2D ponto2 = new Ponto2D(5,6);
        //  Ponto2D ponto3 = new Ponto2D(7,8);

        //  ponto1.pontosIguais(ponto2);
        //  System.out.println("A distância entre os pontos é: " + String.format("%.2f", ponto3.distancia(ponto1)));
        
        //---------------------- Invoice ---------------------------------------------------------------------

        //  Invoice invoice = new Invoice("DNF@#A23kL", 20, 239.99);
        //  System.out.println(invoice);
        //  invoice.setPreco(-23.99);
        //  invoice.setQuantidade(-10);
        //  System.out.println(invoice);

        // -------------------- empregado -----------------------------------------------------------------

        // Empregado empregado1 = new Empregado("Beatriz", "Silveira", 100000);
        // Empregado empregado2 = new Empregado("Bia", "Bioca", 100000);

        // System.out.println("Salário sem aumento: " + empregado1.getSalarioMensal());
        // empregado1.fornecerAumento();
        // System.out.println("Salário com aumento: " + String.format("%.2f", empregado1.getSalarioMensal()));
        // System.out.println(empregado2);
        // empregado2.setNome("Beatriz");
        // System.out.println(empregado2);
         
        // ----------------------- Pessoa Encapsulada ------------------------------------------------------
        
        // PessoaE pessoa1 = new PessoaE();
        // pessoa1.setNome("Ana Beatriz");
        // pessoa1.setCpf("012.345.678-96");
        // pessoa1.setAno((short)2006);
        // pessoa1.setAltura(1.50f);

        // System.out.println(pessoa1);
        // System.out.println("A idade de " + pessoa1.getNome() + " é igual a " + pessoa1.calcularIdade() + " anos.");

        //------------ Produtos-------------------------------------------------------------------------------

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

        // --------------------- conta ---------------------------------------------------------------------------

        // Conta conta1 = new Conta("987.654.321-03", "041", 19000.50, (byte)1);
        // Conta conta2 = new Conta("912.345.678-90", "312", 129000.99, (byte)2);

        // System.out.println(conta1);
        // System.out.println(conta2);
        // conta1.deposito(300);
        // conta2.saque(6000);
        // conta2.transferencia(conta1, 200);
        // System.out.println(conta1);
        // System.out.println(conta2);

        // --------------- Pessoa ---------------------------------------------------------------------------------
        
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
