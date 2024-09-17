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
        
    }


}
