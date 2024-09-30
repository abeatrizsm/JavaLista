public class Elevador {

    private byte andarAtual;
    private byte totalAndares;
    private byte capacidade;
    private byte pessoas;

    public void setAndarAtual(byte andarAtual) {
        this.andarAtual = andarAtual;
    }
    public byte getAndarAtual() {
        return andarAtual;
    }
    public void setCapacidade(byte capacidade) {
        this.capacidade = capacidade;
    }
    public byte getCapacidade() {
        return capacidade;
    }
    public void setPessoas(byte pessoas) {
        this.pessoas = pessoas;
    }
    public byte getPessoas() {
        return pessoas;
    }
    public void setTotalAndares(byte totalAndares) {
        this.totalAndares = totalAndares;
    }
    public byte getTotalAndares() {
        return totalAndares;
    }

    public Elevador(byte capacidade, byte totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    public void entra(){
        if (capacidade > pessoas) {
            pessoas += 1;
        }
        else{
            System.out.println("O elevador está cheio.");
        }
    }
    public void sai(){
        if (pessoas > 0) {
            pessoas -= 1;
        }
        else{
            System.out.println("O elevador está vazio.");
        }
    }

    public void sobe(){
        if (andarAtual < totalAndares - 1) {
            andarAtual += 1;
        }
        else{
            System.out.println("O elevador está no ultimo andar");
        }
    }

    public void desce(){
        if (andarAtual > 0 ) {
            andarAtual -= 1;
        }
        else{
            System.out.println("O elevador está no último andar");
        }
    }



}
