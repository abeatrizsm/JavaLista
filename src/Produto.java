public class Produto {
    String codigo;
    float peso;
    double valor;

    Produto produtos[];

    public String toString(){
        return "--------- Informações do produto ----------" + 
               "\nCódigo: " + codigo + 
               "\nPeso: " + peso + 
               "\nValor: " + valor + 
               "\n-------------------------------------------";
    }

    public int contar(Produto produtos[]){
        int contagem = 0;
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i].peso > 10 && produtos[i].valor < 50){
                contagem++;
            }
        }
        return contagem;
    } 

    public double mediaDosPesos(Produto produtos[]){
        double media = 0;
        for (int i = 0; i < produtos.length; i++) {
            media += produtos[i].peso;
        }
        media = media/produtos.length;
        return media;
    }

    public void produtoLeve(Produto produtos[]){
        Produto maisLeve = produtos[0];
        float pesoLeve = produtos[0].peso;
        for (int i = 1; i < produtos.length; i++) {
            if (pesoLeve > produtos[i].peso) {
                pesoLeve = produtos[i].peso;
                maisLeve = produtos[i];
            } 
        }
        System.out.println(maisLeve);
    }
    public void produtoCaro(Produto produtos[]){
        Produto maisCaro = produtos[0];
        double valorAlto = produtos[0].valor;
        for (int i = 1; i < produtos.length; i++) {
            if(produtos[i].valor > valorAlto){
                valorAlto = produtos[i].valor;
                maisCaro = produtos[i];
            }
            System.out.println(maisCaro);
        }
    }
    public double mediaValores(Produto produtos[]){
        double mediaValor = 0;
        int quantidade = 0;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].peso > 10) {
                mediaValor += produtos[i].valor;
                quantidade++;
            }
        }
        mediaValor = mediaValor/quantidade;
        return mediaValor;
    }
}
