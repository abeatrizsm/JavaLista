public class Imovel {
    private byte tipo;
    private String proprietario;
    private double tamanho;
    private boolean identificador;
    private short anoConstrucao;
    private double valorCompra;

    public Imovel(byte tipo, String proprietario, double tamanho, boolean identificador, short anoConstrucao, double valorCompra){
        this.tipo = tipo;
        this.proprietario = proprietario;
        this.tamanho = tamanho;
        this.identificador = identificador;
        this.anoConstrucao = anoConstrucao;
        this.valorCompra = valorCompra;

    }
    public void setTipo(byte tipo){
        this.tipo = tipo;
    }
    public byte getTipo(){
        return tipo;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    public double getTamanho(){
        return tamanho;
    }
    public void setIdentificador(boolean identificador) {
        this.identificador = identificador;
    }
    public boolean getIdentificador(){
        return identificador;
    }
    public void setAnoConstrucao(short anoConstrucao){
        this.anoConstrucao = anoConstrucao;
    }
    public short anoConstrucao(){
        return anoConstrucao;
    }
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    public double getValorCompra() {
        return valorCompra;
    }

    public double calcularIptu(){
        double iptu = 0;
        if (tipo == 1){ // 1 - casa 
            if (tamanho <= 100) {
                iptu = valorCompra * 0.01;
            }
            else{
                iptu = valorCompra * 0.03;
            }
        }
        else if (tipo == 2){
            if (tamanho <= 100) {
                iptu = valorCompra * 0.02;
            }
            else{
                iptu = valorCompra * 0.05;
            }
        }
        return iptu; 
    }

    public double valorDeVenda(){
        double preco = 0;
        if (identificador == true){  
            if (tamanho <= 100) {
                preco = valorCompra * 1.10;
            }
            else{
                preco = valorCompra * 1.80;
            }
        }
        else {
            if (tamanho <= 100) {
                preco = valorCompra * 1.05;
            }
            else{
                preco = valorCompra * 1.20;
            }
        }
        return preco;
    }
    
    public short idadeImovel(){
        short idade = (short)(2024 - anoConstrucao);
        return idade;
    }
    public String toString() {
        String iden;
        String tip; 

        if (tipo == 1) {
            tip = "Casa";
        }
        else{
            tip = "Apartamento";
        }
        if (identificador == true) {
            iden = "Area nobre.";
        }
        else{
            iden = "Area comum";
        }
        return "Tipo do imóvel: " + tip + 
               "\nNome do proprietário: " + proprietario + 
               "\nTamanho do imóvel: " + tamanho + 
               "\nidentificador: " + iden + 
               "\nAno de construção: " + anoConstrucao + 
               "\nValor da compra: " + valorCompra;
    }

    


}
